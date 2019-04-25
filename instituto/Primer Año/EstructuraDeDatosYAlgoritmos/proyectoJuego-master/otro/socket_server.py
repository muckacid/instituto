from threading import Thread
import socket
import logging


logger = logging.getLogger("SocketServer")

class ClientThread(Thread):
    __BUFFER_SIZE = 1024
    def __init__(self,server,conn,ip,port,listener=None):
        Thread.__init__(self)
        self.ip = ip
        self.port = port
        self.conn = conn
        self.server = server
        self.running = True
        self.listener = listener
    def run(self):
        while self.running:
            data = self.conn.recv(self.__BUFFER_SIZE)
            if not data: # en caso de corte de conexion
                self.conn.close()
                self.server.clients.remove(self)
                self.running = False
                logger.warning("Cerrando conexion en %s:%s", self.ip,self.port)
            logger.debug("Datos de %s:%s : %s" ,self.ip,self.port,data )
            if self.listener is not None:
                self.listener(self,data)
    def send(self,data):
        try:
            self.conn.send(data)
        except socket.error:
            logger.error("Error enviando data.. eliminando de la lista el cliente")
            self.server.clients.remove(self)
            self.conn.close()
            self.running = False


class Server(Thread):
    __IP = '0.0.0.0'
    clients = []
    def __init__(self,port=1334,listener=None):
        Thread.__init__(self)
        self.running = True
        self.port = port
        self.tcpsock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        self.tcpsock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
        self.tcpsock.bind((self.__IP, self.port))
        self.listener = listener

    def run(self):
        logger.info("Servidor de socket para multiples clientes iniciando en %s:%d", self.__IP,self.port)
        while self.running:
            self.tcpsock.listen() # escucha n
            logger.debug("Escuchando un nuevo cliente en el puerto [%d]" , self.port)
            (conn, (ip, port)) = self.tcpsock.accept()
            logger.debug("Nuevo cliente %s:%s " ,ip,port)
            client = ClientThread(self,conn,ip, port,listener=self.listener)
            client.start()
            self.clients.append(client)

    def broadcast(self,data):
        for client in self.clients:
            client.send(data)

if __name__ == "__main__":
    def client_listener(client,data): # applicacion echo
        data = str(data).upper().encode()
        print("SERVER ha enviado lo siguiente:",data)
        client.send(data)

    server = Server(port=1334,listener=client_listener)
    server.start()

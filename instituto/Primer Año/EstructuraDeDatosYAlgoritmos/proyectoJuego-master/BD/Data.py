from BD.Coneccion import Coneccion
from clases.Jugada import Jugada
from clases.Usuario import Usuario

class Data:

    def __init__(self):
        self.con = Coneccion("localhost","root","","juego")

    def crearUsuario(self,name,passwd):
        query = "INSERT INTO usuario VALUES(NULL,'{}',SHA2('{}',0),0);".format(name,passwd)
        self.con.ejecutarInsert(query)

    def obtenerUsuario(self,name,passwd):
        query = "SELECT * FROM usuario WHERE nickname = '{}' AND password = SHA2('{}',0);"\
            .format(name,passwd)
        rs = self.con.ejecutar(query)
        usuario = Usuario()
        if(rs.__len__() == 1):
            usuario.id = rs[0][0]
            usuario.nickName = rs[0][1]
            usuario.passwd = rs[0][2]
            usuario.elo = rs[0][3]
            return usuario
        else:
            return usuario

    def guardarPartida(self,id_jugador1,id_jugador2):
        query = "INSERT INTO partida VALUES(NULL,{},{},NOW());".format(id_jugador1,id_jugador2)
        self.con.ejecutarInsert(query)

    def guardarMovimiento(self,id_jugador_1,id_jugador_2,posicion_1,posicion_2,turno):
        query = "INSERT INTO replay VALUES(NULL,'{}','{}','{}','{}','{}');"\
            .format(id_jugador_1,id_jugador_2,posicion_1,posicion_2,turno)
        self.con.ejecutar(query)

    def obtenerReplay(self,id_partida):
        query = "SELECT usuario.nickname, replay.posicion_x, replay.posicion_y, partida.fecha "\
                "FROM REPLAY "\
                "INNER JOIN usuario ON jugador_id_fk = usuario.id_usuario "\
                "INNER JOIN partida ON partida_id_fk = partida.id_partida "\
                "WHERE partida_id_fk = {};"\
            .format(id_partida)
        rs = self.con.ejecutar(query)
        lista_de_jugadas = []
        for j in rs:
            jugada = Jugada()
            jugada.nombreJugador = j[0]
            jugada.posicion_x = j[1]
            jugada.posicion_Y = j[2]
            jugada.fecha = j[3]
            lista_de_jugadas.append(jugada)
        return lista_de_jugadas


    def existeUsuario(self, nickname):
        query = "SELECT COUNT(nickname) FROM usuario WHERE nickname = '{}'".format(nickname)
        rs = self.con.ejecutar(query)
        if(rs[0][0] == 1):
            print(rs[0][0])
            return False
        else:
            return True


    def actualizarElo(self):
        pass

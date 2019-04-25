
if __name__ == "__main__":
    import socket
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect(('localhost', 1334))
    client_socket.send(input('valor=').encode('utf-8'))
    while 1:
        data = client_socket.recv(512)
        print(data)
        client_socket.close()
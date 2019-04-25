from BD.Data import Data

d = Data()



def juego(jugador_1):
    print("____________________________\n"
          "Inicio sesion jugador 2")
    jugador_2 = iniciarSesion()
    d.guardarPartida(jugador_1.id, jugador_2.id)







def verReplays():
    print("\n"
          "\n"
          "\n"
          "\n"
          "\n"
          "\n"
          "\n   menu de replay")

def crearUsuario():
    while (True):
        while (True):
            nick = input("Ingrese nickName:")
            if (d.existeUsuario(nick)):
                break

        while (True):
            passwd1 = input("Ingrese su contraseña:")
            passwd2 = input("otra vez")
            if (passwd1 == passwd2):
                break
            else:
                print("Contraseñas no coinciden\nIntentelo de nuevo..")

        d.crearUsuario(nick, passwd1)
        break


def menuUsuario():
    while (True):
        print("\n_____________Menu____________\n"
              "1.- Log In\n"
              "2.- Sing Up\n"
              "3.- Salir")

        op = int(input("_____________________\n"
                       "Ingrese opcion\n"
                       "->>>"))
        return op


def menuPrincipal():
    while (True):
        print("__________________________\n"
              "1.- Jugar\n"
              "2.- ver Replay\n"
              "3.- Log out")
        op = int(input("Ingresar opcion:"))
        if (op == 1 or op == 2 or op == 3):
            return op
        else:
            print("Opcion invalida")
def iniciarSesion():
    while (True):
        nombre = input("Ingrese nomobre de usuario:")
        passwd = input("Ingrese contraseña:")
        usuario = d.obtenerUsuario(nombre, passwd)
        if (nombre == usuario.nickName):
            return usuario
        else:
            return usuario
from otro.PUtil import *

if __name__ == "__main__":

    while(True):
        op = menuUsuario()
        if(op == 1):
            jugador_1 = iniciarSesion()
            if(jugador_1.id != 0):
                while (True):
                    print("_______________-\n"
                          "Inició Seson")
                    opi = menuPrincipal()
                    if(opi == 1):
                        juego(jugador_1)
                    elif(opi ==2):
                        verReplays()
                    else:
                        break
            else:
                print("Error en el Inicio de sesión")
        elif(op == 2):
            crearUsuario()
        elif(op == 3):
            exit()
        else:
            print("Opción invalida")
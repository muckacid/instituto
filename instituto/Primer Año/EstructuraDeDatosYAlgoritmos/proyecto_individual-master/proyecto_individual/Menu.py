from BD import *
from Util import *
from K import *

class Menu:

    def __init__(self):
        self.bd = BD()
        self.util = Util()
        self.reglas = K()

    def agregar_cortina(self):
        while (True):
            # VALIDACION DEL ID//////
            num = int(input("Ingrese el ID:"))
            ide = self.util.get_id_formateado(num)


            if not self.bd.existe_cortina(ide):
                print("El id ingresado ya existe intentelo denuevo...")
            else:
                # VALIDACION DEL ANCHO///
                while (True):
                    an = int(input("Ingrese el ancho de la cortina:"))
                    if (an <= self.reglas.MIN_ANCHO and an >= self.reglas.MAX_ANCHO):
                        print("->Ancho invalido")
                    else:
                        break

                # VALIDACION DEL ALTO////
                while (True):
                    al = int(input("Ingrese el alto de la cortina:"))
                    if (al <= self.reglas.MIN_ALTO and al >= self.reglas.MAX_ALTO):
                        print("->Alto invalido")
                    else:
                        break

                # INSTANCIO CORTINA
                cortina = Cortina(ide, an, al)

                # AGREGA CORTINA A LA LISTA
                self.bd.add_cortina(cortina)

                # DATOS DE LA CORTINA AGREGADA
                print("Cortina agregada a la lista")
                print(cortina)

    def listar_cortinas(self):
        print("|   ID", " |   Ancho", "|    Alto|")
        for cortina in self.bd.get_cortinas():
            print(cortina)

    def modificar_cortina(self, id_cortina):
        while (True):
            ancho = int(input("Ingrese el nuevo ancho de la cortina:" + id_cortina))
            if (ancho < self.reglas.MIN_ANCHO or ancho > self.reglas.MAX_ANCHO):
                print("Ancho invalida ingrese nuevamente")
            else:
                break

        while (True):
            alto = int(input("Ingrese el nuevo alto de la cortina:" + id_cortina))
            if (alto < self.reglas.MIN_ALTO or alto > self.reglas.MAX_ALTO):
                print("Ancho invalida ingrese nuevamente")
            else:
                break

        cor = self.bd.modificar_cortina(id_cortina, ancho, alto)

        print("cortina modificada")
        print(cor)

    def buscar_cortinas(self, ide):
        #BUSCAR CORTINA POR ID
        cortina = self.bd.get_cortina_by_id(ide)

        if(cortina is None):
            print("Cortina no encontrada")
        else:
            print(cortina)
            while (True):
                print("----------------------------------------------------"
                      "-----> Si desea modificar esta cortina presione -1\n"
                      "-----> Si desea eliminarla presione             -2\n"
                      "-----> para salir presione                      -3\n")
                op_mod = int(input("->"))

                if (op_mod == 1):
                    print("Modificar cortina")
                    print(cortina)

                    self.modificar_cortina(cortina.get_id())
                elif (op_mod == 2):
                    print("Eliminar cortina__")
                    print(cortina)

                    self.bd.delete_cortina(cortina)
                    print("cortina eliminada...")
                elif (op_mod == 3):
                    break
                else:
                    print("opcion invalida....")

    def show(self):
        while (True):
            # -------MENU GENERAL
            print("-------------------------Menu-------------------------\n"
                  "Opcion .1. Accerder al menu de la lista de cortinas   \n"
                  "Opcion .2. Calculo de materiales                      \n"
                  "Opcion .3. Inventario (En construccion)               \n"
                  "Opcion .4. Salir                                      \n"
                  "------------------------------------------------------\n"
                  "Ingrese su opcion")

            op_a = int(input("->"))

            # ------MENU DE CONTROL DE LA LISTA DE CORTINAS******************************************************************
            if (op_a == 1):
                while (True): # Menú de listas
                    # .........................MENU.............................
                    print("--------------------Menu----------------------------\n"
                          "1.-   Ver lista completa\n"
                          "2.-   Buscar cortina\n"
                          "3.-   Agregar Cortina a la lista\n"
                          "4.-   Salir al menu principal\n"
                          "----------------------------------------------------\n"
                          "Ingrese su opcion")
                    op_b = int(input("->"))
                    print("-----------------------------------------------------")

                    # Muestra la lista completa de cortinas(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                    if (op_b == 1):
                        self.listar_cortinas()
                    # Busca cortinas segun ide((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                    elif (op_b == 2):
                        num = int(input("Ingrese el ID:"))
                        ide = self.util.get_id_formateado(num)

                        self.buscar_cortinas(ide)
                    # Agrega una cortina a la lista(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                    elif (op_b == 3):
                        while(True): # Ciclo para hacer que vuelva a registrar
                            self.agregar_cortina()

                            # MENU PARA SALIR
                            print("Para agregar otra cortina presione 1")
                            print("Para volver al menu anterior presione 2")

                            # OPCIONES PARA SALIR
                            while (True): # Validar que sea 1 o 2
                                op_agregar = int(input("->"))

                                if(op_agregar == 1 or op_agregar == 2):
                                    break
                                else:
                                    print("Ingrese 1 o 2")

                            if (op_agregar == 2):
                                break

                    # Sale al menu principal((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                    elif (op_b == 4):
                        break
                    # Opcion ingresada invalida(((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((
                    else:
                        print("Opcion invalida, vualva a intentarlo")












            # -----CALCULO DE MATERIALES************************************************************************************
            elif (op_a == 2):  # /////////////////////////////////////////////////

                # lista.separar_tubos()

                tubos = 2
                comandos = 3
                tela = 5
                print("\n""TUBOS")
                print("-------------------------------------------------")
                print("La cantidad de tubos que se requieren es   :", tubos)
               # print(lista.imprimir_lista_tubos())
                print("-------------------------------------------------")

                print("La cantidad de comandos que se requieren es:", comandos)
                print("La cantidad de tela que se requiere es     :", tela)


            # ------INVENTARIO***********************************************************************************************
            elif (op_a == 3):
                pass
            # ------SALIR DEL SISTEMA****************************************************************************************
            elif (op_a == 4):
                break
            # ------OPCION INVALIDA******************************************************************************************
            else:
                input("La Opcion ingresada es invalida...\n"
                      "Intentelo denuvo\n")
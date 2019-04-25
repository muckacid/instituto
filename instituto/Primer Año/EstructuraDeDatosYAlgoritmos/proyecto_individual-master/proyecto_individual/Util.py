class Util:

    def get_id_formateado(self,id):
        ide = 0
        if (id <= 0 and id >= 999):
            print("El ID es erroneo intentelo denuevo\nintroduzca un numero del 1 al 100")
        elif (id >= 1 and id < 10):
            ide = "C00" + str(id)
        elif (id >= 10 and id < 100):
            ide = "C0" + str(id)
        elif (id >= 100 and id < 999):
            ide = "C" + str(id)
        else:
            print("......")
        return ide
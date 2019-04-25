import datetime


class Jugada:

    def __init__(self):
        self.nombreJugador = ""
        self.posicion_x = 0
        self.posicion_Y = 0
        self.fecha = datetime.date(2018, 1, 1)

    def __str__(self):
        texto = "________________________________________________|\njugador: "+ str(self.nombreJugador) + \
                "- Fecha: "+str(self.fecha)+\
                "\nCoordenada de juego : (" + str(self.posicion_x)+","+str(self.posicion_Y)+")"
        return texto
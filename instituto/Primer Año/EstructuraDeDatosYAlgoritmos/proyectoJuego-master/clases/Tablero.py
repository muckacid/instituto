class Tablero:

    def __init__(self):
        self.tablero = [] # listas con bufer
        self.tablero.append([0,0,0])
        self.tablero.append([0,0,0])
        self.tablero.append([0,0,0])

    def setElemento(self, coordenadaX, coordenadaY, elemento):
        self.tablero[coordenadaY][coordenadaX] = elemento

    def getElemento(self, coordenadaX, coordenadaY):
        return self.tablero[coordenadaY][coordenadaX]

    def comprobador(self):
        if(self.tablero[0][0] == self.tablero[0][1] == self.tablero[0][2] != 0):
            return True
        if(self.tablero[1][0] == self.tablero[1][1] == self.tablero[1][2] != 0):
            return True
        if(self.tablero[2][0] == self.tablero[2][1] == self.tablero[2][2] != 0):
            return True
        if(self.tablero[0][0] == self.tablero[1][1] == self.tablero[2][2] != 0):
            return True
        if(self.tablero[0][2] == self.tablero[1][1] == self.tablero[2][0] != 0):
            return True
        if(self.tablero[0][0] == self.tablero[1][0] == self.tablero[2][0] != 0):
            return True
        if(self.tablero[0][1] == self.tablero[1][1] == self.tablero[2][1] != 0):
            return True
        if(self.tablero[0][2] == self.tablero[1][2] == self.tablero[2][2] != 0):
            return True
        #if(self.fila1[0] == self.fila1[1] and self.fila1[0] == self.fila1[2] and self.fila1[1] == self.fila1[2] and self.fila1[1] != 0):
        #    pass


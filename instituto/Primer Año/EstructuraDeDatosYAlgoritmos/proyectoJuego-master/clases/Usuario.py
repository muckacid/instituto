class Usuario:

    def __init__(self):
        self.id = 0
        self.nickName = " "
        self.passwd = " "
        self.elo = 0

    def __str__(self):
        cadena = "Usuario : {}\n contraseña: {}\n Elo: {}".format(self.nickName,self.passwd,self.elo)
        return cadena

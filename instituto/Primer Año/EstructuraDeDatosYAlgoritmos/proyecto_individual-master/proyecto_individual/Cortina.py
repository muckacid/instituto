class Cortina:

    def __init__(self, id, ancho, alto):
        self.id  = id
        self.ancho = ancho
        self.alto = alto

    def set_id(self, id):
        self.id = id

    def set_ancho(self, ancho):
        self.ancho = ancho

    def set_alto(self, alto):
        self.alto = alto

    def get_id(self):
        return self.id

    def get_ancho(self):
        return self.ancho

    def get_alto(self):
        return self.alto

    def __str__(self):
        dif = 100
        p1 = "|" + str(self.id) + "   |"

        if (self.ancho < dif and self.alto < dif):
            p2 = "      " + str(self.ancho) + " |"
            p3 = "      " + str(self.alto) + "|"
        elif (self.ancho < dif and self.alto >= dif):
            p2 = "      " + str(self.ancho) + " |"
            p3 = "     " + str(self.alto) + "|"
        elif (self.ancho >= dif and self.alto < dif):
            p2 = "     " + str(self.ancho) + " |"
            p3 = "      " + str(self.alto) + "|"
        else:
            p2 = "     " + str(self.ancho) + " |"
            p3 = "     " + str(self.alto) + "|"

        return (p1 + p2 + p3)

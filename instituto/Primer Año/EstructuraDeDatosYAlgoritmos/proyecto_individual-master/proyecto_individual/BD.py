from Cortina import *

class BD:

    def load_objects(self):
        c0 = Cortina("C000", 190, 180)
        c1 = Cortina("C001", 190, 180)
        c2 = Cortina("C002", 190, 180)
        c3 = Cortina("C003", 190, 180)
        c4 = Cortina("C004", 190, 180)
        c5 = Cortina("C005", 190, 180)
        c6 = Cortina("C006", 190, 180)
        c7 = Cortina("C007", 190, 180)

        self.add_cortina(c0)
        self.add_cortina(c1)
        self.add_cortina(c2)
        self.add_cortina(c3)
        self.add_cortina(c4)
        self.add_cortina(c5)
        self.add_cortina(c6)
        self.add_cortina(c7)

    def __init__(self):
        self.cortinas = list()
        self.tubos    = list()

        self.load_objects()

    def add_cortina(self, cortina):
        self.cortinas.append(cortina)

    def add_tubo(self, tubo):
        self.tubos.append(tubo)

    def delete_cortina(self, cortina):
        self.cortinas.pop(self.cortinas.index(cortina))

    # dejar como el delete_cortina
    def delete_tubo(self, index):
        self.tubos.pop(index)

    def get_cortinas(self):
        return self.cortinas

    def get_tubos(self):
        return self.tubos

    def get_cortina_by_id(self,id):
        for cortina in self.cortinas:
            if id == cortina.get_id():
                return cortina

        return None

    def existe_cortina(self, id):
        for cortina in self.cortinas:
            if id == cortina.get_id():
                return True

        return False

    def get_tubos_by_id(self,id):
        pass

    def modificar_cortina(self, id, alto, ancho):
        cor = self.get_cortina_by_id(id)

        cor.set_ancho(ancho)
        cor.set_alto(alto)

        return cor

    # cita de un profe "soluciones inteligentes para situaciones cotidianas" - Miso mierda!



    #////////////////////////////////METODOS PARA LOS CALCULOS
    """
    def imprimir_lista_tubos(self):
    for cortina in self.cortinas:
        tubo = cortina.get_ancho() - cortina.margen_tubo
        print("El tubo de la cortina", cortina.get_id(), "tiene -", tubo, "cm  de Ancho")
    return ""
    """



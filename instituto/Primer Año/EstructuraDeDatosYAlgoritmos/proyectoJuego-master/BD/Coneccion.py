import mysql.connector

class Coneccion:

    def __init__(self,ip,usuario,passwd,nameDataBase):
        try:
            self.conn = mysql.connector.connect(host='localhost', user='root', passwd="", db='juego')
            print("_________-Datos de la connecion:\n"
                  "Host:",ip,"\nUsuario:",usuario,"\nContraseña:",passwd,"\nBase de datos:",nameDataBase)
        except:
            print("error en coneccion(construcctor)")

    def ejecutar(self, query):
        try:
            print(query)
            cursor = self.conn.cursor()
            cursor.execute(query)
            rs = cursor.fetchall()
            cursor.close()
            return rs
        except:
            print("Error en Connecion(ejecutarSelect)")

    def ejecutarInsert(self,query):
        try:
            cursor = self.conn.cursor()
            cursor.execute(query)
            self.conn.commit()
        except:
            print("Error en Connecion(ejecutarInsert)")
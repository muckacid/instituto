class Calcular:

    #margenes del ancho
    margen_ancho = 3
    max_tubo = 600

    #margenes de tela
    max_alto  = 360
    max_ancho = 300
    min_alto  =  60
    min_ancho =  60


    # CALCULO DE TUBOS *************************************************************************************************
    def cant_tubos(self):
        pass
    me va a decir que los colores son enteros
    #fff
    


    # CALCULO DE COMANDOS **********************************************************************************************
    def cant_comandos(self,lista):
        #print("Calcula la cantidad de comandos que se requieren\n""para hacer las cortinas de la lista")
        cant = len(lista)
        return cant

    # FALTA AUN
    # CALCULO DE TELA **************************************************************************************************
    def cant_tela(self, lista):
        cant = 2
        return cant












"""
    def cant_tubos_prueba(self,lista):

        tubo = self.max_tubo


        if len(lista_cortinas) > 0 :
            can_tubos = 1
            for ancho in lista_anchos:
                for sobrante in self.lista_sobrantes:
                    if ancho <= sobrante:
                        print("El tubo de ancho ",ancho," se encuentra en los sobrantes")
                    else:
                        tubo -= ancho
                        print("tubo = ",tubo)
                        if (tubo <= 0):
                            if (tubo == 0):
                                can_tubos += 1
                            else:
                                tubo += ancho
                                self.lista_sobrantes.append(tubo)
                                tubo = self.max_tubo - ancho
                                can_tubos += 1
        else:
            can_tubos = 0
            print("No existen cortinas en la lista")
        return can_tubos
"""

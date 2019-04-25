using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace AutomataCelular
{
    public partial class App : Form
    {
        /// ------------------------------------------------------------------------------
        ///Variables Globales.

        //Tiempo en milisegundos para el timer del cambio en el sistema celular.
        int tiempo = 100; 
        //Color de las celular Vivas
        Color colorCelulaViva = Color.Black;
        //Color de las celulas Muertas
        Color colorCelulaMuerta = Color.White;
        //Dimensiones de la matriz
        int largo = 25;
        //Dimension del pixel que representa la matriz
        int largoPixel = 20;
        //Contador de cambios en el sistema de celulas
        int numeroDeCambiosEnElSistema = 0;
        //Matriz Del Sistema
        int[,] sistema;
        
        /// ----------------------------------------------------------
        
        //Constructor del formulario.
        public App()
        {
            InitializeComponent();
            sistema = new int[largo,largo];
            timer.Interval = tiempo;
            
        }

        //No se que hace este evento.
        private void App_Load(object sender, EventArgs e)
        {

        }

        //Hilo exclusivo para el funcionamiento del sistema de celulas
        private void Timer_Tick(object sender, EventArgs e)
        {
            bool cambio = JuegoDeLaVida();

            if (cambio == true)
                timer.Enabled = false;
            if (cambio == false)
            {
                numeroDeCambiosEnElSistema++;
                lblNumero.Text = numeroDeCambiosEnElSistema.ToString();
                PintarSistema();
            }

        }

        /// ---------------------------------------------------------------
        /// Eventos click action.
        //Boton que carga archivo txt por ahora lo hace con random.
        private void BtnCargar_Click(object sender, EventArgs e)
        {

            ReiniciarSistema();
            //enarRandom();//Funcion Random para llenar sistema de celulas

            string ruta = string.Empty;

            OpenFileDialog fileDialog = new OpenFileDialog();

            if (fileDialog.ShowDialog() == DialogResult.OK)
            {
                ruta = @fileDialog.FileName;
                sistema = LeerArchivoConRuta(ruta);
            }
            
            //sin ruta
            //sistemaCelula = LeerArchivo();
            PintarSistema();
            numeroDeCambiosEnElSistema = 0;
            lblNumero.Text = numeroDeCambiosEnElSistema.ToString();
        }

        //Instancia el hilo para la ejecucion del sistema.
        private void BtnIniciar_Click(object sender, EventArgs e)
        {
            lblNumero.Text = "0";
            timer.Enabled = true;
        }

        //Detiene el hilo de ejecucion.
        private void BtnDetener_Click(object sender, EventArgs e)
        {
            timer.Enabled = false;
        }
        
        /// --------------------------------------------------------------------
        /// Graficos 

        //Pinta el sistema de celulas, recorriendo la matriz y 
        //generando una nueva matriz que va a ser la vieja.
        private void PintarSistema()
        {
            Bitmap bmp = new Bitmap(width: pictureBox1.Width, height: pictureBox1.Height);

            for (int x = 0; x < largo; x++)
            {
                for (int y = 0; y < largo; y++)
                {
                    if (sistema[y, x] == 0)//se puede invertir la x e y para invertir el pintado
                        PintarCelula(bmp, x, y, colorCelulaMuerta);//Celula muerta.
                    else
                        PintarCelula(bmp, x, y, colorCelulaViva); //Celula viva.
                }
            }
            pictureBox1.Image = bmp;
        }

        //Pinta el pixel que representa a la celula.
        private void PintarCelula(Bitmap bmp,int x, int y, Color color)
        {
            for (int i = 0; i < largoPixel; i++)
            {
                for (int j = 0; j < largoPixel; j++)
                {
                    bmp.SetPixel(i + (x * largoPixel), j + (y * largoPixel), color);
                    //bmp.SetPixel(i,j,color);
                }
            }
        }

        //Pintar lineas.
        private void PictureBox1_Paint(object sender, PaintEventArgs e)
        {
            Graphics grafica = e.Graphics;
            Pen lapiz = new Pen(Color.Black);

            for (int i = largoPixel; i < 500; i = i + largoPixel)
            {
                grafica.DrawLine(lapiz,0,i,500,i);
                grafica.DrawLine(lapiz, i, 0, i, 500);
            }

        }
        
        ///----------------------------------------------------------------
        ///

        //Main por asi decir del juego de la vida.
        private bool JuegoDeLaVida()
        {
            int[,] sistemaTemporal = new int[largo, largo];
            //Recorrido general de la matriz.
            for(int x = 0; x < largo; x++)
            {
                for (int y = 0; y < largo; y++)
                {
                    if (sistema[x,y] == 1)//Evaluo ma matriz anterior y cargo la nueva(Temporal).
                        //Almaceno en una matriz temporal el estado futuro de la celula en este momento esta viva.
                        sistemaTemporal[x, y] = Comprobar(x, y, true);
                    else
                        //Almaceno en una matriz temporal el estado futuro de la celula en este momento esta muerta.
                        sistemaTemporal[x, y] = Comprobar(x, y, false);
                }
            }

            int igual = 0;
            for (int x = 0; x < largo; x++)
            {
                for (int y = 0; y < largo; y++)
                {
                    if (sistema[x, y] == sistemaTemporal[x, y])
                        igual++;
                }
            }



            if (igual == 625)
            {
                return true;
            }
            else
            {
                sistema = sistemaTemporal;
                return false;
            }
                

        }
        
        //comprueba las vecinas comparando el etado actual y devuelve 1 o 0 
        //dependiendo de las nomas del juego de la vida.
        private int Comprobar(int x, int y, bool estado)
        {
            /*   v1 - v2 - v3
             *   v4 - ce - v4
             *   v5 - v6 - v7 */

            int vecinasVivas = 0;
            
            // v1
            if (x > 0 && y > 0)
                if (sistema[x - 1, y - 1] == 1)
                    vecinasVivas++;
            //v2
            if (y > 0)
                if (sistema[x, y - 1] == 1)
                    vecinasVivas++;
            //v3
            if (x < largo - 1 && y > 0)
                if (sistema[x + 1, y - 1] == 1)
                    vecinasVivas++;

            //v4
            if (x > 0)
                if (sistema[x - 1, y] == 1)
                    vecinasVivas++;

            //v5
            if (x < largo - 1)
                if (sistema[x + 1, y] == 1)
                    vecinasVivas++;
            //v6
            if (x > 0 && y < largo - 1)
                if (sistema[x - 1, y + 1] == 1)
                    vecinasVivas++;
            //v7
            if (y < largo - 1)
                if (sistema[x, y + 1] == 1)
                    vecinasVivas++;
            //v8
            if (x < largo - 1 && y <largo - 1)
                if (sistema[x + 1, y + 1] == 1)
                    vecinasVivas++;

            //Retorno el numero de vecinas.
            if (estado)
                return (vecinasVivas == 2 || vecinasVivas == 3) ? 1 : 0;
            return (vecinasVivas == 3) ? 1 : 0;
        }

        //Pone todo el sistema en estado 0.
        private void ReiniciarSistema()
        {
            for (int i = 0; i < largo; i++)
            {
                for (int j = 0; j < largo; j++)
                {
                    sistema[i, j] = 0;
                }
            }
        }

        //Funcion dedicada a leer un archivo txt, y devolver una 
        //matriz con su respectivo sistema de celulas, con la ruta
        //enviada como parametro.
        private int[,] LeerArchivoConRuta(string ruta)
        {
            int[,] sistemaDeCelulas = new int[largo, largo];
            var file = new System.IO.StreamReader(@"" + ruta);
            string line;

            for (int fila = 0; (line = file.ReadLine()) != null ; fila++)
            {
                int colum = 0;
                for (int caracter = 0; caracter < line.Length; caracter++)
                {
                    if (line[caracter] != ',')
                    {
                        if (line[caracter] == '0')
                            sistemaDeCelulas[fila, colum] = 0;
                        else
                            sistemaDeCelulas[fila, colum] = 1;
                        colum++;
                    }   
                }

            }


            
            return sistemaDeCelulas;
        }
        
        /// ------------------------------------------------------------
        /// Funciones de prueba
        
        //Funcion dedicada a leer un archivo txt, y devolver una 
        //matriz con su respectivo sistema de celulas.
        private int[,] LeerArchivo()
        {
            int[,] sistemaDeCelulas = new int[largo, largo];
            int contFila = 0;

            string line;

            StreamReader file =
                new System.IO.StreamReader(@"C:\Users\muck\Desktop\Carrera\Año2019(segundo)\Ramo .Net\Tarea 1\ProyectoJuegoDeLaVida\AutomataCelular\AutomataCelular\Resources\miTxt.txt");
            //Iteracion de filas.
            while ((line = file.ReadLine()) != null)
            {
                int contColum = 0;
                //Iteracion de Columnas.
                for (int i = 0; i < 49; i++)
                {
                    if (line[i] == '0' || line[i] == '1')
                    {
                        if (line[i] == '0')
                            sistemaDeCelulas[contFila, contColum] = 0;
                        else
                            sistemaDeCelulas[contFila, contColum] = 1;
                        contColum++;
                    }
                }
                contFila++;
            }
            return sistemaDeCelulas;
        }

        //LLenar el sistema Random.
        private void LlenarRandom()
        {
            Random ran = new Random();
            for (int i = 0; i < largo; i++)
            {
                for (int j = 0; j < largo; j++)
                {
                    sistema[i, j] = ran.Next(0, 2);
                }
            }
        }
        
    }
}

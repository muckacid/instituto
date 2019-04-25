using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;
using SharpGL;
using SharpGL.SceneGraph.Primitives;
using SharpGL.SceneGraph;

namespace Tetera
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

        private double rotation = 0;

        private OpenGL gl = new OpenGL();
        
        private float[] light1posDifusa = new float[] { 0.0f, 20.0f, 10.0f, 1.0f };
        private float[] light2posEspecular = new float[] { 0.0f, 14.0f, -8.0f, .0f };
        
        float[] global_ambient = new float[] { 0f, 0.0f, 0f, -12f };
        float[] lmodel_ambient = new float[] { 2f, 2f, 2f, 1.0f };

        float[] light0pos = new float[] { 8f, 50f, 60f, 4.0f };

        float[] light1specular = new float[] { 4f, 4f, 4f, 1.0f };
        float[] light2ambient = new float[] { 1f, 1f, 1f, 1.0f };
        float[] light3diffuse = new float[] { 0.1f, 0.1f, 0.1f, 1.0f };

        public MainWindow()
        {
            InitializeComponent();
        }

        private void OpenGLControl_OpenGLDraw(object sender, OpenGLEventArgs args)
        {
            gl.Clear(OpenGL.GL_COLOR_BUFFER_BIT | OpenGL.GL_DEPTH_BUFFER_BIT);
            gl.LoadIdentity();
            gl.Translate(0.0f, 0.0f, -8.0f);
            gl.Rotate(rotation, 0.0f, 1.0f, 0.0f);

            Teapot tp = new Teapot();
            tp.Draw(gl, 10, 2, OpenGL.GL_FILL);
            
            rotation += 3.0f;
        }

        private void OpenGLControl_OpenGLInitialized(object sender, OpenGLEventArgs args)
        {
            gl.Enable(OpenGL.GL_DEPTH_TEST);
            
            gl.LightModel(OpenGL.GL_LIGHT_MODEL_AMBIENT, lmodel_ambient);
            gl.LightModel(OpenGL.GL_LIGHT_MODEL_AMBIENT, global_ambient);

            gl.Light(OpenGL.GL_LIGHT0, OpenGL.GL_POSITION, light0pos);
            //gl.Light(OpenGL.GL_LIGHT2, OpenGL.GL_AMBIENT, light2ambient);
            //gl.Light(OpenGL.GL_LIGHT3, OpenGL.GL_DIFFUSE, light3diffuse);
            //gl.Light(OpenGL.GL_LIGHT1, OpenGL.GL_SPECULAR, light1specular);
            gl.Enable(OpenGL.GL_LIGHTING);
            gl.Enable(OpenGL.GL_LIGHT0);

            gl.ShadeModel(OpenGL.GL_SMOOTH);

        }

        private void PosicionDeLuz_Checked(object sender, RoutedEventArgs e){
            gl.Light(OpenGL.GL_LIGHT0, OpenGL.GL_POSITION, light0pos);
            gl.Enable(OpenGL.GL_LIGHT0);
        }

        private void PosicionDeLuz_Unchecked(object sender, RoutedEventArgs e){
            //gl.Light(OpenGL.GL_LIGHT0, OpenGL.GL_POSITION, light0pos);
            gl.Disable(OpenGL.GL_LIGHT0);
        }

        private void LuzEspecular_Checked(object sender, RoutedEventArgs e){
            gl.Light(OpenGL.GL_LIGHT1, OpenGL.GL_SPECULAR, light1specular);
            gl.Light(OpenGL.GL_LIGHT0, OpenGL.GL_POSITION, light2posEspecular);
            gl.Enable(OpenGL.GL_LIGHT1);
            gl.Enable(OpenGL.GL_LIGHT0);

            PosicionDeLuz.IsChecked = false;
        }

        private void LuzEspecular_Unchecked(object sender, RoutedEventArgs e){
            //gl.Light(OpenGL.GL_LIGHT1, OpenGL.GL_SPECULAR, light1specular);
            gl.Disable(OpenGL.GL_LIGHT1);
            gl.Disable(OpenGL.GL_LIGHT0);
        }


        private void LuzAmbiental_Checked(object sender, RoutedEventArgs e){
            gl.Light(OpenGL.GL_LIGHT2, OpenGL.GL_AMBIENT, light2ambient);
            gl.Enable(OpenGL.GL_LIGHT2);
        }

        private void LuzAmbiental_Unchecked(object sender, RoutedEventArgs e){
            //gl.Light(OpenGL.GL_LIGHT2, OpenGL.GL_SPECULAR, light2ambient);
            gl.Disable(OpenGL.GL_LIGHT2);
        }

        private void LuzDifusa_Checked(object sender, RoutedEventArgs e){

            gl.Light(OpenGL.GL_LIGHT3, OpenGL.GL_DIFFUSE, light3diffuse);
            //gl.Light(OpenGL.GL_LIGHT3, OpenGL.GL_POSITION, light1posDifusa);
            gl.Enable(OpenGL.GL_LIGHT3);
        }

        private void LuzDifusa_Unchecked(object sender, RoutedEventArgs e){
            //gl.Light(OpenGL.GL_LIGHT3, OpenGL.GL_SPECULAR, light3diffuse);
            gl.Disable(OpenGL.GL_LIGHT3);
        }
       
        private void ModeloLuzAmbientalGlobal_Checked(object sender, RoutedEventArgs e)
        {
            gl.Light(OpenGL.GL_LIGHT4, OpenGL.GL_LIGHT_MODEL_AMBIENT, global_ambient);
            gl.Enable(OpenGL.GL_LIGHT4);
        }
    }
}

//gl.Enable(OpenGL.GL_DEPTH_TEST);

//gl.LightModel(OpenGL.GL_LIGHT_MODEL_AMBIENT, lmodel_ambient);
//gl.LightModel(OpenGL.GL_LIGHT_MODEL_AMBIENT, global_ambient);

//gl.Light(OpenGL.GL_LIGHT0, OpenGL.GL_POSITION, light0pos);

//gl.Light(OpenGL.GL_LIGHT3, OpenGL.GL_POSITION, light1posDifusa);
//gl.Light(OpenGL.GL_LIGHT1, OpenGL.GL_POSITION, light2posEspecular);

//gl.Light(OpenGL.GL_LIGHT1, OpenGL.GL_SPECULAR, light1specular);
//gl.Light(OpenGL.GL_LIGHT2, OpenGL.GL_AMBIENT, light2ambient);
//gl.Light(OpenGL.GL_LIGHT3, OpenGL.GL_DIFFUSE, light3diffuse);

//gl.Enable(OpenGL.GL_LIGHTING);
////gl.Enable(OpenGL.GL_LIGHT0);
////gl.Enable(OpenGL.GL_LIGHT1);
////gl.Enable(OpenGL.GL_LIGHT2);
////gl.Enable(OpenGL.GL_LIGHT3);
////gl.Enable(OpenGL.GL_LIGHT_MODEL_AMBIENT);

//gl.ShadeModel(OpenGL.GL_SMOOTH);

//float[] light0pos = new float[] { 0.0f, 5.0f, 10f, 1.0f };
//float[] light1specular = new float[] { 0.3f, 0.3f, 0.3f, 1.0f };
//float[] light2ambient = new float[] { 0.2f, 0.2f, 0.2f, 1.0f };
//float[] light3diffuse = new float[] { 0.3f, 0.3f, 0.3f, 1.0f };

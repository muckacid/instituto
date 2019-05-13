using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace WCF_MVC.Controllers{
    public class HomeController : Controller {
        public ActionResult Index(){

            return View();
        }

        public ActionResult ListaLibros(){

            try
            {
                ServicioLibros.Service1Client conn = new ServicioLibros.Service1Client();
                IEnumerable<WCF_MVC.ServicioLibros.LibroSt> lista = conn.GetLibrosBD();
                return View(lista);
            }
            catch
            {
                return Redirect("Index");
            }

        }

        public ActionResult CrearLibro(){

            return View();
        }

        [HttpPost]
        public ActionResult CrearLibro(FormCollection FormCollection){

            try{

                ServicioLibros.Service1Client conn = new ServicioLibros.Service1Client();
                ServicioLibros.LibroSt libro = new ServicioLibros.LibroSt();

                libro.Codigo = FormCollection["Codigo"];
                libro.Titulo = FormCollection["Titulo"];
                libro.ISBN = FormCollection["ISBN"];
                libro.Editorial = FormCollection["Editorial"];
                libro.Numero_de_Paginas = FormCollection["Numero_de_Paginas"];

                conn.SetLibroBD(libro);
                return Redirect("ListaLibros");
            }
            catch{

                return View();
            }
        }
    }
}
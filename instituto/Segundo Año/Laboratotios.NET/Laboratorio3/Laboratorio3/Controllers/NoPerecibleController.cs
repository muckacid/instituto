using Laboratorio3.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Laboratorio3.Controllers
{
    public class NoPerecibleController : Controller
    {

        public static Lista lista = new Lista();

        public ActionResult Listar()
        {
            return View(lista.NoPerecible);
        }
        public ActionResult Detalle(int id)
        {
            NoPerecible prod = lista.GetNoPerecible(id); 
            return View(prod);
        }
        public ActionResult Crear()
        {
            return View();
        }
        // POST: NoPerecible/Create
        [HttpPost]
        public ActionResult Crear(FormCollection FormCollection)
        {
            try
            {
                NoPerecible produc = new NoPerecible();
                produc.Id = lista.NoPerecible.Count;
                produc.Nombre = FormCollection["Nombre"];
                produc.CodBarra = FormCollection["CodBarra"];
                produc.Precio = int.Parse(FormCollection["Precio"]);
                produc.Cantidad = int.Parse(FormCollection["Cantidad"]);
                string na = FormCollection["Estado"];
                if (na.Equals("false"))
                    produc.Estado = false;
                else
                    produc.Estado = true;

                produc.Envasado.Nombre = FormCollection["Envasado.Nombre"];
                produc.Envasado.Descripcion = FormCollection["Envasado.Descripcion"];
                lista.agregarNoPerecible(produc);
                return Redirect("Listar");
            }
            catch
            {
                return View();
            }
        }
    }
}

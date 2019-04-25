using Laboratorio3.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Laboratorio3.Controllers
{
    public class PerecibleController : Controller
    {

        public static Lista lista = new Lista();

        public ActionResult Listar()
        {
            return View(lista.Perecible);
        }

        public ActionResult Detalle(int id)
        {
            Perecible prod = lista.GetPerecible(id);
            return View(prod);
        }
        
        public ActionResult Crear()
        {
            return View();
        }
        
        [HttpPost]
        public ActionResult Crear(FormCollection collection)
        {
            try
            {
                Perecible produc = new Perecible();

                produc.Id = lista.NoPerecible.Count;
                produc.Nombre = collection["Nombre"];
                produc.CodBarra = collection["CodBarra"];
                produc.Precio = int.Parse(collection["Precio"]);
                produc.Cantidad = int.Parse(collection["Cantidad"]);
                string na = collection["Estado"];
                if (na.Equals("false"))
                    produc.Estado = false;
                else
                    produc.Estado = true;
                produc.FechaVencimiento = DateTime.Parse(collection["FechaVencimiento"]);

                lista.agregarPerecible(produc);

                return Redirect("Listar");    
            }
            catch
            {
                return View();
            }
        }
    }
}

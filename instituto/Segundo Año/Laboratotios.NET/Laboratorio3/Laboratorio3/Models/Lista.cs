using System;
using System.Collections.Generic;
using Laboratorio3.Models;
using System.Linq;
using System.Web;

namespace Laboratorio3.Models
{
    public class Lista
    {
        public List<Perecible> Perecible;
        public List<NoPerecible> NoPerecible;

        public Lista()
        {
            this.NoPerecible = new List<NoPerecible>();
            NoPerecible prod = new NoPerecible();
            prod.Id = 0;
            prod.Nombre = "Pan";
            prod.CodBarra = "001001111";
            prod.Precio = 200;
            prod.Cantidad = 2;
            prod.Estado = true;
            prod.Envasado.Nombre = "Vacio";
            prod.Envasado.Descripcion = "xxxxx";

            this.NoPerecible.Add(prod);

            this.Perecible = new List<Perecible>{
                new Perecible()
                {
                    Id = 0,
                    Nombre = "Pan",
                    CodBarra = "John",
                    Precio = 18,
                    Cantidad = 10,
                    Estado = true,
                    FechaVencimiento = new DateTime(2019,4,25)
                }
            };

        }
        /// <summary>
        /// Perecible
        /// </summary>
        
        public void agregarPerecible(Perecible p)
        {
            this.Perecible.Add(p);
        }
        public Perecible GetPerecible(int id)
        {
            return this.Perecible[id];
        }
        /// <summary>
        /// No Perecible
        /// </summary>
        public void agregarNoPerecible(NoPerecible p)
        {
            this.NoPerecible.Add(p);
        }

        public NoPerecible GetNoPerecible(int id)
        {
            return this.NoPerecible[id];
        }
    }
}
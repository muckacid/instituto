using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Web;

namespace Laboratorio3.Models
{
    public class Producto
    {
        private int id;

        [DisplayName("ID")]
        public int Id { get => id; set => id = value; }

        [DisplayName("Nombre")]
        public string Nombre { get; set; }

        [DisplayName("Codigo de Barra")]
        public string CodBarra { get; set; }

        [DisplayName("Precio")]
        public int Precio { get; set; }

        [DisplayName("Cantidad disponible")]
        public int Cantidad { get; set; }

        [DisplayName("Estado")]
        public bool Estado { get; set; }
    }
}
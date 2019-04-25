using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Web;

namespace Laboratorio3.Models
{
    public class Envasado
    {
        public Envasado()
        {
            Nombre = "";
            Descripcion = "";
        }

        [DisplayName("Nombre")]
        public string Nombre { get; set; }

        [DisplayName("Descripcion")]
        public string Descripcion { get; set; }
    }
}
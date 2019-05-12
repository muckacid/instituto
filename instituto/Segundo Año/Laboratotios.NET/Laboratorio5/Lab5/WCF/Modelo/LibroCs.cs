using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WCF.Modelo
{
    public class LibroSt
    {
        public string IdLibro { get; set; }
        public string Codigo { get; set; }
        public string Titulo { get; set; }
        public string ISBN { get; set; }
        public string Editorial { get; set; }
        public string NumPags { get; set; }
    }
}
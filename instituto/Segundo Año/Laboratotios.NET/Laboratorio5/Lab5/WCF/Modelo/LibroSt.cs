using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;

namespace WCF.Modelo
{
    [DataContract]
    public class LibroSt
    {
        [DataMember(Name = "ID")]
        public string IdLibro { get; set; }
        [DataMember(Name = "Codigo")]
        public string Codigo { get; set; }
        [DataMember(Name = "Titulo")]
        public string Titulo { get; set; }
        [DataMember(Name = "ISBN")]
        public string ISBN { get; set; }
        [DataMember(Name = "Editorial")]
        public string Editorial { get; set; }
        [DataMember(Name = "Numero_de_Paginas")]
        [DisplayName("Numero de Paginas")]
        public string NumPags { get; set; }
    }
}
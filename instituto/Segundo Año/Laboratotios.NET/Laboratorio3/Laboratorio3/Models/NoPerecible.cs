using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel;
using System.Linq;
using System.Web;

namespace Laboratorio3.Models
{
    public class NoPerecible : Producto 
    {

        private Envasado envasado;
        public NoPerecible()
        {
            envasado = new Envasado();
        }

        [DisplayName("Envasado")]
        public Envasado Envasado { get => envasado; set => envasado = value; }


    }
}
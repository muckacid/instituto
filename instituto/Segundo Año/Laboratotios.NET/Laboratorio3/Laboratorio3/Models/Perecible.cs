using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel;
using System.Linq;
using System.Web;

namespace Laboratorio3.Models
{
    public class Perecible : Producto
    {

        [Required]
        [DisplayName("dias")]
        public int Dias { get => GetDias(); private set => SetDias(); }

        [Required]
        [DisplayName("Fecha de vencimiento")]
        public DateTime FechaVencimiento { get; set; }
        

        private int GetDias()
        {
            TimeSpan tem = this.FechaVencimiento - DateTime.Now;
            return tem.Days;
        }

        private void SetDias()
        {

        }

    }
}
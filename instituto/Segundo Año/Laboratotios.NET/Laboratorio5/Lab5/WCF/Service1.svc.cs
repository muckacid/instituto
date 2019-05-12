using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using WCF.Modelo;

namespace WCF
{
    // NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "Service1" en el código, en svc y en el archivo de configuración.
    // NOTE: para iniciar el Cliente de prueba WCF para probar este servicio, seleccione Service1.svc o Service1.svc.cs en el Explorador de soluciones e inicie la depuración.
    public class Service1 : IService1 {

        public List<LibroSt> GetLibrosBD(){

            LAb5Entities cont = new LAb5Entities();
            List<LibroSt> libros = new List<LibroSt>();

            foreach (Libro item in cont.Libro.ToList()){
                LibroSt libroSt = new LibroSt();
                libroSt.IdLibro = item.IdLibro.ToString();
                libroSt.Codigo = item.Codigo.ToString();
                libroSt.Titulo = item.Titulo;
                libroSt.ISBN = item.ISBN;
                libroSt.Editorial = item.Editorial;
                libroSt.NumPags = item.NumPags.ToString();
                libros.Add(libroSt);
            }

            return libros;
        }

        public void SetLibroBD(LibroSt lbSt){

            LAb5Entities cont = new LAb5Entities();

            Libro lb = new Libro{
                Codigo = int.Parse(lbSt.Codigo),
                Titulo = lbSt.Titulo,
                ISBN = lbSt.ISBN,
                Editorial = lbSt.Editorial,
                NumPags = byte.Parse(lbSt.NumPags)
            };

            cont.Libro.Add(lb);
            cont.SaveChanges();

        }

    }
}

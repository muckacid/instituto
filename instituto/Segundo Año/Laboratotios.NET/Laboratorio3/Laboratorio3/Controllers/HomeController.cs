using Laboratorio3.Models;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Laboratorio3.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
           
            string keyConfig = ConfigurationManager.AppSettings["titulo"];
            ViewBag.titulo = keyConfig;
            return View();
        }
    }
}
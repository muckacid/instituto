<?php
include_once "file_handler.php";

class ReservacionPelicula extends FileHandler {
    function __construct($file_rute){
        parent::__construct($file_rute);
    }

    function generarReserva($pelicula, $nombre_persona){
        parent::appendContent(date('Y-m-d H:i:s'),$pelicula,$nombre_persona);
    }

    function obtenerReservas(){
        return parent::getContentFromFile();
    }

    function existePelicula($nombrePelicula){
        $lista = $this->getContentFromFile();
        for ($i=0; $i < sizeof($lista); $i++) { 
            $segmentado = explode("|",$lista[$i]);
            if ($segmentado[1] == $nombrePelicula)
                return true;
            else
                return false;
        }
    }

}

?>
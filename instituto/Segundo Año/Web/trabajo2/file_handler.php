<?php
class FileHandler {

    private $COLUMN_SEPARATOR = "|";
    private $file_rute;

    function __construct($file_rute){
        $this->file_rute = $file_rute;
        $f = fopen($file_rute,"r");
        fclose($f);
    }

    function getContentFromFile(){
        $lista = array();
        $f = fopen($this->file_rute, "r");
        while (!feof($f)){
            $linea = fgets($f);
            //$segmentado = explode("|",$linea);
            $lista[] = $linea;
        }
        fclose($f);
        return $lista;
    }

    function appendContent($fecha, $pelicula, $nombrePersona){
        $f = fopen($this->file_rute,"a");
        $cadena = "\n".$fecha.$this->COLUMN_SEPARATOR.$pelicula.$this->COLUMN_SEPARATOR.$nombrePersona;
        fputs($f,$cadena);
        fclose($f);
    }
}

?>
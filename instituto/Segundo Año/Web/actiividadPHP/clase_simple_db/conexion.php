<?php
class Conexion {

    private $host = "localhost";
    private $user = "root";
    private $passwd = "";
    private $db = "clase_simple";

    private $con;

    public function __construct(){
        $this->con = new mysqli($this->host,$this->user,$this->passwd,$this->db);
        if($this->con->connect_error){
            die("Error Conexión!");
        }
    }

    public function getConexion(){
        return $this->con;
    }

}
/*
$conexion = new Conexion();
$c = $conexion->getConexion();

$rs = $c->query("SELECT * FROM usuario");

while($fila = $rs->fetch_assoc()){
    echo $fila['nickname'];
}
*/



?>
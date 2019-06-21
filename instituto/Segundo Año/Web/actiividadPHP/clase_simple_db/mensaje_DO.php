<?php
session_start();

if(!isset($_SESSION['id'])){
    header("Location: error.php");
}

require_once 'conexion.php';
require_once 'data.php';

if($_POST["mensaje"]){
    $id = $_SESSION["id"];
    $mensaje = $_POST["mensaje"];
    $con = new Conexion();
    $data = new Data($con->getConexion());
    $data->crearMensaje($mensaje, $id);
}
header("Location: sistema.php");
?>
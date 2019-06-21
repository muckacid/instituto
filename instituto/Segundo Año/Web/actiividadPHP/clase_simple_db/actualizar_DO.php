<?php
session_start();

if(!isset($_SESSION['id'])){
    header("Location: error.php");
}

require_once 'conexion.php';
require_once 'data.php';

if(isset($_POST["id"]) && isset($_POST["mensaje"])){
    $id = $_POST["id"];
    $mensaje = $_POST["mensaje"];

    $con = new Conexion();
    $data = new Data($con->getConexion());
    
    $data->actualizarById($mensaje, $id);
    header("Location: sistema.php");
}
?>
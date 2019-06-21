<?php
session_start();

if(!isset($_SESSION['id'])){
    header("Location: error.php");
}

require_once 'conexion.php';
require_once 'data.php';

if(isset($_GET["id"])){
    $id = $_GET["id"];
    $con = new Conexion();
    $data = new Data($con->getConexion());
    $data->eliminarById($id);
    header("Location: sistema.php");
}
?>
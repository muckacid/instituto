<?php
require_once 'data.php';


    if(isset($_POST["user"]) && isset($_POST["pass"])) {
        $user = $_POST["user"];
        $pass = $_POST["pass"];
        $con = new Conexion();
        $data = new Data($con->getConexion());
        $existe = $data->isUsuarioValido($user,$pass);
        
        if($existe) {
            session_start();
            $_SESSION["id"] = $data->obtenerIdByNickname($user);
            
            header("Location: sistema.php");
        } else {
            header("Location: index.php?error=asd");
        }
    }

?>
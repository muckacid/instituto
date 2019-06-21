<?php
session_start();

if(!isset($_SESSION['id'])){
    header("Location: error.php");
}

//TODO: INGRESOS NO AUTORIZADOS !!
//TODO: GENERAR EL FORMULARIO PARA AGREGAR UN NUEVO COMENTARIO (el comentario lo genera el usuario)
//TODO: GENERAR EL FORMULARIO ACTUALIZAR

require_once 'conexion.php';
require_once 'data.php';

$con = new Conexion();
$data = new Data($con->getConexion());



?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <a href="mensaje.php">Formulario Ingresar Comentario</a>

    <table border="1">
        <tr>
            <th>Nickname</th>
            <th>Fecha</th>
            <th>Texto</th>
            <th>Acción</th>
        </tr>
        <?php
            $lista = $data->getListaComentarios();
            foreach($lista as $fila){ 
                echo "<tr>";
                echo "<td>".$fila["nickname"]."</td>";
                echo "<td>".$fila["fecha"]."</td>";
                echo "<td>".$fila["txt"]."</td>";
                echo "<td> 
                        <a href='eliminar_DO.php?id=" . $fila["id"] . "'> Eliminar </a>
                        <a href='actualizar.php?id=" . $fila["id"] . "'> Actualizar </a>
                    </td>";
                echo "</tr>";
            }
        ?>
    </table>
</body>
</html>
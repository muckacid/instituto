<?php
session_start();

if(!isset($_SESSION['id'])){
    header("Location: error.php");
}
else{
    $id = $_GET["id"];
    echo "<form action='actualizar_DO.php' method='post'>";
    echo "<textarea name='mensaje' cols='30' rows='10'></textarea>";
    echo "<input type='hidden' name='id' value='".$id."'>";
    echo "<input type='submit' value='Enviar'>";
    echo "</form>";  
}

?>
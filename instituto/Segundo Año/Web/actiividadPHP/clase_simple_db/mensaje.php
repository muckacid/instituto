<?php
session_start();

if(!isset($_SESSION['id'])){
    header("Location: error.php");
}
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
    <form action="mensaje_DO.php" method="post">
        <textarea name="mensaje" cols="30" rows="10"></textarea>
        <br>
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
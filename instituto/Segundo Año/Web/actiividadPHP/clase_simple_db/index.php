<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    
    <form action="validar_DO.php" method="post">
        Usuario: <input type="text" name="user" > <br>
        Contraseña: <input type="password" name="pass" > <br>
        <input type="submit" value="Enviar">
    </form>
    <?php
    if(isset($_GET["error"])){
        echo "ERROR!";
    }
    ?>
</body>
</html>
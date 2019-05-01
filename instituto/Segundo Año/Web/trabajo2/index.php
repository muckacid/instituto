<?php
    require_once('reservacion_pelicula.php');

    $objetoControl = new ReservacionPelicula("registros_de_peliculas.txt");
    $isNombre = false;
    $isPelicula = false;
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>App Reservaciones películas</title>
    <link rel="stylesheet" href="css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body>
    <h1 class="text-center">App Reservaciones películas</h1>
        <hr>
            <?php

                $isNombre = isset($_GET["nombre"]);
                $isPelicula = isset($_GET["pelicula"]);

                if($isNombre && $isPelicula){

                    if($_GET["pelicula"] != "" and $_GET["nombre"] != ""){
                        $existePelicula = $objetoControl->existePelicula($_GET["pelicula"]);
                        if($existePelicula){
                            echo "<div class='p-3 mb-2 bg-danger text-white'>Registros existentes: </div>";
                            }
                        else{
                            $objetoControl->generarReserva($_GET["pelicula"],$_GET["nombre"]);
                            echo "<div class='p-3 mb-2 bg-warning text-white'>Registros agregados exitosamente: </div>";
                        }
                    }
                }
                
            ?>
    <hr>
    <h2 class="bg-light text-dark rounded">Formulario Películas</h2>
    <form action="index.php" method="get">
        <div class="form-group">
            <label for="idPelicula">Película</label>
            <input type="text"class="form-control"  name="pelicula" id="idPelicula">
        </div>
        <div class="form-group">
            <label for="idNombre">Nombre persona</label>
            <input type="text"class="form-control"  name="nombre" id="idNombre">
        </div>
        <input class="btn btn-primary btn-lg btn-block" type="submit" value="Registrar reservación">
    
    </form>
    <hr>
    <h2 class="bg-light text-dark rounded">Películas Reservadas</h2>
    <table class="table  table-light">
        <thead class="thead-dark">
            <tr>
                <th scope="col">#</th> <!-- Numero/conteo de registro -->
                <th scope="col">Fecha Registro</th>
                <th scope="col">Pelicula</th>
                <th scope="col">Nombre Persona</th>
            </tr>
        </thead>
        <tbody>
            <?php
                $contador = 1;
                $lista = $objetoControl->obtenerReservas();
                for ($i=0; $i < sizeof($lista); $i++) { 
                    $segmentado = explode("|",$lista[$i]);
                    echo "
                    <tr>
                        <td>".($i + 1)."</td>
                        <td>".$segmentado[0]."</td>
                        <td>".$segmentado[1]."</td>
                        <td>".$segmentado[2]."</td>
                    </tr>";
                }
            ?>  
            
        </tbody>
    </table>
    
</body>
</html>
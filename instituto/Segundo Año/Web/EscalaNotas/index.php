
<?php   
    require "clases/EscalaNota.php";


    $notaMinima = isset($_GET["notaMinima"]);
    $notaMaxima = isset($_GET["notaMaxima"]);
    $punMax = isset($_GET["puntajeMaximo"]);
    $porEx = isset($_GET["porcentajeExigencia"]);
    $notaAprovacion = isset($_GET["notaAprovacion"]);
    $incremento = isset($_GET["incremento"]);
    $puntaje = isset($_GET["puntaje"]);
    
    //http://localhost/EscalaNotas/?notaMinima=1&notaMaxima=7&puntajeMaximo=100&porcentajeExigencia=60&notaAprovacion=4&incremento=1
    //echo "notaMinima:$notaMinima,notaMaxima:$notaMaxima,puntajeMaximo:$punMax,porcentajeExigencia:$porEx,notaAprovacion:$notaAprovacion,incremento:$incremento";
 
    if($notaMinima && $notaMaxima && $punMax && $porEx && $notaAprovacion && $incremento){
        $escala = new EscalaNota($_GET["notaMinima"],$_GET["notaMaxima"],$_GET["puntajeMaximo"],$_GET["porcentajeExigencia"],$_GET["notaAprovacion"],$_GET["incremento"]);
    }

    if($notaMinima && $notaMaxima && $punMax && $porEx && $notaAprovacion && $incremento && $puntaje){
        $puntaje = $_GET["puntaje"];
        $nota = $escala->calcularNota($puntaje);
        $data = array();
        $data[] = array( "$puntaje" => "$nota");
        echo json_encode($data);
    }
    elseif($notaMinima && $notaMaxima && $punMax && $porEx && $notaAprovacion && $incremento){
        $es = $escala->obtenerEscala();
        echo json_encode($es);
    }

    //Porcentaje de aprovacion , puntaje maximo
    //$nota = new Nota($porcentajeDeExigencia,$puntajeMaximo);



?>

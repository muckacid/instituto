<?php
//π=4 (1- 1/3 + 1/5 - 1/7 + 1/9 - …)

    if(isset($_GET["decimales"])){
        
        $decimales = $_GET["decimales"];
        
        $signo = 1;
        $impares = 1;
        $sumatoria = 0;
        
        for ($i=0; $i < $decimales; $i++) { 
            $sumatoria += $signo * (1 / $impares);
            $signo *= -1;
            $impares += 2; 
        }
        $pi = 4 * $sumatoria;

        echo "$pi";
    }
?>
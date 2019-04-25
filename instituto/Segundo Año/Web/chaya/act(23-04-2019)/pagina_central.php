<?php 


    function MostrarVariableSession(){
        $var = $_SESSION["param"];
        return $var;
    }

session_start();

$var = MostrarVariableSession();

echo " <H1 align='center'>$var</H1>"; 
echo "<a href=pagina_final.php> Pagina Final </a>";


?>
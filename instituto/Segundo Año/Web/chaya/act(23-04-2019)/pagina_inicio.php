<?php 

    function CrearVariableSession($parametro){
        session_start();
        $_SESSION["param"] = $parametro;
        return true;
    }

    if(CrearVariableSession("holaa")){
        echo "<a href=pagina_central.php> Pagina central </a>";
    }






?>
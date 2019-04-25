<?php 
session_start();
    function BorrarVariableSession(){
        session_destroy();
    }


    if(BorrarVariableSession()){
        echo "<a href=pagina_central.php> Pagina central </a>";
    }

    

?>
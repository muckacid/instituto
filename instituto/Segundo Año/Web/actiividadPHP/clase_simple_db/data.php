<?php
require_once 'conexion.php';

class Data {
    private $con;

    public function __construct($conexion){
        $this->con = $conexion;
    }

    public function obtenerIdByNickname($nickName){
        $sql = "SELECT id AS 'id'
                FROM usuario 
                WHERE nickname = '$nickName'";
        $rs = $this->con->query($sql);
        $resultado = $rs->fetch_assoc();
        return $resultado["id"];
    }

    public function isUsuarioValido($nickname,$passwd){
        $sql = "SELECT COUNT(*) AS 'existe' 
                    FROM usuario 
                    WHERE nickname = '$nickname' AND passwd = SHA2('$passwd',0)";
        $rs = $this->con->query($sql);
        if($fila = $rs->fetch_assoc()){
            $existe = $fila["existe"];
            if($existe == "1"){
                return true;
            }
        }
        return false;
    }

    public function getListaComentarios(){
        $sql = "SELECT tablon.id ,tablon.txt, usuario.nickname, tablon.fecha 
                FROM tablon
                INNER JOIN usuario on tablon.usuario_id_fk = usuario.id";

        $rs = $this->con->query($sql);
        $arr = [];
        while($fila = $rs->fetch_assoc()){
            $arr[] = $fila;
        }
        return $arr;

    }

    public function eliminarById($id){
        $sql = "DELETE FROM tablon WHERE id = $id";
        $this->con->query($sql);
    }

    public function actualizarById($mensaje,$id){
        $sql = "UPDATE tablon SET txt = '$mensaje' WHERE id = $id";
        $this->con->query($sql);
    }

    public function crearMensaje($mensaje,$id){
        $sql = "INSERT INTO tablon VALUES (NULL,'$mensaje',NOW(), $id)";
        $this->con->query($sql);
    }
}
?>
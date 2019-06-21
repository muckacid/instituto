/**
 * Author:  muckAcid
 * Created: 18-05-2019
 */

CREATE DATABASE banco;
USE banco;

-- ///////////////////////////////fecha generacion de solicitud//////////////////////////////////////////////
CREATE TABLE solicitud(
    id INT AUTO_INCREMENT PRIMARY KEY,
    rut VARCHAR(10),
    sueldo DOUBLE,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    fecha_nacimiento DATE,
    solicitud_aceptada BOOLEAN
);

INSERT INTO solicitud VALUES(NULL,'19220262-0',480000,'Luis','Martinez','1994-01-25',false);
UPDATE solicitud SET solicitud_aceptada = true WHERE id = 1;
-- /////////////////////////////////////////////////////////////////////////////

-- ///////////////////////////////fecha creacion//////////////////////////////////////////////
CREATE TABLE clave(
    id INT AUTO_INCREMENT PRIMARY KEY,
    f1 VARCHAR(30),
    f2 VARCHAR(30),
    f3 VARCHAR(30),
    f4 VARCHAR(30),
    f5 VARCHAR(30)
);

INSERT INTO clave VALUES(NULL,'22,33,44,55,10,22,33,44,55,10','22,33,44,55,10,22,33,44,55,10','19,33,44,41,10,87,33,44,55,10','22,33,44,55,77,22,99,67,42,10','11,15,44,21,10,22,33,44,87,10');

-- /////////////////////////////////////////////////////////////////////////////

-- /////////////////////////////////////////////////////////////////////////////
CREATE TABLE usuario(
    id INT AUTO_INCREMENT PRIMARY KEY,
    
    rut VARCHAR(10),
    sueldo DOUBLE,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    fecha_nacimiento DATE,

    saldo INT,
    pass VARCHAR(64),
    usuario_activo BOOLEAN,
    fk_clave INT,
    fk_solicitud INT UNIQUE,

    FOREIGN KEY (fk_solicitud) REFERENCES solicitud (id),
    FOREIGN KEY (fk_clave) REFERENCES clave (id)
);

INSERT INTO usuario VALUES(NULL,'18646384-6',400000,'Maximiliano','Moraga','1994-01-25',0,SHA2('123',0),true,1,1);
select id,rut,sueldo,first_name,last_name,fecha_nacimiento,saldo,usuario_activo,fk_clave,fk_solicitud from usuario;
-- /////////////////////////////////////////////////////////////////////////////
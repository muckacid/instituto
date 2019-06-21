CREATE DATABASE clase_simple;
USE clase_simple;
CREATE TABLE usuario (
    id INT AUTO_INCREMENT,
    nickname VARCHAR(25),
    passwd VARCHAR(64),

    PRIMARY KEY (id),
    UNIQUE (nickname)
);

CREATE TABLE tablon(
    id INT AUTO_INCREMENT,
    txt TEXT,
    fecha DATETIME,
    usuario_id_fk INT,

    PRIMARY KEY(id),
    FOREIGN KEY (usuario_id_fk) REFERENCES usuario(id)
);

-- INSERTS
INSERT INTO usuario VALUES  (NULL,'klawx3',SHA2('123',0)),
                            (NULL,'pablo',SHA2('321',0));
INSERT INTO usuario VALUES  (NULL,'max',SHA2('123',0));

INSERT INTO tablon VALUES (NULL,'asdasdasd',NOW(),
        (SELECT id FROM usuario WHERE nickname = 'klawx3'));

INSERT INTO tablon VALUES (NULL,'12312ef3gf',NOW(),
        (SELECT id FROM usuario WHERE nickname = 'pablo'));

INSERT INTO tablon VALUES (NULL,'dfjhgjsdfhg',NOW(),
        (SELECT id FROM usuario WHERE nickname = 'klawx3'));
-- QUERYS

DELETE FROM tablon WHERE id = 1;

SELECT COUNT(*) AS 'existe' 
    FROM usuario 
    WHERE nickname = 'klawx3' AND passwd = SHA2('123',0);

SELECT tablon.txt, usuario.nickname, tablon.fecha 
FROM tablon
INNER JOIN usuario on tablon.usuario_id_fk = usuario.id;
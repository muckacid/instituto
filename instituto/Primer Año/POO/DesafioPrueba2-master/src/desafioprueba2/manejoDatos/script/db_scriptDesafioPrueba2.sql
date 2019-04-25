/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
CREATE DATABASE desafioPrueba2;
USE desafioPrueba2;

CREATE TABLE usuario (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(40),
    run VARCHAR(13) UNIQUE,
    edad INT,
    PRIMARY KEY(id)
);

CREATE TABLE libro(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(20),
    editorial VARCHAR(20),
    anio INT,
    precio INT,
    stock INT,
    PRIMARY KEY(id)
);


/**
 * Author:  muck
 * Created: 18-10-2018
 */


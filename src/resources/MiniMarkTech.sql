CREATE DATABASE MiniMarkTech;
USE MiniMarkTech;

CREATE TABLE Cargo(
    idCargo INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombreCargo VARCHAR(50) NOT NULL
);

CREATE TABLE Usuario(
    rut VARCHAR(15) NOT NULL PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    contrasena VARCHAR(50) NOT NULL,
    idCargo INT NOT NULL,
    FOREIGN KEY (idCargo) REFERENCES Cargo(idCargo)
);

INSERT INTO Cargo (nombreCargo) VALUES ('Jefe');
INSERT INTO Cargo (nombreCargo) VALUES ('Bodeguero');
INSERT INTO Cargo (nombreCargo) VALUES ('Cajera');

INSERT INTO Usuario (rut, nombre, apellido, contrasena, idCargo)
VALUES ('21212135-5', 'Felipe', 'Velasquez', '1234', 1);
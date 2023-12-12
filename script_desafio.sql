DROP DATABASE IF EXISTS desafio_java;
CREATE DATABASE desafio_java;
USE desafio_java;

CREATE TABLE Totem (
    idTotem INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(45) UNIQUE,
	fkAeroporto INT
);

CREATE TABLE Aeroporto (
    idAeroporto INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(150),
    estado CHAR(2),
    municipio VARCHAR(60)
);

CREATE TABLE Componente (
    idComponente INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(45),
    unidadeMedida VARCHAR(45)
);

CREATE TABLE Registro (
    idRegistro INT PRIMARY KEY AUTO_INCREMENT,
    valor DECIMAL(8,2),
    dataHora DATETIME,
    fkComponente INT,
    fkTotem INT,
    FOREIGN KEY (fkComponente) REFERENCES Componente(idComponente) ON DELETE CASCADE,
    FOREIGN KEY (fkTotem) REFERENCES Totem(idTotem)
);

INSERT INTO Totem (nome, fkAeroporto) VALUES ('TLT-1', 1),
																 ('TLT-8', 1),
																 ('JDK-3', 2),
																 ('JDK-9', 2),
																 ('PYR-3', 3),
															     ('PYR-10', 3),
																 ('TLT-2', 1),
																 ('TLT-3', 1),
																 ('TLT-4', 1),
                                                                 ('TLT-5', 1),
																 ('TLT-6', 1),
																 ('TLT-7', 1),
																 ('TLT-9', 1),
																 ('TLT-10', 1),
																 ('JDK-1', 2),
																 ('JDK-2', 2),
																 ('JDK-4', 2),
																 ('JDK-5', 2),
																 ('JDK-6', 2),
																 ('JDK-7', 2),
																 ('JDK-8', 2),
																 ('JDK-10', 2),
																 ('PYR-1', 3),
																 ('PYR-2', 3),
																 ('PYR-4', 3),
																 ('PYR-5', 3),
																 ('PYR-6', 3), 
																 ('PYR-7', 3),
																 ('PYR-8', 3),
															     ('PYR-9', 3),
																 ('PYR-11', 3);


INSERT INTO Componente (nome, unidadeMedida) VALUES
('CPU', '%'), ('MEMORIA', '%'), ('DISCO', '%');

INSERT INTO Registro (valor, dataHora, fkComponente, fkTotem) VALUES (10.2, now(), 1, 12);

DROP USER IF EXISTS 'user_desafio'@'localhost';
CREATE USER 'user_desafio'@'localhost' IDENTIFIED WITH mysql_native_password BY 'urubu100';
GRANT ALL ON ConWay.* TO 'user_desafio'@'localhost';
FLUSH PRIVILEGES;

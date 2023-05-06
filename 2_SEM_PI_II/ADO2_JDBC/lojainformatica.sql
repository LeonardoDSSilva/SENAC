CREATE DATABASE IF NOT EXISTS lojainformatica;

USE lojainformatica;

-- -----------------------------------------------------
-- Table `lojainformatica`.`cliente`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS computador (
	IDComputador INT NOT NULL AUTO_INCREMENT,
	Marca VARCHAR(45) NOT NULL,
	HD VARCHAR(45) NOT NULL,
	Processador VARCHAR(45) NOT NULL,
	PRIMARY KEY (IDComputador)
);


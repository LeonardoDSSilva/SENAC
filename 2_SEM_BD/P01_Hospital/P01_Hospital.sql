CREATE DATABASE Hospital;

USE Hospital;

CREATE TABLE Pacientes(
	ID_Paciente INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Nome VARCHAR(50) NOT NULL,
	CPF CHAR(11) NOT NULL UNIQUE,
	Telefone CHAR(11),
);

CREATE TABLE Especialidades(
	ID_ESP INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Nome_Esp VARCHAR(30) NOT NULL
);

CREATE TABLE Medicos(
	ID_Medico INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Nome VARCHAR(30) NOT NULL,
	CRM INT NOT NULL,
	UF CHAR(2) NOT NULL,
	FK_ID_ESP INT NOT NULL,
	FOREIGN KEY(FK_ID_ESP) REFERENCES Especialidades(ID_ESP)
);

CREATE TABLE Consultas(
	NUM_CONSULTA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	Data_Consulta DATE NOT NULL,
	Hora_Consulta TIME NOT NULL,
	FK_ID_Paciente INT NOT NULL,
	FK_ID_ESP INT NOT NULL,
	FK_ID_Medico INT NOT NULL,
	FOREIGN KEY(FK_ID_Paciente) REFERENCES Pacientes(ID_Paciente),
	FOREIGN KEY(FK_ID_ESP) REFERENCES Especialidades(ID_ESP),
	FOREIGN KEY(FK_ID_Medico) REFERENCES Medicos(ID_Medico)
);


DESC Pacientes;
INSERT INTO Pacientes(Nome, CPF, Telefone) VALUES
	('Rita Fernandes','20000100000','11012345678'),
	('Maria Helena','30000110000','11012345678'),
	('Caio Vinicios','41000100000', '1198765432'),
	('Carlos Silva','51000110000', '1112595995'),
	('Rosa Maria','61000111000', '1165412345');
SELECT * FROM Pacientes;


DESC Especialidades;
INSERT INTO Especialidades (Nome_Esp) Values
	('Ortopedia'),
	('Traumatologia'),
	('Pediatria'),
	('Ortopedia'),
	('Neurologia');
SELECT * FROM Especialidades;


DESC Medicos;
INSERT INTO Medicos (Nome, CRM, UF, FK_ID_ESP) Values
	('João',4000,'SP',1),
	('Maria',4200,'SP',2),
	('Pedro',5100,'SP',2),
	('Carlos',2800,'SP',4),
	('Marcia',3300,'SP',3);
SELECT * FROM Medicos;
 
DESC Consultas;
INSERT INTO Consultas (FK_ID_ESP, FK_ID_Medico, FK_ID_Paciente, Data_Consulta, Hora_Consulta) values
	(1,1,1, '2006/06/12','14:00'),
	(2,2,2,'2006/06/13','11:00'),
	(3,3,3,'2006/06/12','10:00'),
	(3,4,4,'2006/06/19','13:00'),
	(2,3,5,'2006/06/20','13:00');
SELECT * FROM Consultas;



-- Listagem de pacientes em consulta no dia ou data(sua escolha) ordenado por horário.

-- Quantidade de pacientes atendidos, por dia conforme a data.

-- Listar os pacientes de uma especialidade, em uma data, ordenado por horário.

-- Quantidade de consultas realizadas por especialidade

-- O Custo de cada consulta é R$ 155,00. Quanto faturou cada médico em um mês .

-- Com alterar a data da consulta de um paciente.

-- Comando para Transferir um paciente de médico para outro medico

-- Excluir um medicamento da tabela que a quantidade seja zero.

-- Alterar a tabela paciente para incluir um campo chamado CELULAR

-- Listar a quantidade de especialidade medica que possui consultas agendadas.




select * from Consultas WHERE Data_Consulta = '2006/06/12' ORDER BY Hora_Consulta;

select count(*) from Consultas where Data_Consulta = '2006/06/12';

-- Excluir um medicamento da tabela que a quantidade seja zero
DELETE FROM Medicamentos WHERE Quantidade = 0;

-- Com alterar a data da consulta de um paciente
UPDATE Consultas SET Data_Consulta = '2006/06/12' WHERE FK_ID_Paciente = 1;

-- Listar os pacientes de uma especialidade, em uma data, ordenado por horário.




-- Alterar a tabela paciente para incluir um campo chamado CELULAR
ALTER TABLE Pacientes ADD Celular CHAR(11);


-- Comando para Transferir um paciente de médico para outro medico
UPDATE Consultas SET FK_ID_Medico = 2 WHERE FK_ID_Paciente = 1;

--Quantidade de consultas realizadas por especialidade
SELECT Especialidades.Nome_Esp, COUNT(Consultas.FK_ID_ESP) AS Quantidade FROM Especialidades


-- Listar os pacientes de uma especialidade, em uma data, ordenado por horário.
SELECT * FROM Consultas WHERE  Data_Consulta = '2006/06/12' AND FK_ID_ESP = 1 ORDER BY Hora_Consulta;

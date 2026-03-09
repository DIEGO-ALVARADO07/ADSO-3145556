-- DDL: CREACIÓN DE TABLAS 

CREATE TABLE Persona (
	id_persona INT NOT NULL PRIMARY KEY,
	primerNombre VARCHAR(255) NOT NULL,
	segundoNombre VARCHAR(255) NOT NULL,
	primerApellido VARCHAR(255) NOT NULL,
	segundoApellido VARCHAR(255) NOT NULL,
	id_tipoDocumento INT NOT NULL,
	numeroDocumento INT NOT NULL
);


CREATE TABLE Usuario (
	id_usuario INT NOT NULL PRIMARY KEY,
	id_persona INT NOT NULL,
	id_rol INTEGER NOT NULL,
	correo VARCHAR(50) NOT NULL,
	contraseña VARCHAR(255) NOT NULL,
	fechar_registro DATE NOT NULL,
	FOREIGN KEY(id_persona) REFERENCES Persona(id_persona),
    FOREIGN KEY (id_rol) REFERENCES Rol(id_rol)
);


CREATE TABLE Rol (
	id_rol INT NOT NULL PRIMARY KEY,
	Rol INT NOT NULL,
	Descripcion VARCHAR(255) NOT NULL
);


CREATE TABLE Hogar (
	id_hogar INT NOT NULL PRIMARY KEY,
	id_usuario INT NOT NULL,
	direccion INT NOT NULL,
	estrato INT NOT NULL,
	habitantes INT NOT NULL,
	FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario)
);


CREATE TABLE Sensor (
	id_sensor INT NOT NULL PRIMARY KEY,
	id_hogar INT NOT NULL,
	serial VARCHAR(50) NOT NULL,
	ubicacion VARCHAR(255) NOT NULL,
	estado VARCHAR(255) NOT NULL,
	FOREIGN KEY (id_hogar) REFERENCES Hogar(id_hogar)
);


CREATE TABLE HogarNotificacion (
	id_HN INT NOT NULL PRIMARY KEY,
	id_hogar INT NOT NULL,
	id_notificacion INT NOT NULL,
	fecha_emision DATE NOT NULL,
	frecuencia INT NOT NULL,
	prioridad INT NOT NULL,
	FOREIGN KEY (id_hogar) REFERENCES Hogar(id_hogar),
    FOREIGN KEY (id_notificacion) REFERENCES Notificacion(id_notificacion)
);


CREATE TABLE Notificacion (
	id_notificacion INT PRIMARY KEY,
	tipo INT NOT NULL,
	descripcion VARCHAR(255) NOT NULL,
	mensaje VARCHAR(255) NOT NULL
);


CREATE TABLE RegistroConsumo  (
	id_registro INT PRIMARY KEY,
	id_hogar INT NOT NULL,
	frecuencia INT NOT NULL,
	consumo INT NOT NULL,
	FOREIGN KEY (id_hogar) REFERENCES Hogar(id_hogar)
);


CREATE TABLE MetaConsumo (
	id_meta INT PRIMARY KEY,
	id_hogar INT NOT NULL,
	periodo VARCHAR(50) NOT NULL,
	fecha_inicio DATE NOT NULL,
	estado BOOLEAN NOT NULL,
	FOREIGN KEY (id_hogar) REFERENCES Hogar(id_hogar)
);


CREATE TABLE LogActividadHogar (
	id_log INT PRIMARY KEY,
	id_hogar INT NOT NULL,
	descripcion VARCHAR(255) NOT NULL,
	fecha_hora DATE NOT NULL,
	FOREIGN KEY (id_hogar) REFERENCES Hogar(id_hogar)
);

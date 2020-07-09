create database MainFrame;
use MainFrame;


create table Lenguaje_catalog (
	id int(11) not null auto_increment,
    lenguaje varchar(50),
    primary key (id)
);

create table Comentario_entity(
	id int(11) not null auto_increment,
    nombre varchar(255) not null,
    contenido text,
    primary key (id)
);

create table TipoBlog_catalog(
	id int(11) not null auto_increment,
    descripcion varchar(50),
    primary key (id)
);

create table Blog_entity (
	id int(11) not null auto_increment,
    titulo varchar(255) not null,
    autor varchar(255) not null,
    fecha date,
    idLenguaje int(11),
    idTipo int(11),
    Contenido text, 
    primary key (id),
    CONSTRAINT fk_lenguaje foreign key (idLenguaje) references Lenguaje_catalog (id),
    CONSTRAINT fk_tipo foreign key (idTipo) references TipoBlog_catalog (id)
);


insert into Lenguaje_catalog values (1,'Java');
insert into Lenguaje_catalog values (2,'C');

select * from Lenguaje_catalog;

select * from Blog_entity t1 inner join Lenguaje_catalog t2 on t1.IdLenguaje = t2.IdLenguaje;

DROP TABLE IF EXISTS Lenguaje_catalog, Comentario_entity, TipoBlog_catalog, Blog_entity;


use MainFrame;

create table Solicitud (
    id int(11) not null auto_increment,
    nombre varchar(255) not null,
    telefono varchar(15) not null,
    correo varchar(50) not null,
    fecha date,
    contenido text,
    idAsociado int (11) not null
    primary key (id),
    CONSTRAINT fk_asociado foreign key (idAsociado) references Asociados_catlog (id),
    
);

create table Asociados(
    id int(11) not null auto_increment,
    nombre varchar(100),
    rfc varchar(20),
    estado int(1),
    primary key (id)
);

create table Telefonos(
    id int(11) not null auto_increment,
    tipo int(1),
    celular int(1)
    telefono varchar(15),
    idAsociado int(11),
    primary key (id),
    CONSTRAINT fk_asociado_telefono foreign key (idAsociado) references Asociados_catlog (id),
);

create table Correos (
    id int(11) not null auto_increment,
    idAsociado int(11),
    tipo int(1),
    correo varchar(50),
    primary key (id),
    CONSTRAINT fk_asociado_correo foreign key (idAsociado) references Asociados_catlog (id),
);


create table Direccion (
    id int(11) not null auto_increment,
    idAsociado int(11),
    tipo int(1),
    pais varchar(50),
    estado varchar(50),
    municipio varchar(50),
    colonia varchar(50),
    calle varchar(50),
    numExt varchar(50),
    numInt varchar(50),
    cp varchar(50),
    primary key (id),
    CONSTRAINT fk_asociado_direccion foreign key (idAsociado) references Asociados_catlog (id),
);


insert into Solicitud_entity values(1, 'pruebaSolicitud','312123', 'ioads@prueba.com', now(), 'este es el contenido de prueba');
insert into DirectorioCorreo_Catlog values(1, 'ioads@prueba.com', 'este es asociado prueba', 0);
insert into Correos_relation values(1, 1, 1, 0);
select * from Solicitud_entity;
select * from DirectorioCorreo_Catlog;
select * from Correos_relation;


Telefono tipo
1.-contacto principal
2.-contacto para asociado
3.-contacto principal y asociado

Telefono celular
0.-celular
1.-fijo

Correo tipo
1.-contacto principal
2.-contacto para asociado
3.-contacto principal y asociado

Direccion tipo
1.-direccion fiscal
2.-sucursal
3.-ambos

Asociados estado
0.-inactivo
1.-activo


create table Solicitud_entity (
    id int(11) not null auto_increment,
    nombre varchar(255) not null,
    telefono varchar(15) not null,
    correo varchar(50) not null,
    fecha date,
    contenido text,
    primary key (id)
);

create table DirectorioCorreo_Catlog(
    id int(11) not null auto_increment,
    correo varchar(50) not null,
    descripcion varchar(50) not null,
    estado int(1),
    primary key (id)
);

create table Correos_relation(
    id int(11) not null auto_increment,
    idSolicitud int(11),
    idCorreoEmisor int(11),
    estado int(1),
    primary key (id),
    CONSTRAINT fk_solicitud foreign key (idSolicitud) references Solicitud_entity (id),
    CONSTRAINT fk_correoE foreign key (idCorreoEmisor) references DirectorioCorreo_Catlog (id)
);

insert into Solicitud_entity values(1, 'pruebaSolicitud','312123', 'ioads@prueba.com', now(), 'este es el contenido de prueba');
insert into DirectorioCorreo_Catlog values(1, 'ioads@prueba.com', 'este es cliente prueba', 0);
insert into Correos_relation values(1, 1, 1, 0);
select * from Solicitud_entity;
select * from DirectorioCorreo_Catlog;
select * from Correos_relation;
DROP TABLE IF EXISTS Correos_relation, Solicitud_entity, DirectorioCorreo_Catlog;

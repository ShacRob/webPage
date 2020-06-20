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

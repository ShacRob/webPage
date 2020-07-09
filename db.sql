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



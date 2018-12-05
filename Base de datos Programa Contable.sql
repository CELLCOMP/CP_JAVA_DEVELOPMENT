create database sistema_contable;
use sistema_contable;


create table usuarios(
id int auto_increment primary key,
nombre varchar(50) not null,
contrasenia blob not null,
user_name varchar(30) not null,
correo varchar(45) not null
);

create table producto(
id int auto_increment primary key,
nombre_producto varchar(50) not null,
modelo varchar(50) not null,
marca varchar(50) not null,
imagen blob,
id_proveedor int not null,
foreign key (id_proveedor) references proveedor(id)
);

create table proveedor(
id int auto_increment primary key,
nombre_proveedor varchar(50) not null,
direccion varchar(50) not null,
telefono char(8) not null,
correo varchar(50) 
);

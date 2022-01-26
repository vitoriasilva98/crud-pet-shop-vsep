create database crudpetshop;

use crudpetshop;

create table Pet(
	idPet serial primary key,
	nome varchar(20),
	tipoAnimal varchar(10),
	raca varchar(25),
	porte varchar(10),
	dataReserva varchar(10),
	horario varchar(5));

insert into Pet values (1, 'Baby Love', 'cachorro', 'Viralata', 'Médio', '2022-01-26', '09:30');
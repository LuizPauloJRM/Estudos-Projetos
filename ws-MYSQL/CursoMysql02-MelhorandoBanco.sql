create database cadastrar;
create table pessoas(
	id_nome int not null primary key,
	nome varchar(30) not null,
    nascimento date, 
    sexo enum('M','F'),
    peso decimal(5,2),
    altura decimal(3,2),
    nacionalidade varchar(20) default 'Brasil'
);	
use cadastrar;

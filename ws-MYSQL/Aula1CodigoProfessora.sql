/*Criar um banco de dados*/
create database projecao;
/*coloca o banco de dados em uso*/
use db_projecao;
create table aluno 
(
   matricula int not null primary key,
   nome varchar(80) not null,
   email varchar(80) not null,
   dt_nascimento date not null
);
/*desc serve para descrever as 
  colunas da tabela*/
desc aluno;  
/*criar a tabela professor
   com as colunas
   matricula int e chave primaria
   nome varchar(80) nao nulo
   titulacao varchar(50) nao nulo*/
create table professor
(
   matricula int not null primary key,
   nome varchar(80) not null,
   titulacao varchar(50) not null
);

desc aluno;
/*alterar a tabela aluno e vai adicionar uma
  nova coluna chamada telefone do tipo
   varchar de 15 caracteres*/
alter table aluno add column telefone varchar(15);
/*alterar a tabela aluno e vai apagar a coluna
  email*/
alter table aluno drop column email;
desc aluno; 
/**/  
show tables;
/*comando para apagar a tabela inteira - obs
   apagar tabela toda inclusive os dados,
   se houver*/
/*drop table professor; */  
/*apaga o banco de dados todo, obs: apaga todas
  as tabelas e dados se houver*/
/*drop database db_projecao;  */ 
select * from aluno;
insert into aluno
(matricula, nome, dt_nascimento, telefone)
values 
('123', 'Ana', '2000-07-25', '61-99905-1212');
select * from aluno;
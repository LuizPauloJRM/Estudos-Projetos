/*Criando meu primeiro banco de dados*/
create database db_projecao;
/*Coloca o banco de dados em uso*/
use db_projecao;
/*Criando tabela*/
create table aluno
(
matricula int null primary key,
nome varchar(80) not null,
email varchar(80) not null,
data_nascimento date not null
);
/*desc serve para descrever as colunas da tabela*/
desc aluno;
/*Criar a tabela professor 
com colunas 
matricula int e chave primaria 
nome vachar(80) nao nulo
titulacao varchar(50) nao nulo*/
create table professor
(
matricula int not null primary key,
nome varchar(80) not null,
titulacao varchar(80) not null
);
desc professor;

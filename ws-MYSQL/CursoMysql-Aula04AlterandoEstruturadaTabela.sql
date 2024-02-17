desc pessoas;
alter table pessoas
add column profissao varchar(10) after nome;/*Depois do nome adicionar a coluna profissao*/

alter table pessoas
add codigo int first;

alter table pessoas
modify column profissao varchar(20) not null default'';

alter table pessoas
change column profissao prof varchar(20);

create table if not exists cursos(
	nome varchar(30) not null unique,
    descricao text,
    carga int unsigned,
    totaulas int,
    ano year default '2023'
)default charset=utf8;


alter table cursos 
add column idcurso int first;
describe cursos;

alter table cursos 
add primary key (idcurso);
describe cursos;
drop table if exists teste;

create table if not exists teste(
	id int,
	nome varchar(10),
	idade int
);
insert into teste value
('1','Pedro','22'),
('2','Rafael','23')






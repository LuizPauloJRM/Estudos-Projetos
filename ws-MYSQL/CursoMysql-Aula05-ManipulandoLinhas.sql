insert into cursos values
('1','HTML4','Curso de HTML5','40','37','2014'),
('2','Algoritmos','Logica de programação','20','15','2014'),
('3','Photoshop','Dicas photoshop CC','10','8','2014'),
('4','PGP','Curso de PHP para iniciantes','40','20','2010'),
('5','Jarva','Intodução a linguagem Java','10','29','2000'),
('6','MySQL','Banco de dados','30','15','2016'),
('7','Word','Curso completo de word','40','30','2016');

select*from cursos;

/*ALTERA NA TABELA CURSOS O NOME HTML4 QUE ERA O ANTERIOR PARA HTML5*/
update cursos
set nome='HTML5'
where idcurso='1';

/*ALTERA 2 REGISTROS DE UMA VEZ*/
update cursos
set nome='PHP',ano='2015'
where idcurso='4';

update cursos
set nome='Java',carga='40',ano='2015'
where idcurso='5'
Limit 1;

/*APAGA 1 REGISTRO DA LINHA DA TABELA 
delete from cursos 
where idcursos='8';*/

/*APAGA 2 REGISTROS DAS LINHAS DA TABELA 
delete from cursos 
where idcursos='8'
limit=2;*/

/*APAGA TODO REGISTRO DA LINHAS DA TABELA 
truncate cursos;*/


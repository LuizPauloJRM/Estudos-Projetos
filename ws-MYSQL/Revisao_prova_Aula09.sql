
 /*SINTAXE PARA CRIAR UM BANCO DE DADOS*/
 CREATE DATABASE NOME_BANCO;
 /*SINTAXE PARA CRIAR UMA TABELA*/
 CREATE TABLE NOME_TABELA
 (
	NOME_COL1 INT NOT NULL PRIMARY KEY,
    NOME_COL DATE,
    FOREIGN KEY(NOME_COL2) REFERENCES
		TABELA (PK_TABLE_REF)
        
	);
    use rh;
    SELECT * FROM TB_CARGO;
    /*UPDATE TABELA
		SE COLUNA = VALOR 
	WHERE K = VALOR*/
    
    UPDATE TB_CARGO
		SET SALARIO = 8000
        WHERE ID_CARGO = 2;
        
        
        UPDATE TB_CARGO
		SET SALARIO = SALARIO + SALARIO* 0.10
        WHERE ID_CARGO = 2;
        
        SELECT * FROM TB_EMPREGADO;
        UPDATE TB_EMPREGADO
			SET NOME = "VALERIA FARIAS AVES",
				DT_ADMISSAO = '2008-12-08'
                WHERE MATRICULA = 123;
		SELECT*FROM TB_DEPARTAMENTO;
        DELETE FROM TB_DEPARTAMENTO
			WHERE ID_DEPARTAMENTO = 500;/*Integridade referencial nao apaga chave estrangeira 100*/
		SELECT *FROM TB_EMPREGADO;
        SELECT *FROM TB_CARGO;
        /*SELECT SUM(SALARIO)SOMA,
				MAX(SALARIO)MAXIMO,
                MIN(SALARIO)MINIMO,
                AVG(SALARIO)MEDIA,
                COUNT(ID_CARGO)TOTAL DE TABELAS*/
        SELECT SUM(SALARIO),
				MAX(SALARIO),
                MIN(SALARIO),
                AVG(SALARIO),
                COUNT(ID_CARGO)
			FROM TB_CARGO;
	SELECT COUNT(MATRICULA) AS TOTAL_EMPREGADOS
		FROM TB_EMPREGADO;
        select*from tb_empregado;
        select curdate();/*data de hoje*/
        select nome,
				timestampdiff(YEAR,dt_nascimento, curdate())as idade/*Diferença de tempo pra data*/
				from tb_empregado;
                
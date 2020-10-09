CREATE TABLE CIDADES(
I_CIDADE INTEGER NOT NULL,
NOME VARCHAR(100),
CONSTRAINT PK_CIDADES PRIMARY KEY(I_CIDADE));

CREATE TABLE LOGRADOUROS(
I_LOGRADOURO INTEGER NOT NULL,
NOME VARCHAR(100),
TIPO VARCHAR(15) NOT NULL,
CONSTRAINT PK_LOGRADOUROS PRIMARY KEY(I_LOGRADOURO));

CREATE TABLE PROJETOS(
I_PROJETO INTEGER NOT NULL,
NOME VARCHAR(100) NOT NULL,
DESCRICAO VARCHAR(500),
I_LOGRADOURO INTEGER NOT NULL,
I_CIDADE INTEGER NOT NULL,
CONSTRAINT PK_PROJETOS PRIMARY KEY(I_PROJETO),
CONSTRAINT FK_PROJETOS_LOGRADOUROS FOREIGN KEY(I_LOGRADOURO) REFERENCES LOGRADOUROS(I_LOGRADOURO),
CONSTRAINT FK_PROJETOS_CIDADES FOREIGN KEY(I_CIDADE) REFERENCES CIDADES(I_CIDADE));

CREATE TABLE DEPARTAMENTOS(
I_DEPARTAMENTO INTEGER NOT NULL,
NOME VARCHAR(100) NOT NULL,
I_FUNC_GERENTE INTEGER,
I_LOGRADOURO INTEGER NOT NULL,
I_CIDADE INTEGER NOT NULL,
CONSTRAINT PK_DEPARTAMENTOS PRIMARY KEY(I_DEPARTAMENTO),
CONSTRAINT FK_DEPARTAMENTOS_LOGRADOUROS FOREIGN KEY(I_LOGRADOURO) REFERENCES LOGRADOUROS(I_LOGRADOURO),
CONSTRAINT FK_DEPARTAMENTOS_CIDADES FOREIGN KEY(I_CIDADE) REFERENCES CIDADES(I_CIDADE));

CREATE TABLE FUNCIONARIOS(
I_FUNCIONARIO INTEGER NOT NULL,
NOME VARCHAR(20) NOT NULL,
SOBRENOME VARCHAR(80) NOT NULL,
CPF CHAR(11) NOT NULL,
RG CHAR(9) NOT NULL,
SALARIO NUMERIJC(12,2) NOT NULL,
SEXO CHAR(1) NOT NULL,
I_DEPARTAMENTO INTEGER NOT NULL,
I_FUNC_SUPERVISOR INTEGER NOT NULL,
I_LOGRADOURO INTEGER NOT NULL,
I_CIDADE INTEGER NOT NULL,
CONSTRAINT PK_FUNCIONARIOS PRIMARY KEY(I_FUNCIONARIO),
CONSTRAINT FK_FUNCIONARIOS_DEPARTAMENTOS FOREIGN KEY(I_DEPARTAMENTO) REFERENCES DEPARTAMENTOS(I_DEPARTAMENTO),
CONSTRAINT FK_FUNCIONARIOS_FUNCIONARIOS FOREIGN KEY(I_FUNC_SUPERVISOR) REFERENCES FUNCIONARIOS(I_FUNCIONARIO),
CONSTRAINT FK_FUNCIONARIOS_LOGRADOUROS FOREIGN KEY(I_LOGRADOURO) REFERENCES LOGRADOUROS(I_LOGRADOURO),
CONSTRAINT FK_FUNCIONARIOS_CIDADES FOREIGN KEY(I_CIDADE) REFERENCES CIDADES(I_CIDADE) );

ALTER TABLE DEPARTAMENTOS 
ADD CONSTRAINT FK_DEPARTAMENTOS_FUNCIONARIOS FOREIGN KEY(I_FUNC_GERENTE) REFERENCES FUNCIONARIOS(I_FUNCIONARIO);

CREATE TABLE FUNCIONARIOS_PROJETOS(
I_FUNCIONARIO INTEGER NOT NULL,
I_PROJETO INTEGER NOT NULL,
HORAS_SEMANA INTEGER NOT NULL,
CONSTRAINT PK_FUNCIONARIOS_PROJETOS PRIMARY KEY(I_FUNCIONARIO, I_PROJETO),
CONSTRAINT FK_FUNC_PROJ_FUNC FOREIGN KEY(I_FUNCIONARIO) REFERENCES FUNCIONARIOS(I_FUNCIONARIO),
CONSTRAINT FK_FUNC_PROJ_PROJ FOREIGN KEY(I_PROJETO) REFERENCES PROJETOS(I_PROJETO));

CREATE TABLE DEPENDENTES(
I_DEPENDENTE INTEGER NOT NULL,
I_FUNCIONARIO INTEGER NOT NULL,
NOME VARCHAR(20) NOT NULL,
SOBRENOME VARCHAR(80) NOT NULL,
CONSTRAINT PK_DEPENDENTES PRIMARY KEY(I_DEPENDENTE),
CONSTRAINT FK_DEPENDENTES_FUNCIONARIOS FOREIGN KEY(I_FUNCIONARIO) REFERENCES FUNCIONARIOS(I_FUNCIONARIO));

---------------------------------------------------------------------------------------

CREATE TABLE CLIENTES(
I_CLIENTE INTEGER NOT NULL,
NOME VARCHAR(100),
CONSTRAINT PK_CLIENTES PRIMARY KEY(I_CLIENTE)
);

INSERT INTO CLIENTES VALUES(1, 'JOÃO');
INSERT INTO CLIENTES VALUES(2, 'MARIA');
INSERT INTO CLIENTES VALUES(3, 'PEDRO');
INSERT INTO CLIENTES VALUES(4, 'MARIO');

CREATE TABLE PRODUTOS(
I_PRODUTO INTEGER NOT NULL,
NOME VARCHAR(100) NOT NULL,
VALOR DECIMAL(12,2) NOT NULL,
CONSTRAINT PK_PRODUTOS PRIMARY KEY(I_PRODUTO)
);

INSERT INTO PRODUTOS VALUES(1, 'PARAFUSOS', 1.00);
INSERT INTO PRODUTOS VALUES(2, 'TINTAS', 10.00);
INSERT INTO PRODUTOS VALUES(3, 'PINCEL', 5.50);
INSERT INTO PRODUTOS VALUES(4, 'LÁPIS', 1.25);

CREATE TABLE VENDAS(
I_VENDA INTEGER NOT NULL,
DATA_VENDA DATE NOT NULL,
I_CLIENTE INTEGER NOT NULL,
VALOR_VENDA DECIMAL(12,2) NOT NULL,
DESCONTO DECIMAL(12,2) NOT NULL,
VALOR_FINAL DECIMAL(12,2) NOT NULL,
CONSTRAINT PK_VENDAS PRIMARY KEY(I_VENDA),
CONSTRAINT FK_VENDAS_CLIENTES FOREIGN KEY(I_CLIENTE) REFERENCES CLIENTES(I_CLIENTE)
);

INSERT INTO VENDAS VALUES(1, '10-10-2014', 1, 10, 10, 100);
INSERT INTO VENDAS VALUES(3, '10-08-2011', 3, 50, 10, 500);
INSERT INTO VENDAS VALUES(2, '10-09-2014', 2, 100, 10, 1000);
INSERT INTO VENDAS VALUES(4, '10-09-2014', 3, 60, 10, 600);
INSERT INTO VENDAS VALUES(5, '10-09-2013', 4, 70, 10, 700);
INSERT INTO VENDAS VALUES(6, '10-09-2012', 1, 20, 10, 200);

CREATE TABLE ITENS_VENDAS(
I_VENDA INTEGER NOT NULL,
I_ITEM INTEGER NOT NULL,
QUANTIDADE INTEGER NOT NULL,
I_PRODUTO INTEGER NOT NULL,
VALOR_VENDA DECIMAL NOT NULL,
CONSTRAINT PK_ITENS_VENDAS PRIMARY KEY(I_VENDA, I_ITEM),
CONSTRAINT FK_ITENS_VENDAS_VENDAS FOREIGN KEY(I_VENDA) REFERENCES VENDAS(I_VENDA),
CONSTRAINT FK_ITENS_VENDAS_PRODUTOS FOREIGN KEY(I_PRODUTO) REFERENCES PRODUTOS(I_PRODUTO)
);

INSERT INTO ITENS_VENDAS VALUES(1, 1, 5, 2, 10);
INSERT INTO ITENS_VENDAS VALUES(1, 2, 50, 1, 1);
INSERT INTO ITENS_VENDAS VALUES(2, 1, 100, 3, 5.50);
INSERT INTO ITENS_VENDAS VALUES(2, 2, 45, 2, 10);
INSERT INTO ITENS_VENDAS VALUES(3, 1, 100, 4, 1.25);
INSERT INTO ITENS_VENDAS VALUES(3, 2, 10, 1, 35);
INSERT INTO ITENS_VENDAS VALUES(4, 1, 60, 1, 10);
INSERT INTO ITENS_VENDAS VALUES(5, 1, 70, 1, 10);
INSERT INTO ITENS_VENDAS VALUES(6, 1, 20, 1, 10);



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
LISTA 2
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

CREATE TABLE PESSOA (
I_PESSOAS INTEGER NOT NULL,
NOME VARCHAR(50) NOT NULL,
CPF CHAR(11) NOT NULL,
CONSTRAINT PK_PESSOA PRIMARY KEY (I_PESSOAS)
);

CREATE TABLE VENDA (
I_VENDAS INTEGER NOT NULL,
I_PESSOAS INTEGER NOT NULL,
DT_VENDA DATE NOT NULL,
DT_VENCTO DATE NOT NULL,
PAGO CHAR(1) NOT NULL,
VALOR_VENDA NUMERIC(12,2) NOT NULL,
VALOR_PAGO NUMERIC(12,2) NOT NULL,
CONSTRAINT PK_VENDA PRIMARY KEY (I_VENDAS)
);

CREATE TABLE ITEM (
I_VENDAS INTEGER NOT NULL,
I_PRODUTOS INTEGER NOT NULL,
QUANTIDADE INTEGER NOT NULL,
VALOR_UNITARIO NUMERIC(12,4) NOT NULL,
CONSTRAINT PK_ITEM PRIMARY KEY (I_VENDAS,I_PRODUTOS)
);

CREATE TABLE PRODUTO (
I_PRODUTOS INTEGER NOT NULL,
I_FABRICANTES INTEGER NOT NULL,
NOME VARCHAR(50) NOT NULL,
DESCRICAO VARCHAR(200) NOT NULL,
VALOR NUMERIC(12,4) NOT NULL,
UNIDADE VARCHAR(10) NOT NULL,
CONSTRAINT PK_PRODUTO PRIMARY KEY (I_PRODUTOS)
);

CREATE TABLE FABRICANTE (
I_FABRICANTES INTEGER NOT NULL,
CNPJ CHAR(14) NOT NULL,
NOME_FANT VARCHAR(100) NOT NULL,
CONSTRAINT PK_FABRICANTE PRIMARY KEY (I_FABRICANTES)
);

ALTER TABLE ITEM ADD
	CONSTRAINT FK_VEN_ITEM FOREIGN KEY (I_VENDAS)
		REFERENCES VENDA (I_VENDAS)
		
ALTER TABLE ITEM ADD
	CONSTRAINT FK_PROD_ITEM FOREIGN KEY (I_PRODUTOS)
		REFERENCES PRODUTO (I_PRODUTOS)

ALTER TABLE VENDA ADD
	CONSTRAINT FK_VEN_PESS FOREIGN KEY (I_PESSOAS)
		REFERENCES PESSOA (I_PESSOAS)

ALTER TABLE PRODUTO ADD
	CONSTRAINT FK_FAB_PROD FOREIGN KEY (I_FABRICANTES)
		REFERENCES FABRICANTE (I_FABRICANTES)

INSERT INTO FABRICANTE VALUES(1, '12345678911356', 'IMBRALIT');	
		
INSERT INTO PRODUTO VALUES(1, 1, 'PARAFUSO', 'PARAFUSO DE AÇO', 100, 'UN' );



%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
EXEMPLO DE INSERT COM SELECT
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

INSERT INTO PRODUTO
SELECT MAX(I_PRODUTOS) + 1, 1, 'MARTELO', 'MARTELO PARA CONSTRUÇÃO', 
        VALOR, UNIDADE
  FROM PRODUTO
GROUP BY VALOR, UNIDADE

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

DO $$
DECLARE 
	V_MEDIA NUMERIC(4,2)
BEGIN
	V_MEDIA := ROUND(((5.00 + 9.21 + 2.01) /3 ),2);
	IF V_MEDIA >= 7 THEN RAISE NOTICE 'O ALUNO ESTÁ APROVADO COM MÉDIA: %', V_MEDIA;

	ELSIF V_MEDIA < 7 AND V_MEDIA >= 5 THEN RAISE NOTICE 'O ALUNO ESTÁ EM EXAME COM A MÉDIA: %', V_MEDIA;

	ELSE RAISE NOTICE 'O ALUNO ESTÁ REPROVADO COM A MÉDIA: %', V_MEDIA;
	END IF;
END $$;

DO $$
DECLARE 
	V_MEDIA NUMERIC(4,2);
BEGIN 
	V_MEDIA := ROUND(((5.00 + 9.21 + 2.01) /3 ),2);
	IF V_MEDIA >= 7 THEN RAISE NOTICE 'O ALUNO ESTÁ APROVADO COM MÉDIA: %', V_MEDIA;

	ELSE V_MEDIA < 7 AND V_MEDIA >= 5 THEN RAISE NOTICE 'O ALUNO ESTÁ EM EXAME COM A MÉDIA: %', V_MEDIA;

		ELSE RAISE NOTICE 'O ALUNO ESTÁ REPROVADO COM A MÉDIA: %', V_MEDIA;

		END IF;
	END IF;
END $$;

DO $$
DECLARE 
	V_MEDIA NUMERIC(4,2)
BEGIN
	V_MEDIA := ROUND(((5.00 + 9.21 + 2.01) /3 ),2);
	IF V_MEDIA >= 7 THEN RAISE NOTICE 'O ALUNO ESTÁ APROVADO COM MÉDIA: %', V_MEDIA;

	ELSIF V_MEDIA < 7 AND V_MEDIA >= 5 THEN RAISE NOTICE 'O ALUNO ESTÁ EM EXAME COM A MÉDIA: %', V_MEDIA;

	ELSE RAISE NOTICE 'O ALUNO ESTÁ REPROVADO COM A MÉDIA: %', V_MEDIA;
	END IF;
END $$;

DO $$
DECLARE 
	V_MEDIA NUMERIC(4,2);
BEGIN 

	V_MEDIA := ROUND(((5.00 + 9.21 + 2.01) /3 ),2);

	IF V_MEDIA >= 7 THEN RAISE NOTICE 'O ALUNO ESTÁ APROVADO COM MÉDIA: %', V_MEDIA;
	END IF;

	IF V_MEDIA < 7 AND V_MEDIA >= 5 THEN RAISE NOTICE 'O ALUNO ESTÁ EM EXAME COM A MÉDIA: %', V_MEDIA;
	END IF;

	IF VALOR_VENDA < 5 THEN RAISE NOTICE 'O ALUNO ESTÁ REPROVADO COM A MÉDIA: %', V_MEDIA;
	END IF;

END $$;
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
VERIFICAR A MÉDIA DE SALÁRIO DOS FUNCIONARIOS.
PARA AQUELES QUE POSSUIREN SALÁRIO IGUAL OU SUPERIOR A MÉDIA,
CONCEDER UM AUMENTO DE 8,5%, PARA AQUELES COM SALÁRIO INFERIOR A
MÉDIA CONCEDER UM AUMENTO DE 10%.

DO $$
DECLARE 
	V_MEDIA_SAL NUMERIC(7,2);
BEGIN	
	SELECT AVG(SALARIO)
	INTO V_MEDIA_SAL
	FROM FUNCIONARIOS;
	
	UPDATE FUNCIONARIOS
	SET SALARIO = (SALARIO * 1.085)
	WHERE SALARIO >= V_MEDIA_SAL;

	UPDATE FUNCIONARIOS 
	SET SALARIO = (SALARIO * 1.1)
	WHERE SALARIO < V_MEDIA_SAL;

END %%;
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
VERIFICAR A MÉDIA DE SALARIO DE TODOS OS FUNCIONARIOS.
APRESENTAR:
- O PERCENTUAL DE DIFERENÇA ENTRE O SALARIO MÉDIO FEMININO E MÉDIA SALARIAL DE TODOS OS FUNCIONARIOS.

-O PERCENTUAL DE DIFERENÇA ENTRE O SALARIO MÉDIO MASCULINO E MÉDIA SALARIAL DE TODOS OS FUNCIONARIOS.

-O PERCENTUAL DE DIFERENÇA ENTRE A MÉDIA SALARIAL FEMININA E MÉDIA SALARIAL MASCULINA.

DO $$
DECLARE 
	V_MEDIA_SAL NUMERIC(7,2);
	V_MEDIA_M NUMERIC(7,2);
	V_MEDIA_F NUMERIC(7,2);
	V_MEDIA_R1 NUMERIC(7,2);
	V_MEDIA_R2 NUMERIC(7,2);
	V_MEDIA_R3 NUMERIC(7,2);
BEGIN 
	SELECT AVG(SALARIO) INTO V_MEDIA_SAL FROM FUNCIONARIOS;
	SELECT AVG(SALARIO) INTO V_MEDIA_F	 FROM FUNCIONARIOS WHERE SEXO = 'F';
	SELECT AVG(SALARIO) INTO V_MEDIA_M	 FROM FUNCIONARIOS WHERE SEXO = 'M'; 

	V_MEDIA_R1 = (((V_MEDIA_F - V_MEDIA_SAL) * 100) / V_MEDIA_SAL);
	V_MEDIA_R2 = (((V_MEDIA_M - V_MEDIA_SAL) * 100) / V_MEDIA_SAL);
	V_MEDIA_R3 = (((V_MEDIA_M - V_MEDIA_F) * 100) / V_MEDIA_F);

	RAISE NOTICE 'MÉDIA FEMININA: %',V_MEDIA_R1;
	RAISE NOTICE 'MÉDIA MASCULINA: %',V_MEDIA_R2;
	RAISE NOTICE 'DIFERENÇADA MÉDIA MASCULINA E FEMININA: %',V_MEDIA_R3;

END $$;

(((2.54 - (-2.54)) * 100) / (-2.54))












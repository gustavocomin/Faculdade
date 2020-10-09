PROVA CORREÇÃO

1.1

SELECT CLIENTES.NOME,
      (SELECT COUNT(VENDAS.I_VENDA)
      	FROM VENDAS
      	 WHERE VENDAS.I_CLIENTE =
      	       CLIENTES.I_CLIENTE) AS CONTAGEM ,
      SUM(ITENS_VENDAS.QUANTIDADE),
      SUM(ITENS_VENDAS.QUANTIDADE * 
      	  ITENS_VENDAS.VALOR_VENDA)
   FROM CLIENTES INNER JOIN VENDAS
           ON(CLIENTES.I_CLIENTE = VENDAS.I_CLIENTE)
        INNER JOIN ITENS_VENDAS
        ON(VENDAS.I_VENDA = ITENS_VENDAS.I_VENDA)
GROUP BY CLIENTES.NOME, 2
----------------------------------------------------------------------

1.2- 

SELECT NOME,CPF FROM CLIENTES
EXCEPT 
SELECT NOME,CPF FROM CLIENTES INNER JOIN VENDAS  
             ON(CLIENTES.I_CLIENTE = VENDAS.I_CLIENTE)           


------------------------------------------------------------------

1.3 - 

SELECT EXTRACT (YEAR FROM VENDAS.DATA_VENDA) AS ANO,
       EXTRACT(MONTH FROM VENDAS.DATA_VENDA) AS MES,
       SUM(VENDAS.VALOR_FINAL)
 FROM VENDAS
GROUP BY 1,2 
------------------------------------------------------------------------ 

1.4 - 

SELECT EXTRACT (YEAR FROM VENDAS.DATA_VENDA) AS ANO,
       EXTRACT(MONTH FROM VENDAS.DATA_VENDA) AS MES,
       SUM(VENDAS.VALOR_FINAL) AS VLR_VENDA,
       SUM(CONTAS_RECEBER.VALOR_PARCELA) AS VLR_ABERTO
 FROM VENDAS LEFT OUTER JOIN CONTAS_RECEBER
    ON(VENDAS.I_VENDA = CONTAS_RECEBER.I_VENDA)
    WHERE CONTAS_RECEBER.SITUACAO = 'A' AND 
        CONTAS_RECEBER.VENCIMENTO < '2019-09-16'
GROUP BY 1,2 

---------------------------------------------------------------------

1.5

  SELECT CLIENTES.NOME,
     SUM(CONTAS_RECEBER.VALOR_PARCELA)
      FROM CLIENTES INNER JOIN VENDAS  
          ON(CLIENTES.I_CLIENTE = VENDAS.I_CLIENTE)
          INNER JOIN CONTAS_RECEBER
            ON(VENDAS.I_VENDA = CONTAS_RECEBER.I_VENDA)
            GROUP BY 1

--------------------------------------------------------------------------                   



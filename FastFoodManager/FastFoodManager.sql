drop database if exists FastFoodManager;
create database FastFoodManager;
use FastFoodManager;


create table Contas_Pagar(
    Pagar_ID                int auto_increment,
    Pagar_Valor             decimal(8,2) not null,
    Pagar_Data_Vencimento   date,
    Pagar_Descricao         varchar(60),

    primary key(Pagar_ID)
);

create table Valor_Recebido(
    Recebido_ID                int auto_increment,
    Recebido_Valor             decimal(8,2) not null,
    Recebido_Data_Vencimento   date,
    Recebido_Descricao         varchar(60),

    primary key(Recebido_ID)
);

create table Cardapio(
    Item_ID                        int auto_increment,
    Item_nome                     varchar(60),
    Item_Igredientes            varchar(180),
    Item_valor                    decimal(8,2) not null,

    primary key(Item_ID)
 );   
create table Feedback(
	Feedback_ID int auto_increment,
	Nota int,
    primary key(Feedback_ID)
    
    
);
SELECT AVG(Nota) FROM Feedback;
create table  teste(
	id int auto_increment,
    dinheiro1 decimal(8,2),
    dinheiro2 decimal(8,2),
    tempo date,
    primary key(id));



insert into teste(dinheiro1, dinheiro2, tempo)
values(10, 10, '2015-07-21'),
(20, 10, '2018-07-21'),
(30, 10, '2017-07-21'),
(30, 20, '2019-07-21'); 
INSERT INTO teste SET tempo = STR_TO_DATE( "31/05/2014", "%m/%d/%Y" );


SELECT *, DATE_FORMAT(tempo,'%d/%m/%Y') AS data_formatada FROM teste;

SELECT dinheiro1, dinheiro2
FROM teste WHERE tempo  BETWEEN
          '2015-07-21' AND
            '2017-07-21';
SELECT sum(pagar_valor) pagar_valor FROM Contas_Pagar WHERE Pagar_Data_Vencimento between "2012-12-12" AND "2014-12-12" ;
SELECT STR_TO_DATE('21,5,2013','%d,%m,%Y');

SELECT *
FROM Contas_Pagar WHERE Pagar_Data_Vencimento  BETWEEN
str_to_date(21/08/2017, '%d/%m/%Y')
           AND
           str_to_date("23/24/3535", '%d/%m/%Y') ;
SELECT * FROM Valor_Recebido WHERE Recebido_Data_Vencimento 
BETWEEN str_to_date(21/08/2017, '%d/%m/%Y')
AND     str_to_date("23/24/3535", '%d/%m/%Y') ;

            

INSERT INTO PESSOA VALUES(1, 'Patricia Campos', 32733172050, 991543678);
INSERT INTO PESSOA VALUES(2, 'Joao Almeida', 38473166051, 991456578);
INSERT INTO PESSOA VALUES(3, 'Ana Maria', 41869827082, 992935678);
INSERT INTO PESSOA VALUES(4, 'Pedro Santos', 66923086078, 987654323);

INSERT INTO USUARIO VALUES (1, 'patrica@gmail.com', 'pati123');
INSERT INTO USUARIO VALUES (2, 'joao@gmail.com', 'joao123');
INSERT INTO USUARIO VALUES (3, 'ana@gmail.com', 'ana123');
INSERT INTO USUARIO VALUES (4, 'pedro@gmail.com', 'pedro123');

INSERT INTO CARTAO VALUES('Patricia Campos', '3456876534562456', '09/21', '123');
INSERT INTO CARTAO VALUES('Joao Almeida', '3453856534762152', '11/21', '124');
INSERT INTO CARTAO VALUES('Ana Maria', '2153566590763052', '10/20', '125');

INSERT INTO USUARIOHOSPEDE VALUES (1, '3456876534562456');
INSERT INTO USUARIOHOSPEDE VALUES (2, '3453856534762152');
INSERT INTO USUARIOHOSPEDE VALUES (3, '2153566590763052');

INSERT INTO USUARIOPROPRIETARIO VALUES(4);

INSERT INTO HOTEL VALUES(1, 'Tesouro de Noronha Pousada', 4, '8136190191', 'Rua Nice Cordeiro', '25', 'Fernando de Noronha', 'Pernambuco', 'Brasil', 4);
INSERT INTO HOTEL VALUES(2, 'Pousada Lua Bela', 4, '8136190227', 'Rua Amaro Preto', 113, 'Fernando de Noronha', 'Pernambuco', 'Brasil', 4);
INSERT INTO HOTEL VALUES(3, 'Pousada Ze Maria', 4, '8136191258', 'Rua Nice Cordeiro', 1, 'Fernando de Noronha', 'Pernambuco', 'Brasil', 4);
INSERT INTO HOTEL VALUES(4, 'Pousada do Vale', 4, '8136191293', 'Rua Pescador Sérgio Lino', 18, 'Fernando de Noronha', 'Pernambuco', 'Brasil', 4);

INSERT INTO CATEGORIA VALUES(1, 'De luxo');
INSERT INTO CATEGORIA VALUES(2, 'Muito confortavel');
INSERT INTO CATEGORIA VALUES(3, 'Confortavel');
INSERT INTO CATEGORIA VALUES(4, 'Simples');
INSERT INTO CATEGORIA VALUES(5, 'Sem classificação');

INSERT INTO ACOMODACAO VALUES(1, 1, 1, 'Quarto Deluxe com Cama Queen size, acomoda duas pessoas', 880.00);
INSERT INTO ACOMODACAO VALUES(1, 2, 1, 'Quarto Duplo, acomoda duas pessoas', 680.00);
INSERT INTO ACOMODACAO VALUES(1, 3, 2, 'Quarto Duplo com Vista do Jardim, acomoda duas pessoas', 764.00);
INSERT INTO ACOMODACAO VALUES(1, 4, 2, 'Quarto Duplo Deluxe com Vista do Mar, acomoda duas pessoas', 779.00);
INSERT INTO ACOMODACAO VALUES(2, 5, 2, 'Apartamento Deluxe, acomoda duas pessoas', 1128.00);
INSERT INTO ACOMODACAO VALUES(2, 6, 1, 'Bangalo Master, acomoda duas pessoas', 1648.00);
INSERT INTO ACOMODACAO VALUES(2, 7, 1, 'Bangalô Deluxe, acomoda tres pessoas', 1503.00);
INSERT INTO ACOMODACAO VALUES(3, 8, 1, 'Bangalo , acomoda duas pessoas', 2370.00);
INSERT INTO ACOMODACAO VALUES(3, 9, 1, 'Bangalo Especial, acomoda tres pessoas', 3977.00);
INSERT INTO ACOMODACAO VALUES(3, 10, 1,'Apartamento Standard, acomoda duas pessoas', 942.00);
INSERT INTO ACOMODACAO VALUES(4, 11, 1, 'Suite Standard - ARRAIA, acomoda uma pessoa', 950.00);
INSERT INTO ACOMODACAO VALUES(4, 12, 1, 'Suite Superior - Mero, acomoda duas pessoas', 1350.00);

INSERT INTO RESERVA VALUES (1, 1); ##Reserva em nome de Patricia Campos
INSERT INTO RESERVA VALUES (2, 2); ##Reserva em nome de Joao Almeida
INSERT INTO RESERVA VALUES (3, 3); ##Reserva em nome de Ana Maria 

INSERT INTO ITEMRESERVA VALUES(1, 1, 1, 1, '2018-12-31', '2019-01-07', 5600);
INSERT INTO ITEMRESERVA VALUES(2, 2, 2, 2, '2019-10-25', '2019-10-27', 1360);
INSERT INTO ITEMRESERVA VALUES(3, 3, 3, 3, '2018-11-30', '2019-02-04', 51188);

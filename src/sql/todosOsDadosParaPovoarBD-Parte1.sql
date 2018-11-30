INSERT INTO tavagoschema.pessoa VALUES(1, '32733172050', 'Patricia Campos',  '991543678');
INSERT INTO tavagoschema.pessoa VALUES(2, '38473166051', 'Joao Almeida',  '991456578');
INSERT INTO tavagoschema.pessoa VALUES(3, '41869827082', 'Ana Maria',  '992935678');
INSERT INTO tavagoschema.pessoa VALUES(4, '66923086078', 'Pedro Santos', '987654323');

INSERT INTO tavagoschema.usuario VALUES ('patrica@gmail.com', 'pati123', 1);
INSERT INTO tavagoschema.usuario VALUES ('joao@gmail.com', 'joao123', 2);
INSERT INTO tavagoschema.usuario VALUES ('ana@gmail.com', 'ana123', 3);
INSERT INTO tavagoschema.usuario VALUES ('pedro@gmail.com', 'pedro123', 4);

INSERT INTO tavagoschema.cartao VALUES(2,  '3453856534762152', '11/21', );
INSERT INTO tavagoschema.cartao VALUES(3, , '2153566590763052', '10/20', '125');

INSERT INTO tavagoschema.cartao VALUES(1, '123', '3456876534562456', 'Patricia Campos',  '09/21');
INSERT INTO tavagoschema.cartao VALUES(2, '124', '3453856534762152', 'Joao Almeida', '11/21');
INSERT INTO tavagoschema.cartao VALUES(3, '125', '2153566590763052', 'Ana Maria', '10/20');

INSERT INTO tavagoschema.usuariohospede VALUES (1);
INSERT INTO tavagoschema.usuariohospede VALUES (2);
INSERT INTO tavagoschema.usuariohospede VALUES (3);

INSERT INTO tavagoschema.usuarioproprietario VALUES(4);

INSERT INTO tavagoschema.hotel VALUES(1, 'Fernando de Noronha', 'Pernambuco', 'Tesouro de Noronha Pousada', 25, 'Brasil', 4, 'Rua Nice Cordeiro', '8136190191', 4);
INSERT INTO tavagoschema.hotel VALUES(2, 'Fernando de Noronha', 'Pernambuco', 'Pousada Lua Bela', 113, 'Brasil', 4, 'Rua Amaro Preto', '8136190227' , 4);
INSERT INTO tavagoschema.hotel VALUES(3, 'Fernando de Noronha', 'Pernambuco', 'Pousada Ze Maria', 445, 'Brasil', 5, 'Rua Nice Cordeiro', '8136191258', 4);
INSERT INTO tavagoschema.hotel VALUES(4, 'Fernando de Noronha', 'Pernambuco', 'Pousada do Vale', 123, 'Brasil', 2,  'Rua Pescador Sérgio Lino','8136191293', 4);

INSERT INTO tavagoschema.categoria VALUES(1, 'De luxo');
INSERT INTO tavagoschema.categoria VALUES(2, 'Muito confortavel');
INSERT INTO tavagoschema.categoria VALUES(3, 'Confortavel');
INSERT INTO tavagoschema.categoria VALUES(4, 'Simples');
INSERT INTO tavagoschema.categoria VALUES(5, 'Sem classificação');

INSERT INTO tavagoschema.acomodacao VALUES(1, 'Quarto Deluxe com Cama Queen size, acomoda duas pessoas', 880.00, 1, 1);
INSERT INTO tavagoschema.acomodacao VALUES(2, 'Quarto Duplo, acomoda duas pessoas', 680.00, 2, 1);
INSERT INTO tavagoschema.acomodacao VALUES(3, 'Quarto Duplo com Vista do Jardim, acomoda duas pessoas',  764.00, 2, 1);
INSERT INTO tavagoschema.acomodacao VALUES(4, 'Quarto Duplo Deluxe com Vista do Mar, acomoda duas pessoas', 779.00, 2, 1);
INSERT INTO tavagoschema.acomodacao VALUES(5, 'Apartamento Deluxe, acomoda duas pessoas', 1128.00, 2, 2);
INSERT INTO tavagoschema.acomodacao VALUES(6, 'Bangalo Master, acomoda duas pessoas',  1648.00, 1, 2);
INSERT INTO tavagoschema.acomodacao VALUES(7, 'Bangalô Deluxe, acomoda tres pessoas', 1503.00, 1, 2);
INSERT INTO tavagoschema.acomodacao VALUES(8, 'Bangalo , acomoda duas pessoas', 2370.00, 1, 3);
INSERT INTO tavagoschema.acomodacao VALUES(9, 'Bangalo Especial, acomoda tres pessoas', 3977.00 , 1, 3);
INSERT INTO tavagoschema.acomodacao VALUES(10, 'Apartamento Standard, acomoda duas pessoas', 942.00, 1, 3);
INSERT INTO tavagoschema.acomodacao VALUES(11, 'Suite Standard - ARRAIA, acomoda uma pessoa', 950.00, 1, 4);
INSERT INTO tavagoschema.acomodacao VALUES(12, 'Suite Superior - Mero, acomoda duas pessoas', 1350.00, 1, 4);

INSERT INTO tavagoschema.hospede VALUES(1, 'Patricia Campos', 'Rua Filomena Segundo Nascimento', 123,, 'Brasil');
INSERT INTO tavagoschema.hospede VALUES(2, 'João Almeida', 'Rua Do Dinar', 213, 'Campo Grande', 'MS', 'Brasil');
INSERT INTO tavagoschema.hospede VALUES('Campo Grande', 'MS',313,'Brasil',3, 'Ana Maria', 'Rua Golf', 313, , 'Brasil');

INSERT INTO tavagoschema.hospede VALUES('Campo Grande', 'MS', 123, 'Brasil', 'Rua Filomena Segundo Nascimento', 1);
INSERT INTO tavagoschema.hospede VALUES('Campo Grande', 'MS', 213, 'Brasil', 'Rua Do Dinar', 2);
INSERT INTO tavagoschema.hospede VALUES('Campo Grande', 'MS', 313, 'Brasil', 'Rua Golf', 3);

INSERT INTO tavagoschema.reserva VALUES (1, 1); --Reserva em nome de Patricia Campos--
INSERT INTO tavagoschema.reserva VALUES (2, 2); --Reserva em nome de Joao Almeida--
INSERT INTO tavagoschema.reserva VALUES (3, 3); --Reserva em nome de Ana Maria-- 

INSERT INTO tavagoschema.itemreserva VALUES(1, '2019-01-07', '2018-12-31', 5600, 1, 1, 1);
INSERT INTO tavagoschema.itemreserva VALUES(2, '2019-10-27', '2019-10-25', 1360, 2, 2, 2);
INSERT INTO tavagoschema.itemreserva VALUES(3, '2019-02-04', '2018-11-30', 51188, 3, 3, 3);
set search_path="tavagoschema";

INSERT INTO PESSOA VALUES(1, 'Patricia Campos', '32733172050', '991543678');
INSERT INTO PESSOA VALUES(2, 'Joao Almeida', '38473166051', '991456578');
INSERT INTO PESSOA VALUES(3, 'Ana Maria', '41869827082', '992935678');
INSERT INTO PESSOA VALUES(4, 'Pedro Santos', '66923086078', '987654323');

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

INSERT INTO HOSPEDE VALUES(1, 'Rua Filomena Segundo Nascimento', 123, 'Campo Grande', 'MS', 'Brasil');
INSERT INTO HOSPEDE VALUES(2, 'Rua Do Dinar', 213, 'Campo Grande', 'MS', 'Brasil');
INSERT INTO HOSPEDE VALUES(3, 'Rua Golf', 313, 'Campo Grande', 'MS', 'Brasil');

INSERT INTO RESERVA VALUES (1, 1); --Reserva em nome de Patricia Campos--
INSERT INTO RESERVA VALUES (2, 2); --Reserva em nome de Joao Almeida--
INSERT INTO RESERVA VALUES (3, 3); --Reserva em nome de Ana Maria-- 

INSERT INTO ITEMRESERVA VALUES(1, 1, 1, 1, '2018-12-31', '2019-01-07', 5600);
INSERT INTO ITEMRESERVA VALUES(2, 2, 2, 2, '2019-10-25', '2019-10-27', 1360);
INSERT INTO ITEMRESERVA VALUES(3, 3, 3, 3, '2018-11-30', '2019-02-04', 51188);

UPDATE HOTEL
SET descricao = 'A Tesouro de Noronha dispõe de piscina ao ar livre e está situada em Fernando de Noronha, a 900 metros da Vila dos Remédios. Esta pousada oferece transfer de cortesia e Wi-Fi gratuito. O Porto de Santo Antônio fica a 2,2 km.

Alguns quartos possuem varanda com vista do mar. Certas unidades da Tesouro de Noronha oferecem vista da piscina, e todas apresentam banheiro privativo. Outras comodidades incluem ar-condicionado, mesa de trabalho, guarda-roupa e TV de tela plana.'
WHERE idHotel = 1;

UPDATE HOTEL
SET descricao = 'Uma das nossas principais opções em Fernando de Noronha.A Pousada Lua Bela, localizada a apenas 10 minutos a pé das praias do Cachorro e da Conceição, oferece uma piscina e buffet de café-da-manhã diário. O centro histórico, na Vila dos Remédios, fica a 1 km de distância.

Todos os quartos da Lua Bela apresentam decoração simples, ar-condicionado, TV, frigobar, roupa de cama, toalhas e banheiro privativo.'

WHERE idHotel = 2;

UPDATE HOTEL
SET descricao = 'Situada a 200 metros de bares e restaurantes e a 2 km do centro histórico de Fernando de Noronha, a Pousada Zé Maria oferece uma bela piscina com vista da paisagem.

A propriedade dispõe de quartos e casas de férias climatizadas. As acomodações incluem TV Sky HD, frigobar e banheiro privativo com chuveiro aquecido. As Casas de Férias Deluxe possuem varanda com banheira de hidromassagem.'
WHERE idHotel = 3;

UPDATE HOTEL
SET descricao = 'Esta bela pousada está localizada na maravilhosa ilha de Fernando de Noronha, a apenas 250 metros da Praia do Cachorro. A propriedade oferece massagens para casal, spa, piscina natural, jardins no local e um pomar, além de estacionamento gratuito.

Os quartos da Pousada do Vale apresentam roupas de cama coloridas de 200 fios, piso frio e cortinas blackout. Todos dispõem de ar-condicionado, TV a cabo e frigobar. O WiFi gratuito está disponível nos quartos e em todo o hotel.'
WHERE idHotel = 4;


INSERT INTO HOTEL VALUES(5, 'Ez Aclimação Hotel', 5, '1133467799', 'Av. Armando Ferrentini',  668,  'Sao Paulo', 'Sao Paulo', 'Brasil', 4, 'Situado a apenas 1 km do Parque da Aclimação de São Paulo e Shopping Pátio Paulista, o Ez Aclimação dispõe de piscina, sauna, academia, 2 restaurantes, bar e Wi-Fi gratuito. Com frigobar e cofre, todos os quartos têm ar-condicionado. O serviço de quarto também está disponível.');
INSERT INTO HOTEL VALUES(6, 'Ibis Sao Paulo Ibirapuera', 5, '1143808877', 'Avenida Santo Amaro', 1411, 'Sao Paulo', 'Sao Paulo', 'Brasil', 4, 'O Ibis Sao Paulo Ibirapuera está localizado em São Paulo, a 1 km da Avenida Faria Lima x Avenida Juscelino Kubitschek. Você pode desfrutar de um bar no local. Os quartos do hotel dispõem de ar-condicionado, TV e um banheiro privativo. Para sua comodidade, produtos de banho gratuitos e secador de cabelo são fornecidos.');

INSERT INTO ACOMODACAO VALUES(5,13, 3, ' Apartamento de 2 Quartos com 4 Camas de Solteiro, acomoda quatro pessoas', 412.00);
INSERT INTO ACOMODACAO VALUES(5,14, 3, 'Estúdio Superior com 1 Cama de Casal, acomoda duas pessoas', 241.00);
INSERT INTO ACOMODACAO VALUES(5,15, 3, 'Estúdio, acomoda duas pessoas', 198.00);
INSERT INTO ACOMODACAO VALUES(6,16, 3, ' Quarto Duplo Standard, acomoda duas pessoas', 329.70);
INSERT INTO ACOMODACAO VALUES(6,17, 3, 'Quarto Standard com 2 Camas de Solteiro, acomoda duas pessoas', 329.70);



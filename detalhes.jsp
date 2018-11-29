<%-- 
    Document   : detalhes
    Created on : 10/11/2018, 19:40:43
    Author     : Vitoria Holanda Vidal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Detalhe</title>
        <meta charset="utf-8">
        <link rel="stylesheet" type="text/css" href="detalhe.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <style>
            .mySlides {display:none;}
        </style>
    </head>
    <body>
        <div class="informacaoHotel">
            <!--Inserir o nome da Pousada-->
            <h2>Tesouro de Noronha</h2>

            <!--Inserir o endereco-->
            <h4>Rua Nice Cordeiro, Fernando de Noronha, CEP 53990-000, Brasil</h4>
        </div>

        <!--Apresenta as fotos de cada hotel-->
        <div class="fotos">
            <img class="mySlides" src="${consulta.id}/1.jpg" style="width:944px ; height:799px">
            <img class="mySlides" src="${consulta.id}/2.jpg" style="width:944p  ; height:799px">
            <img class="mySlides" src="${consulta.id}/3.jpg" style="width:944px ; height:799px">
            <img class="mySlides" src="${consulta.id}/4.jpg" style="width:944px ; height:799px">
            <img class="mySlides" src="${consulta.id}5.jpg"  style="width:944px ; height:799px">

            <button class="w3-button w3-black w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
            <button class="w3-button w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button>
        </div>

        <script>
            var slideIndex = 1;
            showDivs(slideIndex);

            function plusDivs(n) {
                showDivs(slideIndex += n);
            }

            function showDivs(n) {
                var i;
                var x = document.getElementsByClassName("mySlides");
                if (n > x.length) {
                    slideIndex = 1
                }
                if (n < 1) {
                    slideIndex = x.length
                }
                for (i = 0; i < x.length; i++) {
                    x[i].style.display = "none";
                }
                x[slideIndex - 1].style.display = "block";
            }
        </script>

    </div>
    <div class="descricao">
        <p>
            A Tesouro de Noronha dispõe de piscina ao ar livre e está situada em Fernando de Noronha, a 900 metros da Vila dos Remédios. Esta pousada oferece transfer de cortesia e Wi-Fi gratuito. O Porto de Santo Antônio fica a 2,2 km.

            Alguns quartos possuem varanda com vista do mar. Certas unidades da Tesouro de Noronha oferecem vista da piscina, e todas apresentam banheiro privativo. Outras comodidades incluem ar-condicionado, mesa de trabalho, guarda-roupa e TV de tela plana.

            O buffet de café da manhã é servido diariamente na Tesouro de Noronha.

            A pousada fica a 2,2 km da Praia do Sueste. O Aeroporto de Fernando de Noronha é o mais próximo, localizado a 1 km. 

            Esta é a parte de Fernando de Noronha de que os nossos hóspedes mais gostam, de acordo com avaliações independentes.

            Casais particularmente gostam da localização — eles deram nota 9,4 para viagem a dois.

            Esta acomodação é avaliada pelo melhor custo-benefício em Fernando de Noronha! O dinheiro dos hóspedes vale mais, quando comparado com outras acomodações nesta cidade.

            Nós falamos a sua língua!

            Tesouro de Noronha tem recebido hóspedes do TAVAgo.com desde 03 de dez. de 2018.</p>
    </div>
    <div class="acomodacoes">

        <table>
            <div class="acomodacoes">

                <table>
                    <tr>
                        <th>Tipo de  Quarto</th>
                        <th>Acomoda</th>
                        <th>Selecionar nº de quartos</th>
                        <th></th>
                    </tr>
                    <tr>
                        <td>Suite Standard - ARRAIA</td>
                        <td>2</td>
                        <td>
                            <select name="quantidade">
                                <option value="zero">0</option>
                                <option value="um">1</option>
                            </select>
                        </td>
                        <td><input type="submit" value="Vou Reservar"></td>
                    </tr>
                    <tr>
                        <td>Suite Superior - Mero</td>
                        <td>3</td>
                        <td>
                            <select name="quantidade">
                                <option value="zero">0</option>
                                <option value="um">1</option>
                            </select>
                        <td><input type="submit" value="Vou Reservar"></td>
                        </td>
                    </tr>
                </table>

            </div>
            <footer>

            </footer>

            </body>
            </html>
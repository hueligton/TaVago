<%-- 
    Document   : detalhes
    Created on : 10/11/2018, 19:40:43
    Author     : Vitoria Holanda Vidal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Detalhe</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/swiper.min.css">
        <link rel="stylesheet" type="text/css" href="styles/detalhe.css">
        <link rel="shortcut icon" href="images/favicon.ico"/>
    </head>
    <body>
        <!--Navegation Bar-->
        <div class="row">
            <div class="logo">
                <a href="${pageContext.request.contextPath}/home">
                    <img src="images/logo-tavago.png">
                </a>
            </div>
            <div class="carrinho">
                <a href="${pageContext.request.contextPath}/carrinho">
                    <img src="images/carrinho.png">
                    <a/>
            </div>     
        </div>

        <div class="informacaohotel">     
            <!--Informa o nome da Pousada-->
            <h2>${hotel.nome}</h2>

            <!--Informa o endereco-->
            <p>${hotel.rua}, ${hotel.cidade} - ${hotel.estado}, ${hotel.pais}</p>

            <h3>Confira as fotos do Hotel</h3>
        </div>

        <!-- Swiper -->
        <div class="swiper-container">
            <div class="swiper-wrapper">
                <!--Apresenta as imagens do hotel-->
                <c:forEach var="nmr" begin="1" end="7">
                    <div class="swiper-slide">
                        <div class="img">
                            <img src="hotel/${hotel.idHotel}/${nmr}.jpg">                            
                        </div>
                        <div class="detalhes">
                            <h3>Hotel<br><span>${hotel.nome}</span></h3>
                        </div>
                    </div>
                </c:forEach>

            </div>
        </div>

        <!-- Add Pagination -->
        <div class="swiper-pagination"></div>



        <!-- Swiper JS -->
        <script type="text/javascript" src="javascript/swiper.min.js"></script> 

        <!-- Initialize Swiper -->
        <script>
            var swiper = new Swiper('.swiper-container', {
                effect: 'coverflow',
                grabCursor: true,
                centeredSlides: true,
                slidesPerView: 'auto',
                coverflowEffect: {
                    rotate: 50,
                    stretch: 0,
                    depth: 100,
                    modifier: 1,
                    slideShadows: true
                },
                pagination: {
                    el: '.swiper-pagination'
                }
            });
        </script>
        <!--Apresenta a descricao do hotel-->
        <div class="descricao">
            <p>
                A ${hotel.nome} dispõe de piscina ao ar livre e está situada em Fernando de Noronha, a 900 metros da Vila dos Remédios. Esta pousada oferece transfer de cortesia e Wi-Fi gratuito. O Porto de Santo Antônio fica a 2,2 km.
            </p>

            <p>
                Alguns quartos possuem varanda com vista do mar. Certas unidades da Tesouro de Noronha oferecem vista da piscina, e todas apresentam banheiro privativo. Outras comodidades incluem ar-condicionado, mesa de trabalho, guarda-roupa e TV de tela plana.
            </p>

            <p>
                O buffet de café da manhã é servido diariamente na Tesouro de Noronha.
            </p>

            <p>
                A pousada fica a 2,2 km da Praia do Sueste. O Aeroporto de Fernando de Noronha é o mais próximo, localizado a 1 km. 
            </p>

            <p>    
                ${hotel.nome} tem recebido hóspedes do TAVAgo.com desde 03 de dez. de 2018.</p>
        </div>
        <!--Verifica se existe acomodacoes relacionada ao hotel-->
        <c:choose>
            <c:when test="${empty hotel.acomodacao}">
                <p>- N&atilde;o h&aacute; acomodações para esse hotel </p>
            </c:when>
            <c:otherwise>
                <!--Apresenta as acomodacoes do hotel-->
                <div class="acomodacoes">
                    <!--Tabbelas com as acomodacoes-->
                    <table class="lista-acomodacao">
                        <tr>
                            <th>Tipo de  Quarto</th>
                            <th>Selecionar nº de quartos</th>
                            <th>Preço</th>
                            <th></th>
                        </tr>
                        <c:forEach var="acomodacoes" items="${hotel.acomodacao}">

                            <tr>
                                <td>${acomodacoes.descricao} </td>
                            <form method="POST" action="${pageContext.request.contextPath}/adicionarCarrinho">
                                <td>
                                    <select name="quantidade" id="quantidade">
                                        <option value="0">0</option>
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                    </select> 
                                </td>
                                <td> R$ ${acomodacoes.valor} </td>
                                <td><input type="hidden" id="idAcomodacao" name="idAcomodacao" value="${acomodacoes.idAcomodacao}"><input type="submit" value="Vou Reservar" id="enviado"></td>
                            </form>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </c:otherwise>
        </c:choose>
        <footer>

        </footer>
    </body>
</html>




















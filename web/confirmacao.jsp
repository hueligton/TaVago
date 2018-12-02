<%-- 
    Document   : confirmacao
    Created on : 10/11/2018, 19:39:37
    Author     : Vitoria Holanda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/swiper.min.css">
        <link rel="stylesheet" type="text/css" href="styles/confirmacao.css">
        <title>JSP Page</title>
    </head>
    <body>
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
                    
        <c:choose>
            <c:when test="${empty carrinho.itensCarrinho}"> 
                <p class="verificacao">- Não há reservas em seu nome </p>
            </c:when>
            <c:otherwise>

                <!--Apresenta os dados do hospede-->
                <div class="informacaohospede">
                    <h3 class="confirmacao1">Confirmação:</h3>
                    <p class="confirmacao2">Confirme se seus dados estão corretos</p>
                    <div class="swiper-container">
                        <div class="swiper-wrapper">
                            <!--Loop para retornar a lista de acomodações-->
                            <c:forEach var="itemCarrinho" items="${carrinho.itensCarrinho}">
                                <div class="swiper-slide">
                                    <div class="descricao">
                                        <!--Informa o nome do usuario-->
                                        <h5>NOME DO HOSPEDE:</h5>
                                        <p>${itemCarrinho.hospede.nome}</p>

                                        <!--Informa o nome do usuario-->
                                        <h5>TELEFONE:</h5>
                                        <p>${itemCarrinho.hospede.telefone}</p>

                                        <!--Informa a data de entrada-->
                                        <h5>DATA DE ENTRADA:</h5>
                                        <p><fmt:formatDate value="${itemCarrinho.dataInicial}" pattern="dd/MM/yyyy" /></p>

                                        <!--Informa a data de saida-->
                                        <h5>DATA DE SAÍDA:</h5>
                                        <p><fmt:formatDate value="${itemCarrinho.dataFinal}" pattern="dd/MM/yyyy" /></p>

                                        <!--Informa a acomodacao-->
                                        <h5>ACOMODAÇÃO:</h5>
                                        <p>${itemCarrinho.acomodacao.descricao}, R$: ${itemCarrinho.acomodacao.valor}</p>
                                    </div>

                                </div>
                            </c:forEach>
                        </c:otherwise>
                    </c:choose>


                </div>
            </div>


            <!-- Add Pagination -->
            <div class="swiper-pagination"></div>



            <!-- Swiper JS -->
            < type="text/java" src="java/swiper.min.js"></> 

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
                        slideShadows: true,
                    },
                    pagination: {
                        el: '.swiper-pagination',
                    },
                });
            </script>

            <form class="confirma-dados" method="POST" action="${pageContext.request.contextPath}/resultado">
                <input type="hidden" value="${itemCarrinho.hospede.id}">
                <input type="submit" name="confirmardados" value="CONFIRMAR">
            </form>

        </div>

    </div>

</body>
</html>

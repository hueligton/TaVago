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
        <link rel="stylesheet" type="text/css" href="styles/confirmacao.css">
        <link rel="shortcut icon" href="images/favicon.ico"/>
        <title>TaVago - Confirmação</title>
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

        <!--Apresenta os dados do hospede-->
        <div class="informacaohospede">
            <h3>Confirmação:</h3>
            <p>Confirme se seus dados estão correto</p>
            <c:choose>
                <c:when test="${empty carrinho.itensCarrinho}"> 
                    <p>- N&atilde;o h&aacute; reservas em seu nome </p>
                </c:when>
                <c:otherwise>
                    <!--Loop para retornar a lista de acomodações-->
                    <c:forEach var="itemCarrinho" items="${carrinho.itensCarrinho}">
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
                    </c:forEach>
                </c:otherwise>
            </c:choose>
            <form class="confirma-dados" method="POST" action="${pageContext.request.contextPath}/resultado">

                <input type="submit" name="confirmardados" value="CONFIRMAR">
            </form>



        </div>

    </div>

</body>
</html>

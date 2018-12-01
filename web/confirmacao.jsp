<%-- 
    Document   : confirmacao
    Created on : 10/11/2018, 19:39:37
    Author     : Vitoria Holanda
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

        <!--Apresenta os dados do hospede-->
        <div class="informacaohospede">
                <h3>Confirmação:</h3>
                <p>Confirme se seus dados estão correto</p>
                <!--Informa o nome do usuario-->
                <h5>NOME DO HOSPEDE:</h5>
                <p> vitoria${itemCarrinho.hospede.nome}</p>

                <!--Informa o nome do usuario-->
                <h5>TELEFONE:</h5>
                <p>${itemCarrinho.hospede.telefone}</p>

                <!--Informa a data de entrada-->
                <h5>DATA DE ENTRADA:</h5>
                <p>${itemCarrinho.dataInicial}</p>

                <!--Informa a data de saida-->
                <h5>DATA DE SAÍDA:</h5>
                <p>${itemCarrinho.dataInicial}</p>

                <!--Informa a acomodacao-->
                <h5>ACOMODAÇÃO:</h5>
                <p>${itemCarrinho.acomodacao.detalhe}, R$: ${itemCarrinho.acomodacao.valor}</p>
                
                <input type="hidden" value="${itemCarrinho.hospede.id}">
                <input type="submit" name="confirmardados" value="CONFIRMAR">

        </div>

    </body>
</html>

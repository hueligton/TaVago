<%-- 
    Document   : login
    Created on : Nov 29, 2018, 9:15:19 AM
    Author     : felipecaggi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/home-carrinho-login-dadoshospedes-resultado.css"/>
        <link rel="shortcut icon" href="images/favicon.ico"/>
        <title>TaVago - Login</title>
    </head>
    <body id="login-page">

        <!-- Envoltório do cabeçalho da página Dados hospede -->
        <div class="header-wrap login-hw">

            <!-- Container da grade de navegação superior -->
            <div class="container-to-grid">

                <!-- Top bar (logo e opções de navegação) -->
                <nav class="top-bar">

                    <!-- Logotipo TaVago -->
                    <div class="logo-tavago">
                        <a href="${pageContext.request.contextPath}/home">
                            <img class="logo-tavago" src="images/logo-tavago.png" alt="TAVAGO"/>
                        </a>
                    </div>
                </nav>
            </div>
        </div>

        <!-- Conteúdo da página principal -->
        <section class="main-content">

            <header id="home-top">
                <div class="form-description">
                    <h2>Acessar conta</h2>
                </div>
                <c:if test="${acesso==0}">
                    <div class="error-login">
                        <h2>Não conseguimos acessar sua conta.</h2>
                        <h2>Verifique se o e-mail de usuário e senha foram digitados corretamente.</h2>
                    </div>
                </c:if>
            </header>
            
            

            <div class="home-content">
                <div class="form-wrap">

                    <form class="formulario-login" method="POST" action="${pageContext.request.contextPath}/dadoshospede">

                        <div id="input-email" class="input-wrap">
                            <label class="input-wrap-label" for="email">E-mail</label>
                            <input type="text" class="form-control email-mask input-wrap-input" name="email" id="email" placeholder="Ex.: james@email.com" required>
                        </div>

                        <div id="input-password" class="input-wrap">
                            <label class="input-wrap-label" for="senha">Senha</label>
                            <input type="password" class="form-control password-mask input-wrap-input" name="senha" id="senha" autocomplete="off" required>
                        </div>

                        <div id="input-submit" class="input-wrap">
                            <input type="submit" value="acessar">    
                        </div>

                    </form>

                </div>
            </div>

        </section>

    </body>
</html>
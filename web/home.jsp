<%-- 
    Document   : home
    Created on : Nov 16, 2018, 6:55:31 PM
    Author     : felipecaggi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/home.css"/>
        <title>TaVago</title>
    </head>
    <body id="home-page">

        <!-- Envoltório do cabeçalho da página home -->
        <div class="header-wrap home-hw">

            <!-- Container da grade de navegação superior -->
            <div class="container-to-grid">
                
                <!-- Top bar (logo e opções de navegação) -->
                <nav class="top-bar">
                
                    <!-- Logotipo TaVago -->
                    <div class="logo-tavago">
                        <a href="${pageContext.request.contextPath}/home">
                            <img class="logo-tavago" src="images/logo-tavago.png" alt="tavago"/>
                        </a>
                    </div>
                    
                    <!-- Seção de opções de navegação -->
                    <div class="top-bar-section">
                        <ul class="options">
                            <li>
                                <a href="${pageContext.request.contextPath}/carrinho">
                                    <img class="carrinho" src="images/carrinho.png" alt="carrinho"/>
                                </a>
                            </li>
                        </ul>
                    </div>
                </nav>
            </div>

            <!-- Cabeçalho -->
            <header class="header-welcome">
                <h1>Bem-vindo ao TaVago!</h1>
                <h3>O melhor hotel você encontra aqui</h3>
            </header>
        </div>
        
        <!-- Conteúdo da página principal -->
        <div class="main-content"> 
            
            <!-- <header id="home-top"></header> Espaço para cabeçalho secundário -->
            
            <div class="home-content">

                <!-- Formulário de consulta definido no diagrama de navegação -->
                <form class="formulario-consulta" method="POST" action="${pageContext.request.contextPath}/consulta">
                    
                    <div class="destino">
                        <label for="destino">Destino</label><br>
                        <input type="text" name="destino" id="destino" required><br>
                    </div>
                    
                    <div class="datas">
                        <div class="entrada">
                            <label for="dataInicial">Data de check-in</label><br>
                            <input type="date" name="dataInicial" id="dataInicial" required><br>
                        </div>

                        <div class="saida">
                            <label for="dataFinal">Data de check-out</label><br>
                            <input type="date" name="dataFinal" id="dataFinal" required><br>
                        </div>
                    </div>

                    <div class="quantidade">
                        <label for="quantidadePessoas">Quantidade hóspedes</label><br>
                        <select name="quantidadePessoas" id="quantidadePessoas">
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="4">5</option>
                            <option value="4">6</option>
                            <option value="4">7</option>
                            <option value="4">8</option>
                            <option value="4">9</option>
                        </select>
                    </div>

                    <input type="submit" value="BUSCAR HOTEL">
                    
                </form>
            
            </div>

        </div>

        <!-- #TODO - Verificar necessidade de implementação do footer -->
        <!-- <footer></footer> -->

    </body>
</html>
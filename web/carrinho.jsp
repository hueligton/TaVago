<%-- 
    Document   : carrinho
    Created on : Nov 17, 2018, 4:38:36 PM
    Author     : felipecaggi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/carrinho.css"/>
        <title>Carrinho</title>
    </head>
    <body id="carrinho-page">

        <!-- Envoltório do cabeçalho da página home -->
        <div class="header-wrap carrinho-hw">

            <!-- Container da grade de navegação superior -->
            <div class="container-to-grid">

                <!-- Top bar (logo e opções de navegação) -->
                <nav class="top-bar">

                    <!-- Logotipo TaVago -->
                    <div class="logo-tavago">
                        <a href="./home.html">
                            <img class="logo-tavago" src="images/logo-tavago.png" alt="TAVAGO"/>
                        </a>
                    </div>

                </nav>
            </div>

        </div>

        <!-- Conteúdo da página principal -->
        <section class="main-content">

            <header id="home-top">
                <div class="cart-name">
                    <h2>Meu carrinho</h2>
                </div>
            </header>

            <div class="home-content">
                <section class="basket-wrap">
                    <div class="basket-room">
                        <table class="list-rooms">
                            <tr class="basket-collumns">
                                <th class="collumn1">Quarto</th>
                                <th class="collumn2">Quantidade</th>
                                <th class="collumn3">Preço</th>
                            </tr>

                            <tr class="room1">
                                <td class="collumn1">
                                    <div class="room">
                                        <p>Quarto Deluxe com Cama Queen-size</p>
                                    </div>
                                </td>
                                <td class="collumn2">
                                    <div class="quantidade-quartos">
                                        <select name="quantidade-quartos">
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
                                        <a class="remove-room" href="">
                                            <p>remover</p>
                                        </a>
                                    </div>
                                </td>
                                <td class="collumn3">
                                    <div class="total-price-room">
                                        <p>R$ 880,00</p>
                                    </div>    
                                </td>
                            </tr>
                        </table>
                    </div>

                    <div class="basket-summary">
                        <div class="total-price">
                            <h3>Preço total</h3>
                            <p>R$ 880,00</p>
                        </div>
                        <div class="confirm">
                            <a class="complete-purchase">CONCLUIR COMPRA</a>
                        </div>
                    </div>
                </section>

            </div>

        </section>

    </body>
</html>
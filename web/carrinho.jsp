<%-- 
    Document   : carrinho
    Created on : Nov 17, 2018, 4:38:36 PM
    Author     : felipecaggi
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                        <a href="${pageContext.request.contextPath}/home">
                            <img class="logo-tavago" src="images/logo-tavago.png" alt="TAVAGO"/>
                        </a>
                    </div>
                </nav>
            </div>
        </div>

        <!-- Conteúdo da página principal -->
        <section class="main-content">
            
            <c:if test="${not empty carrinho}">
                <header id="home-top">
                    <div class="cart-name">
                        <h2>Meu carrinho</h2>
                    </div>
                </header>
            </c:if>

            <div class="home-content">
                <section class="cart-wrap">

                    <%-- Estrutura condicional baseada no que verificação de items no carrinho --%>
                    <c:choose>

                        <%-- Verifica se o carrinho está vazio --%>
                        <c:when test="${empty carrinho}">
                            <div class="empty-cart">
                                <p>seu carrinho est&aacute; vazio</p>
                            </div>
                        </c:when>

                        <c:otherwise>
                            <%-- Envoltório destinado ao carrinho que conterá informações dos itens adicionados --%>
                            <div class="cart-room">
                                <table class="room-items">
                                    <tr class="cart-collumns">
                                        <th class="delete-collumn">Excluir?</th>
                                        <th class="description-collumn">Quarto</th>
                                        <th class="quantity-collumn">Quantidade</th>
                                        <th class="value-collumn">Preço</th>
                                    </tr>

                                     <c:forEach var="cart" items="${carrinho}">
                                        <%-- Cada linha da tabela representa um item no carrinho --%>
                                        <tr class="item">
                                            
                                            <%-- Coluna de deleção de acomodações --%>
                                            <td class="delete-collumn">
                                                <div class="delete-checkbox">
                                                    <form name="delete-form" method="post">
                                                        <input type="checkbox" name="acomodacaoDeletada${cart.acomodacao.idAcomodacao}" value="${cart.acomodacao.idAcomodacao}">
                                                    </form>
                                                </div>
                                            </td>

                                            <%-- Coluna de descrição das acomodações --%>
                                            <td class="description-collumn">
                                                <div class="room">
                                                    <p><c:out value="${cart.acomodacao.descricao}"/></p>
                                                </div>
                                            </td>

                                            <%-- Coluna de quantidade de acomodações selecionadas --%>
                                            <td class="quantity-collumn">
                                                <div class="room-quantity">
                                                    <form name="room-quantity" method="post">
                                                        <select name="quantidade-quartos">

                                                            <%-- Estrutura de repetição que verifica qual a quantidade de quartos que foi selecionado, gerando o html correspondente --%>
                                                            <c:forEach  var="counter" begin="1" end="9">
                                                                <c:choose>
                                                                    <c:when test="${counter == quantidadeQuartos}">
                                                                        <option selected value="${counter}">${counter}</option>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <option value="${counter}">${counter}</option>
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </c:forEach>

                                                        </select>
                                                    </form>
                                                </div>
                                            </td>

                                            <%-- Coluna do valor total (quantidade de acomodações * valor da acomodação) --%>
                                            <td class="value-collumn">
                                                <div class="total-price-room">
                                                    <p>R$ ${valorTotalPorAcomodacao}</p>
                                                </div>                                           
                                            </td>
                                        </tr>
                                   </c:forEach>
                                </table>

                                <%--Botões de atualização caso algum item do carrinho sofra alteração --%>                                
                                <div class="update-buttons">
                                    
                                    <%--Botão para remover item caso selecionado algum checkbox relacionado a exclusão --%>
                                    <div class="delete">
                                        <a class="delete-accommodation" href="${pageContext.request.contextPath}/removerItem">remover acomoda&ccedil;&otilde;es selecionadas</a>
                                    </div>

                                    <%--Botão para atualizar preço caso haja mudança na quantidade de quartos da acomodação --%>
                                    <div class="update">
                                        <a class="update-price" href="${pageContext.request.contextPath}/atualizarPreco">atualizar pre&ccedil;o</a>
                                    </div>      
                                </div>
                                
                            </div>

                            <%-- Envoltório destinado ao resumo do carrinho que conterá o valor total dos itens adicionados --%>
                            <div class="cart-summary">
                                <div class="total-price">
                                    <h3>Preço total</h3>
                                    <p>R$ ${valorTotalCarrinho}</p>
                                </div>

                                <%-- Botão para confirmar compra --%>
                                <div class="confirm">
                                    <a class="complete-purchase" href="${pageContext.request.contextPath}/login">Continuar</a>
                                </div>
                            </div>

                        </c:otherwise>
                    </c:choose>
                </section>
            </div>
        </section>
    </body>
</html>
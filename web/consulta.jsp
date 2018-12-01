<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/consulta.css"/>
        <link rel="shortcut icon" href="images/favicon.ico"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>TaVago - Consulta</title>
    </head>
    <body id="consulta-page">
        <div class="top-bar">

            <!-- Logotipo TaVago -->
            <div class="logo-tavago">
                <a href="${pageContext.request.contextPath}/home">
                    <img class="logo-tavago" src="images/logo-tavago.png" alt="tavago"/>
                </a>
            </div>

            <!-- Seção de opções de navegação -->
            <div class="top-bar-section">
                <a href="${pageContext.request.contextPath}/carrinho">
                    <img class="carrinho" src="images/carrinho.png" alt="carrinho"/>
                </a>
            </div>
        </div>
        <div class="consulta">
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
            <div class="card-view">
                <c:choose>
            <c:when test="${empty consulta}"> 
                <p>- N&atilde;o h&aacute; hoteis </p>
            </c:when>
            <c:otherwise>
                <c:forEach var="consulta" items="${consulta}">
                    <div class="card">
                        <img src="hotel/${consulta.idHotel}/1.jpg" style="width:100%">
                        <div class="container">
                            <h4><b>${consulta.nome}</b></h4> 
                            <p>Avaliação:
                                <!-- Loop para a apresentação das estrelas de cada hotel -->
                                <c:forEach var="star" begin="1" end="${consulta.quantidadeEstrela}" >
                                    <span class="fa fa-star checked"></span>
                                </c:forEach>
                            </p>
                            <p>Endereço: ${consulta.rua}, ${consulta.cidade}, ${conulta.estado}</p>
                            <form method="POST" action="${pageContext.request.contextPath}/detalhes">
                                <input id="idHotel" name="idHotel" value="${consulta.idHotel}" type="hidden">
                                <input class="detail" type="submit" name="detalhes" value="DETALHES">
                            </form>
                        </div>
                    </div>
                </c:forEach>
            </c:otherwise>
        </c:choose>
            </div>
    </body>
</html>

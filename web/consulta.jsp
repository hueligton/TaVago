<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/pagamento-consulta.css"/>
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
                    <img class="carrinho" src="images/shopping-cart.png" alt="carrinho"/>
                </a>
            </div>
        </div>
        <div class="consulta">
            <form class="formulario-consulta" method="GET" action="${pageContext.request.contextPath}/consulta">

                <div class="destino">
                    <label for="destino">Destino</label><br>
                    <input type="text" name="destino" id="destino" <c:choose>
                               <c:when test="${not empty destino}"> 
                                   value="${destino}"
                               </c:when>
                           </c:choose> required><br>
                </div>

                <div class="datas">
                    <div class="entrada">
                        <label for="dataEntrada">Data de check-in</label><br>
                        <input type="date" name="dataEntrada" id="dataEntrada" <c:choose>
                                   <c:when test="${not empty destino}"> 
                                       value="${dataEntrada}"
                                   </c:when>
                               </c:choose> required><br>
                    </div>

                    <div class="saida">
                        <label for="dataSaida">Data de check-out</label><br>
                        <input type="date" name="dataSaida" id="dataSaida" <c:choose>
                                   <c:when test="${not empty destino}"> 
                                       value="${dataSaida}"
                                   </c:when>
                               </c:choose> required><br>
                    </div>
                </div>

                <div class="quantidade">
                    <label for="quantidadePessoas">Quantidade hóspedes</label><br>
                    <select name="quantidadePessoas" id="quantidadePessoas">
                        <c:forEach begin="1" end="9" var="qtd">
                            <option value="${qtd}" <c:choose>
                                        <c:when test="${qtdPessoas==qtd}"> 
                                            selected
                                        </c:when>
                                    </c:choose>>${qtd}</option>
                        </c:forEach>
                    </select>
                </div>

                <input class="buscar-hotel" type="submit" value="BUSCAR HOTEL">

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
                                <form method="GET" action="${pageContext.request.contextPath}/detalhes">
                                    <input id="idHotel" name="idHotel" value="${consulta.idHotel}" type="hidden">
                                    <input id="dataEntrada" name="dataEntrada" value="${dataEntrada}" type="hidden">
                                    <input id="dataSaida" name="dataSaida" value="${dataSaida}" type="hidden">
                                    <input class="detail" type="submit" value="DETALHES">
                                </form>
                            </div>
                        </div>
                    </c:forEach>
                </c:otherwise>
            </c:choose>
        </div>
    </body>
</html>

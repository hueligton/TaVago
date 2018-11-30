<%-- 
    Document   : pagamento
    Created on : 10/11/2018, 19:41:34
    Author     : hueli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/pagamento.css"/>
        <title>TaVago - Pagamento</title>
    </head>
    <body id="pagamento-page">
        <!-- Top bar (logo e opções de navegação) -->
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
        <div class="descricao-pagamento">
            <h3>
                Realizar pagamento
            </h3>
            <p>
                Insira seus dados nos campos obrigatórios abaixo.
            </p>
        </div>
        <div class="form-pagamento">
            <form class="formulario-pagamento" method="POST" action="${pageContext.request.contextPath}/confirmacao">
                <div class="titular">
                    <label for="titular">Titular: </label><br>
                    <input type="text" name="titular" id="titular" required><br>
                </div>
                <div class="numeroCartao">
                    <label for="titular">Número do cartão: </label><br>
                    <input type="text" name="numeroCartao" id="numeroCartao" required><br>
                </div>
                <div class="vencimento">
                    <label for="vencimento">Vencimento: </label><br>
                    <input type="text" placeholder="mm/aa" name="vencimento" id="vencimento" required><br>
                </div>
                <div class="codigoSeguranca">
                    <label for="codigoSeguranca">Código de seguranca: </label><br>
                    <input type="text" name="codigoSeguranca" id="codigoSeguranca" required><br>
                </div>
                <input type="submit" name="realizarPagamento" value="REALIZAR PAGAMENTO">
            </form>
        </div>
    </body>
</html>

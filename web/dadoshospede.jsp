<%-- 
    Document   : dadoshospede
    Created on : Nov 18, 2018, 1:00:31 PM
    Author     : felipecaggi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="styles/dadoshospede.css"/>
        <link rel="shortcut icon" href="images/favicon.ico"/>
        <meta http-equiv="refresh" content="" >
        <title>Dados hospede</title>
    </head>
    <body id="dadoshospede-page">

        <!-- Envoltório do cabeçalho da página Dados hospede -->
        <div class="header-wrap dadoshospede-hw">

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
                    <h2>Formulário de hóspede</h2>
                    <p>Preencha as informações abaixo para podermos cadastrar sua reserva</p>
                </div>
            </header>

            <div class="home-content">
                <div class="form-wrap">

                    <form role="form" class="formulario-hospede" method="POST" action="${pageContext.request.contextPath}/pagamento">

                        <fieldset class="personal">
                            <legend>Pessoal</legend>

                            <div id="input-name" class="input-wrap">
                                <label class="input-wrap-label" for="nome">Nome</label>
                                <input type="text" class="form-control name-mask input-wrap-input" id="nome" placeholder="Ex.: Robin Hood" autocomplete="off" required>
                            </div>

                            <div id="input-cpf" class="input-wrap">
                                <label class="input-wrap-label" for="cpf">Cpf</label>
                                <input type="text" class="form-control cpf-mask input-wrap-input" id="cpf" placeholder="Ex.: 000.000.000-00" maxlength="14" autocomplete="off" pattern="[0-9]{3}.?[0-9]{3}.?[0-9]{3}-?[0-9]{2}" required>
                            </div>

                            <div id="input-phone" class="input-wrap">
                                <label class="input-wrap-label-optional" for="telefone">Telefone - </label>
                                <label class="input-wrap-label-optional italic">Optional</label>
                                <input type="text" class="form-control phone-mask input-wrap-input" id="telefone" placeholder="Ex.: (00) 0000-0000" autocomplete="off">
                            </div>

                        </fieldset>

                        <fieldset class="address">
                            <legend>Endereço</legend>

                            <div id="input-street" class="input-wrap">
                                <label class="input-wrap-label" for="rua">Rua</label>
                                <input type="text" class="form-control street-mask input-wrap-input" id="rua" placeholder="Ex.: 14 de julho" autocomplete="off" required>
                            </div>

                            <div id="input-house-number" class="input-wrap">
                                <label class="input-wrap-label" for="numeroCasa">Número casa</label>
                                <input type="text" class="form-control house-number-mask input-wrap-input" id="numeroCasa" placeholder="Ex.: 343" autocomplete="off" required>
                            </div>

                            <div id="input-city" class="input-wrap">
                                <label class="input-wrap-label" for="cidade">Cidade</label>
                                <input type="text" class="form-control city-mask input-wrap-input" id="cidade" placeholder="Ex.: Campo Grande" autocomplete="off" required>
                            </div>

                            <div id="input-state" class="input-wrap">
                                <label class="input-wrap-label" for="estado">Estado</label>
                                <input type="text" class="form-control state-mask input-wrap-input" id="estado" placeholder="Ex.: Mato Grosso do Sul" autocomplete="off" required>
                            </div>

                            <div id="input-country" class="input-wrap">
                                <label class="input-wrap-label" for="pais">País</label>
                                <input type="text" class="form-control country-mask input-wrap-input" id="pais" placeholder="Ex.: Brasil" autocomplete="off" required>
                            </div>

                        </fieldset>

                        <div id="input-submit" class="input-wrap">
                            <input type="submit" value="Continuar">    
                        </div>

                    </form>

                </div>
            </div>

        </section>

    </body>
</html>
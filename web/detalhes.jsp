<%-- 
    Document   : detalhes
    Created on : 10/11/2018, 19:40:43
    Author     : Vitoria Holanda Vidal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Detalhe</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/swiper.min.css">
        <link rel="stylesheet" type="text/css" href="styles/detalhe.css">
    </head>
    <body>
        <!--Navegation Bar-->
        <div class="row">
            <div class="logo">
                <img src="images/logo-tavago.png">
            </div>
            <div class="carrinho">
                <img src="images/carrinho.png">
            </div>     
        </div>

        <div class="informacaohotel">
            <!--Informa o nome da Pousada-->
            <h2>Tesouro de Noronha</h2>

            <!--Informa o endereco-->
            <p>Rua Nice Cordeiro, Fernando de Noronha, CEP 53990-000, Brasil</p>

            <h3>Confira as fotos do Hotel</h3>
        </div>
        <!-- Swiper -->
        <div class="swiper-container">
            <div class="swiper-wrapper">
                <div class="swiper-slide">
                    <!--Apresenta as imagens do hotel-->
                    <div class="img">
                        <img src="hotel/3.jpg">
                    </div>
                    <div class="detalhes">
                        <h3>Funcionarios<br><span>Hotel Tesouro de Noronha</span></h3>
                    </div>
                </div>
                <div class="swiper-slide">
                    <div class="img">
                        <img src="hotel/6.jpg">
                    </div>
                    <div class="detalhes">
                        <h3>Funcionarios<br><span>Hotel Tesouro de Noronha</span></h3>
                    </div>
                </div>
                <div class="swiper-slide">
                    <div class="img">
                        <img src="hotel/2.jpg">
                    </div>
                    <div class="detalhes">
                        <h3>Entrada<br><span>Hotel Tesouro de Noronha</span></h3>
                    </div>
                </div>
                <div class="swiper-slide">
                    <div class="img">
                        <img src="hotel/1.jpg">
                    </div>
                    <div class="detalhes">
                        <h3>Fachada<br><span>Hotel Tesouro de Noronha</span></h3>
                    </div>
                </div>
                <div class="swiper-slide">
                    <div class="img">
                        <img src="hotel/4.jpg">
                    </div>
                    <div class="detalhes">
                        <h3>Chave<br><span>Hotel Tesouro de Noronha</span></h3>
                    </div>
                </div>
                <div class="swiper-slide">
                    <div class="img">
                        <img src="hotel/5.jpg">
                    </div>
                    <div class="detalhes">
                        <h3>Quarto<br><span>Hotel Tesouro de Noronha</span></h3>
                    </div>
                </div>
                <div class="swiper-slide">
                    <div class="img">
                        <img src="hotel/7.jpg">
                    </div>
                    <div class="detalhes">
                        <h3>Funcionarios<br><span>Hotel Tesouro de Noronha</span></h3>
                    </div>
                </div>
            </div>
            <!-- Add Pagination -->
            <div class="swiper-pagination"></div>
        </div>

        <!-- Swiper JS -->
        <script type="text/javascript" src="javascript/swiper.min.js"></script> 

        <!-- Initialize Swiper -->
        <script>
            var swiper = new Swiper('.swiper-container', {
                effect: 'coverflow',
                grabCursor: true,
                centeredSlides: true,
                slidesPerView: 'auto',
                coverflowEffect: {
                    rotate: 50,
                    stretch: 0,
                    depth: 100,
                    modifier: 1,
                    slideShadows: true,
                },
                pagination: {
                    el: '.swiper-pagination',
                },
            });
        </script>
        <!--Apresenta a descricao do hotel-->
        <div class="descricao">
            <p>
                A Tesouro de Noronha dispõe de piscina ao ar livre e está situada em Fernando de Noronha, a 900 metros da Vila dos Remédios. Esta pousada oferece transfer de cortesia e Wi-Fi gratuito. O Porto de Santo Antônio fica a 2,2 km.
            </p>

            <p>
                Alguns quartos possuem varanda com vista do mar. Certas unidades da Tesouro de Noronha oferecem vista da piscina, e todas apresentam banheiro privativo. Outras comodidades incluem ar-condicionado, mesa de trabalho, guarda-roupa e TV de tela plana.
            </p>

            <p>
                O buffet de café da manhã é servido diariamente na Tesouro de Noronha.
            </p>

            <p>
                A pousada fica a 2,2 km da Praia do Sueste. O Aeroporto de Fernando de Noronha é o mais próximo, localizado a 1 km. 
            </p>

            <p>    
                Tesouro de Noronha tem recebido hóspedes do TAVAgo.com desde 03 de dez. de 2018.</p>
        </div>
        <!--Apresenta as acomodacoes do hotel-->
        <div class="acomodacoes">
            <!--Tabbelas com as acomodacoes-->
            <table>
                <tr>
                    <th>Tipo de  Quarto</th>
                    <th>Acomoda</th>
                    <th>Selecionar nº de quartos</th>
                    <th>Preço</th>
                    <th></th>
                </tr>
                <tr>
                    <td>Suite Standard - ARRAIA</td>
                    <td>2</td>
                    <td>
                        <select name="quantidade">
                            <option value="zero">0</option>
                            <option value="um">1</option>
                            <option value="dois">2</option>
                            <option value="tres">3</option>
                            <option value="quatro">4</option>
                            <option value="cinco">5</option>
                        </select>
                    </td>
                    <td></td>
                    <td><input type="submit" value="Vou Reservar"></td>
                </tr>
                <tr>
                    <td>Suite Superior - Mero</td>
                    <td>3</td>
                    <td>
                        <select name="quantidade">
                            <option value="zero">0</option>
                            <option value="um">1</option>
                            <option value="dois">2</option>
                            <option value="tres">3</option>
                            <option value="quatro">4</option>
                            <option value="cinco">5</option>
                        </select>
                    <td></td>
                    <td><input type="submit" value="Vou Reservar"></td>
                    </td>
                </tr>
            </table>

        </div>
    </div>
    <footer>

    </footer>

</body>
</html>




















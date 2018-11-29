package controller;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.List;
import javax.servlet.http.HttpSession;
import model.manager.*;
import model.entity.*;

public class ReservaServletController extends HttpServlet {

    HotelManager hotelManager = new HotelManager();
    PessoaManager pessoaManager = new PessoaManager();
    ReservaManager reservaManager = new ReservaManager();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String jsp = null;

        if (request.getRequestURI().endsWith("/home")) {
            jsp = "/home.jsp";
        } else if (request.getRequestURI().endsWith("/carrinho")) {
            carrinho(request);
            jsp = "/carrinho.jsp";
        } else if (request.getRequestURI().endsWith("/confirmacao")) {
            confirmacao(request);
            jsp = "/confirmacao.jsp";
        } else if (request.getRequestURI().endsWith("/consulta")) {
            hoteisConsulta(request);
            jsp = "/consulta.jsp";
        } else if (request.getRequestURI().endsWith("/dadoshospede")) {
            dadosHospede(request);
            jsp = "/dadoshospede.jsp";
        } else if (request.getRequestURI().endsWith("/detalhes")) {
            detalhe(request);
            jsp = "/detalhes.jsp";
        } else if (request.getRequestURI().endsWith("/pagamento")) {
            dadosPagamento(request);
            jsp = "/pagamento.jsp";
        } else if (request.getRequestURI().endsWith("/resultado")) {
            resultado(request);
            jsp = "/resultado.jsp";
        } else if (request.getRequestURI().endsWith("/removerItem")) {
            removerItem(request);
            jsp = "/carrinho.jsp";
        } else if (request.getRequestURI().endsWith("/atualizarPreco")) {
            atualizarPreco(request);
            jsp = "/carrinho.jsp";
        } else if (request.getRequestURI().endsWith("/login")) {
            realizarLogin(request);
            jsp = "/login.jsp";
        }

        request.getRequestDispatcher(jsp).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public void hoteisConsulta(HttpServletRequest request) {
        String destino = request.getParameter("destino");
        String dataEntrada = request.getParameter("dataEntrada");
        String dataSaida = request.getParameter("dataSaida");
        int qtdPessoas = Integer.parseInt(request.getParameter("quantidadePessoas"));
        Collection<Hotel> resultadoConsulta = hotelManager.buscarHotel(destino, dataEntrada, dataSaida, qtdPessoas);
        request.setAttribute("consulta", resultadoConsulta);
    }

    public void detalhe(HttpServletRequest request) {
        int idHotel = Integer.parseInt(request.getParameter("idHotel"));
        Hotel hotel = hotelManager.buscarHotel(idHotel);
        request.setAttribute("hotel", hotel);
    }

    public void carrinho(HttpServletRequest request) {
        /*HttpSession sessao = request.getSession();
        sessao.setAttribute("idusuario", pessoaManager.getIdUsuario());
        int idUsuario =  pessoaManager.getIdUsuario(); */
    }

    public void dadosHospede(HttpServletRequest request) {

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String rua = request.getParameter("rua");
        int numCasa = Integer.parseInt(request.getParameter("numeroCasa"));
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String pais = request.getParameter("pais");

        /* HttpSession sessao = request.getSession();
        sessao.setAttribute("idusuario", pessoaManager.getIdUsuario());
        long idUsuario =  pessoaManager.getIdUsuario();
         */
        // como está criando, ainda não temos o ID do Usuario, 
        //depois que executarmos o método que será criado o id pelo banco 
        boolean resultado = pessoaManager.cadastrarHospede(nome, cpf, telefone, rua, numCasa, cidade, estado, pais);
        request.setAttribute("resultado", resultado);
    }

    public void dadosPagamento(HttpServletRequest request) {
        String titular = request.getParameter("titular");
        String numCartao = request.getParameter("numeroCartao");
        String vencimento = request.getParameter("vencimento");
        int codSeguranca = Integer.parseInt(request.getParameter("codigoSeguranca"));

        HttpSession sessao = request.getSession();
        sessao.setAttribute("idusuario", pessoaManager.getIdUsuario());
        int idUsuario = pessoaManager.getIdUsuario();

        boolean resultado = pessoaManager.cadastrarCartao(titular, numCartao, vencimento, codSeguranca, idUsuario);
        request.setAttribute("resultado", resultado);
    }

    public void confirmacao(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        sessao.setAttribute("idusuario", pessoaManager.getIdUsuario());
        int idUsuario = pessoaManager.getIdUsuario();
        //ver método que retorna hospedes daquela reserva x
        // ou ver ser listarReservas() já retorna as reservas daquele usuario com os respectivos hospedes
        List listaReservas = reservaManager.listarReservas(idUsuario);

        request.setAttribute("listaReservasUsuario", listaReservas);

    }

    public void resultado(HttpServletRequest request) {
        HttpSession sessao = request.getSession();
        sessao.setAttribute("idusuario", pessoaManager.getIdUsuario());
        int idUsuario = pessoaManager.getIdUsuario();

        boolean resultado = reservaManager.cadastrarReserva(idUsuario);
        request.setAttribute("resultado", resultado);

    }

    private void removerItem(HttpServletRequest request) {
        int idAcomodacao = Integer.parseInt(request.getParameter("id"));
        boolean resultado = reservaManager.removerItemReserva(idAcomodacao);
        request.setAttribute("resultado", resultado);
    }

    private void atualizarPreco(HttpServletRequest request) {
        int idCarrinho = Integer.parseInt(request.getParameter("id"));
        int modificacao = Integer.parseInt(request.getParameter("idModificacao"));
        int valorModificacao = Integer.parseInt(request.getParameter("valorModificacao"));
        boolean resultado = reservaManager.atualizarCarrinho(idCarrinho, modificacao);

        request.setAttribute("resultado", resultado);
    }

    private void realizarLogin(HttpServletRequest request) {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        int idUsuario = pessoaManager.realizarLogin(login, senha);
        if (idUsuario != -1) {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("idusuario", idUsuario);
        }
        request.setAttribute("idUsuario", idUsuario);
    }
}

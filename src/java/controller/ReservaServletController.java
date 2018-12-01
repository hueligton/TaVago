package controller;

import static java.io.FileDescriptor.err;
import model.entity.Carrinho;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.LinkedList;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        } else if (request.getRequestURI().endsWith("/adicionarCarrinho")) {
            adicionarCarrinho(request);
            jsp = "/carrinho.jsp";
        } else if (request.getRequestURI().endsWith("/removerCarrinho")) {
            removerCarrinho(request);
            jsp = "/carrinho.jsp";
        } else if (request.getRequestURI().endsWith("/atualizarCarrinho")) {
            atualizarCarrinho(request);
            jsp = "/carrinho.jsp";
        } else if (request.getRequestURI().endsWith("/confirmacao")) {
            dadosPagamento(request);
//            confirmacao(request);
            jsp = "/confirmacao.jsp";
        } else if (request.getRequestURI().endsWith("/consulta")) {
            consulta(request);
            jsp = "/consulta.jsp";
        } else if (request.getRequestURI().endsWith("/login")) {
            if (request.getSession().getAttribute("usuario") == null)
                jsp = "/login.jsp";
            else
                jsp = "/dadoshospede.jsp";
            
        } else if (request.getRequestURI().endsWith("/dadoshospede")) {
            login(request);
            
            if (request.getSession().getAttribute("usuario") == null)
                jsp = "/login.jsp";
            else
                jsp = "/dadoshospede.jsp";

        } else if (request.getRequestURI().endsWith("/detalhes")) {
            detalhe(request);
            jsp = "/detalhes.jsp";
        } else if (request.getRequestURI().endsWith("/pagamento")) {
            dadosHospede(request);
            jsp = "/pagamento.jsp";
        } else if (request.getRequestURI().endsWith("/resultado")) {
//            resultado(request);
            jsp = "/resultado.jsp";
        } else if (request.getRequestURI().endsWith("/login")) {
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

    public void consulta(HttpServletRequest request) {
        String destino = request.getParameter("destino");
        String dataEntrada = request.getParameter("dataEntrada");
        String dataSaida = request.getParameter("dataSaida");
        int qtdPessoas = Integer.parseInt(request.getParameter("quantidadePessoas"));
        Collection<Hotel> resultadoConsulta = hotelManager.listarHotel(destino);
        request.setAttribute("consulta", resultadoConsulta);
        request.setAttribute("destino", destino);
        request.setAttribute("dataEntrada", dataEntrada);
        request.setAttribute("dataSaida", dataSaida);
        request.setAttribute("qtdPessoas", qtdPessoas);
    }

    public void detalhe(HttpServletRequest request) {
        int idHotel = Integer.parseInt(request.getParameter("idHotel"));
        Hotel hotel = hotelManager.buscarHotel(idHotel);
        request.setAttribute("hotel", hotel);
    }

    public void adicionarCarrinho(HttpServletRequest request) {
        
        Carrinho carrinho = (Carrinho) request.getSession().getAttribute("carrinho");

        //int idAcomodacao = Integer.parseInt(request.getParameter("idAcomodacao"));
        //int quantidade = Integer.parseInt(request.getParameter("quantidadeQuartos"));
        
        /*PRA TESTE. RETIRAR DEPOIS*/ int idAcomodacao = ((Acomodacao) DAO.getFactory().buscar(new Acomodacao(), 1)).getIdAcomodacao();
        /*PRA TESTE. RETIRAR DEPOIS*/ int quantidade = Integer.parseInt(request.getParameter("quantidadePessoas"));
        
        Date dataEntrada = (Date) request.getAttribute("dataEntrada");
        Date dataSaida = (Date) request.getAttribute("dataSaida");

        carrinho = reservaManager.adicionarCarrinho(idAcomodacao, quantidade, dataEntrada, dataSaida, carrinho);

        request.getSession().setAttribute("carrinho", carrinho);
    }

    public void removerCarrinho(HttpServletRequest request) {
        Carrinho carrinho = (Carrinho) request.getSession().getAttribute("carrinho");
        
        int idAcomodacao = Integer.parseInt(request.getParameter("idAcomodacao"));
        
        carrinho = reservaManager.removerCarrinho(carrinho, idAcomodacao);
        request.getSession().setAttribute("carrinho", carrinho);
    }

    public void atualizarCarrinho(HttpServletRequest request) {
        
        Carrinho carrinho = (Carrinho) request.getSession().getAttribute("carrinho");

        int quantidade = Integer.parseInt(request.getParameter("quantidadeQuartos"));
        int idAcomodacao = Integer.parseInt(request.getParameter("idAcomodacao"));

        carrinho = reservaManager.atualizarCarrinho(carrinho, idAcomodacao, quantidade);
        request.getSession().setAttribute("carrinho", carrinho);
    }

    public void carrinho(HttpServletRequest request) {

    }
    
    private void login(HttpServletRequest request) {
        
        if (request.getSession().getAttribute("usuario") == null) {
            String login = request.getParameter("email");
            String senha = request.getParameter("senha");

            Usuario usuario = pessoaManager.realizarLogin(login, senha);
            request.getSession().setAttribute("usuario", usuario);
        }
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
        //TODO buscar hospede cadastrado e salvar no item carrinho
        boolean resultado = pessoaManager.cadastrarHospede(nome, cpf, telefone, rua, numCasa, cidade, estado, pais);
        request.setAttribute("resultado", resultado);
    }

    public void dadosPagamento(HttpServletRequest request) {
        String titular = request.getParameter("titular");
        String numCartao = request.getParameter("numeroCartao");
        String vencimento = request.getParameter("vencimento");
        int codSeguranca = Integer.parseInt(request.getParameter("codigoSeguranca"));
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        pessoaManager.cadastrarCartao(titular, numCartao, vencimento, codSeguranca, idUsuario);
    }

//    public void confirmacao(HttpServletRequest request) {
//        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
//        Reserva reserva = reservaManager.
//        request.setAttribute("reserva", reserva);
//    }
//
//    public void resultado(HttpServletRequest request) {
//        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
//        boolean resultado = reservaManager.cadastrarReserva(idUsuario);
//        request.setAttribute("resultado", resultado);
//    }
    
}

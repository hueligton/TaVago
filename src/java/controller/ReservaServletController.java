package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
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
            if (!realizarLogin(request)) {
                jsp = "/login.jsp";
            } else {
                jsp = "/dadoshospede.jsp";
            }
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
        Collection<Hotel> resultadoConsulta = hotelManager.buscarHotel(destino);
        request.setAttribute("consulta", resultadoConsulta);
    }

    public void detalhe(HttpServletRequest request) {
        int idHotel = Integer.parseInt(request.getParameter("idHotel"));
        Hotel hotel = hotelManager.buscarHotel(idHotel);
        List listaAcomodacoes = hotelManager.buscarAcomodacoes(hotel);
        request.setAttribute("hotel", hotel);
        request.setAttribute("acomodacoesHotel", listaAcomodacoes);
    }

//==============================================================================
//    #TODO - MÉTODO EM ANÁLISE, SERÁ IMPLEMENTADO POSTERIORMENTE
//==============================================================================
    
//    public void carrinho(HttpServletRequest request) {
  
//código base
//    public void consulta(HttpServletRequest request) {
//          try {
//            String destino = request.getParameter("destino");
//            String dataInicial = request.getParameter("dataInicial");
//            String dataFinal = request.getParameter("dataFinal");
//            
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            
//            Date initialDate = sdf.parse(dataInicial);
//            Date finalDate = sdf.parse(dataFinal);
//            
//            String quantidadePessoas = request.getParameter("quantidadePessoas");
//            
//            Collection<Hotel> consulta = hotelManager.listarHotel();
//
//            
//            request.setAttribute("consulta", consulta);
//            
//        } catch (ParseException ex) {
//            Logger.getLogger(ReservaServletController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
//==============================================================================
    
      public void dadosHospede(HttpServletRequest request) {

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String rua = request.getParameter("rua");
        int numCasa = Integer.parseInt(request.getParameter("numeroCasa"));
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String pais = request.getParameter("pais");
        boolean resultado = pessoaManager.cadastrarHospede(nome, cpf, telefone, rua, numCasa, cidade, estado, pais);
        request.setAttribute("resultado", resultado);
    }

    public void dadosPagamento(HttpServletRequest request) {
        String titular = request.getParameter("titular");
        String numCartao = request.getParameter("numeroCartao");
        String vencimento = request.getParameter("vencimento");
        int codSeguranca = Integer.parseInt(request.getParameter("codigoSeguranca"));
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        boolean resultado = pessoaManager.cadastrarCartao(titular, numCartao, vencimento, codSeguranca, idUsuario);
        request.setAttribute("resultado", resultado);
    }

    public void confirmacao(HttpServletRequest request) {
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        int idReserva = Integer.parseInt(request.getParameter("idReserva"));
        List listaReservas = reservaManager.listarReservas(idUsuario);
        List hospedes = reservaManager.listarHospedes(idReserva);
        request.setAttribute("listaReservasUsuario", listaReservas);
        request.setAttribute("listaReservaHospedes", hospedes);
    }

    public void resultado(HttpServletRequest request) {
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        boolean resultado = reservaManager.cadastrarReserva(idUsuario);
        request.setAttribute("resultado", resultado);
    }
//==============================================================================
//    #TODO - MÉTODO EM ANÁLISE, SERÁ IMPLEMENTADO POSTERIORMENTE
//==============================================================================
    
 //   private void removerItem(HttpServletRequest request) {


//código base
//    public void consulta(HttpServletRequest request) {
//          try {
//            String destino = request.getParameter("destino");
//            String dataInicial = request.getParameter("dataInicial");
//            String dataFinal = request.getParameter("dataFinal");
//            
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            
//            Date initialDate = sdf.parse(dataInicial);
//            Date finalDate = sdf.parse(dataFinal);
//            
//            String quantidadePessoas = request.getParameter("quantidadePessoas");
//            
//            Collection<Hotel> consulta = hotelManager.listarHotel();
//
//            
//            request.setAttribute("consulta", consulta);
//            
//        } catch (ParseException ex) {
//            Logger.getLogger(ReservaServletController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
//==============================================================================
     
    
    
    
    
//==============================================================================
//    #TODO - MÉTODO EM ANÁLISE, SERÁ IMPLEMENTADO POSTERIORMENTE
//==============================================================================
    

//private void atualizarPreco(HttpServletRequest request) {
      //código base



//    public void consulta(HttpServletRequest request) {
//          try {
//            String destino = request.getParameter("destino");
//            String dataInicial = request.getParameter("dataInicial");
//            String dataFinal = request.getParameter("dataFinal");
//            
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            
//            Date initialDate = sdf.parse(dataInicial);
//            Date finalDate = sdf.parse(dataFinal);
//            
//            String quantidadePessoas = request.getParameter("quantidadePessoas");
//            
//            Collection<Hotel> consulta = hotelManager.listarHotel();
//
//            
//            request.setAttribute("consulta", consulta);
//            
//        } catch (ParseException ex) {
//            Logger.getLogger(ReservaServletController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
//==============================================================================
    
    private boolean realizarLogin(HttpServletRequest request) {
        boolean resul;
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        int idUsuario = pessoaManager.realizarLogin(login, senha);
        if (idUsuario != -1) {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("idusuario", idUsuario);
            resul = true;
        } else {
            resul = false;
        }
        return resul;
    }
}

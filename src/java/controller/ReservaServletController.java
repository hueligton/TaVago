package controller;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.util.List;
import model.manager.HotelManager;
import model.manager.PessoaManager;
import model.manager.ReservaManager;

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
            consulta(request);
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
        }/*else if (request.getRequestURI().endsWith("/atualizarPreco")) {
            atualizarPreco(request);
            jsp = "/carrinho.jsp";
        }*/

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

    public void home() {

    }

    public void consulta(HttpServletRequest request) {
       String destino = request.getParameter("destino");
       String dataEntrada = request.getParameter("dataEntrada");
       String dataSaida = request.getParameter("dataSaida");
       int qtdPessoas = Integer.parseInt(request.getParameter("quantidadePessoas"));
       hotelManager.buscarHotel(destino,dataEntrada, dataSaida,qtdPessoas);
       
    }

    public void detalhe(HttpServletRequest request) {
       int idHotel = Integer.parseInt(request.getParameter("idHotel"));
       int idAcomodacao = Integer.parseInt(request.getParameter("idAcomodacao"));
       hotelManager.buscarHotel(idHotel,idAcomodacao);
    }

    public void carrinho(HttpServletRequest request) {
       int idUsuario = Integer.valueOf(request.getParameter("idUsuario"));
        reservaManager.listarReservas(idUsuario);
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

        pessoaManager.cadastrarHospede(nome, cpf, telefone, rua, numCasa, cidade, estado, pais);

    }

    public void dadosPagamento(HttpServletRequest request) {
        String titular = request.getParameter("titular");
        String numCartao = request.getParameter("numeroCartao");
        String vencimento = request.getParameter("vencimento");
        int codSeguranca = Integer.parseInt(request.getParameter("codigoSeguranca"));
        pessoaManager.cadastrarCartao(titular, numCartao, vencimento, codSeguranca);
    }

    public void confirmacao(HttpServletRequest request) {
        int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
        //ver método que retorna hospedes daquela reserva x
        // ou ver ser listarReservas() já retorna as reservas daquele usuario com os respectivos hospedes
        List listaReservas = reservaManager.listarReservas(idUsuario);
        
        request.setAttribute("listaReservasUsuario", listaReservas);

    }

    public void resultado(HttpServletRequest request) {
        request.setAttribute("confirmacao", "Reserva realizada com sucesso");
    }

    private void removerItem(HttpServletRequest request) {
        int idAcomodacao = Integer.parseInt(request.getParameter("id"));
        reservaManager.removerItemReserva(idAcomodacao);
    }
}

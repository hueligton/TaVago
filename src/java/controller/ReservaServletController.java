/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpSession;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.entity.Acomodacao;
import model.entity.Carrinho;
import model.entity.Categoria;
import model.entity.Hotel;
import model.entity.ItemCarrinho;
import model.manager.HotelManager;


public class ReservaServletController extends HttpServlet {
HotelManager hotelManager = new HotelManager();
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
                jsp = "/carrinho.jsp";
        } else if (request.getRequestURI().endsWith("/confirmacao")) {
            jsp = "/confirmacao.jsp";
        } else if (request.getRequestURI().endsWith("/consulta")) {
            consulta(request);
            jsp = "/consulta.jsp";
        } else if (request.getRequestURI().endsWith("/dadoshospede")) {
            jsp = "/dadoshospede.jsp";
        } else if (request.getRequestURI().endsWith("/detalhes")) {
            jsp = "/detalhes.jsp";
        } else if (request.getRequestURI().endsWith("/pagamento")) {
            jsp = "/pagamento.jsp";
        } else if (request.getRequestURI().endsWith("/resultado")) {
            jsp = "/resultado.jsp";
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

    public void home() {

    }

    public void consulta(HttpServletRequest request) {
          try {
            String destino = request.getParameter("destino");
            String dataInicial = request.getParameter("dataInicial");
            String dataFinal = request.getParameter("dataFinal");
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            Date initialDate = sdf.parse(dataInicial);
            Date finalDate = sdf.parse(dataFinal);
            
            String quantidadePessoas = request.getParameter("quantidadePessoas");
            
            Collection<Hotel> consulta = hotelManager.listarHotel();

            
            request.setAttribute("consulta", consulta);
            
        } catch (ParseException ex) {
            Logger.getLogger(ReservaServletController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void detalhe(HttpServletRequest request) {

    }
    
    ///////////////////////////////////////////////////////////////
    //                                                           //
    //            CÓDIGO TESTE DA PÁGINA CARRINHO                //
    //        APENAS TESTE, PODEM ATUALIZAR À VONTADE            //
    //                                                           //
    ///////////////////////////////////////////////////////////////

    public void carrinho(HttpServletRequest request) {
        try {
            
            String dataInicial = request.getParameter("dataInicial");
            String dataFinal = request.getParameter("dataFinal");
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            Date initialDate = sdf.parse(dataInicial);
            Date finalDate = sdf.parse(dataFinal);
                     
            Categoria category = new Categoria(1, "De luxo");
            Acomodacao accommodation = new Acomodacao(1, "Quarto Deluxe com Cama Queen size, acomoda duas pessoas", 880.00F, category);
            ItemCarrinho itemCart = new ItemCarrinho(initialDate, finalDate, accommodation);
            
            LinkedList listItem = new LinkedList();
            listItem.add(itemCart);
            
            Carrinho cart = new Carrinho(listItem);
            
            String roomQuantity = "3";
            Float totalValuePerAccommodation = 880.00F;
            Float totalValueCart = 880.00F;
            
            List item = new ArrayList();
            item = cart.getItemCarrinho();
            
            request.setAttribute("carrinho", item);
            request.setAttribute("quantidadeQuartos", roomQuantity);
            request.setAttribute("valorTotalPorAcomodacao", totalValuePerAccommodation);
            request.setAttribute("valorTotalCarrinho", totalValueCart);
            
        } catch (ParseException ex) {            
            Logger.getLogger(ReservaServletController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dadosHospede(HttpServletRequest request) {

    }

    public void dadosPagamento(HttpServletRequest request) {

    }

    public void confirmacao(HttpServletRequest request) {

    }

    public void resultado(HttpServletRequest request) {

    }

}

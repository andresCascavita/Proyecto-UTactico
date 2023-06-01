/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uTactico.Session.DecisionFacadeLocal;
import uTactico.Session.EstadisticasFacadeLocal;
import uTactico.entity.Decision;
import uTactico.entity.Estadisticas;

/**
 *
 * @author ANDRES CASCAVITA
 */
@WebServlet(name = "DecisionServlet", urlPatterns = {"/DecisionServlet"})
public class DecisionServlet extends HttpServlet {

    @EJB
    private EstadisticasFacadeLocal estadisticasFacade;

    @EJB
    private DecisionFacadeLocal decisionFacade;

    
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
        response.setContentType("text/html;charset=UTF-8");
        
        String idSrt= request.getParameter("id");
        int id=0;
        if(idSrt!=null && !idSrt.equalsIgnoreCase("")){
            id=Integer.parseInt(idSrt);
        }
        
        String action=request.getParameter("action");
        
        String senalizacion=request.getParameter("senalizacion");
        String decision=request.getParameter("decision");
        
        java.util.Date date = new Date();
        Date fecha = date;
        
        Decision decisiones = new Decision(id, senalizacion,decision, fecha);
        
        if("Tomar decision".equalsIgnoreCase(action)){
            decisionFacade.create(decisiones);
        }else if("Editar Decision".equalsIgnoreCase(action)){
            decisionFacade.edit(decisiones);
        }
        
        request.setAttribute("decision", decisiones);
        request.setAttribute("allDecision", decisionFacade.findAll());
        
        
 //--------------------------------------------------------------------------------------------------------------------
 
         int ide = (int) (Math.random() * (100 + 1));
        
        String mese = request.getParameter("mese");
        String zonae = request.getParameter("zonae");
        String barrioe = request.getParameter("barrioe");
        String localidade = request.getParameter("localidade");
        String tipoactorinvolucradoe = request.getParameter("tipoactorinvolucradoe");
        String personasquetransitane = request.getParameter("personasquetransitane");
        
        String numeroaccidentes = request.getParameter("numeroaccidentese");
        int numeroaccidentese = 0;
        if (numeroaccidentes != null && !numeroaccidentes.equals("")) {
            numeroaccidentese = Integer.parseInt(numeroaccidentes);
        }
        
        String heridos = request.getParameter("heridos");
        int heridose = 0;
        if (heridos != null && !heridos.equals("")) {
            heridose = Integer.parseInt(heridos);
        }
        
        String fallecidos = request.getParameter("fallecidos");
        int fallecidose = 0;
        if (fallecidos != null && !fallecidos.equals("")) {
            fallecidose = Integer.parseInt(fallecidos);
        }
        java.util.Date datee = new Date();
        Date fechae=datee;
        
        Estadisticas estadistica = new Estadisticas(ide, mese, zonae, barrioe, localidade, tipoactorinvolucradoe, personasquetransitane, numeroaccidentese, heridose, fallecidose, fechae);
        
        request.setAttribute("estadisticas", estadistica);
        request.setAttribute("allEstadisticas", estadisticasFacade.findAll());
        
        
        
        request.getRequestDispatcher("Decision.jsp").forward(request, response);
 
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

}

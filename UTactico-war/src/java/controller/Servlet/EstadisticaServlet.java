/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Servlet;

import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uTactico.Session.EstadisticasFacadeLocal;
import uTactico.Session.ReporteincidenteFacadeLocal;
import uTactico.entity.Estadisticas;
import uTactico.entity.Reporteincidente;

/**
 *
 * @author ANDRES CASCAVITA
 */
@WebServlet(name = "EstadisticaServlet", urlPatterns = {"/EstadisticaServlet"})
public class EstadisticaServlet extends HttpServlet {

    @EJB
    private ReporteincidenteFacadeLocal reporteincidenteFacade;

    @EJB
    private EstadisticasFacadeLocal estadisticasFacade;

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
        
                    
        int ide = (int) (Math.random() * (100 + 1));
        
        String action = request.getParameter("action");
        
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
        
        String heridos = request.getParameter("heridose");
        int heridose = 0;
        if (heridos != null && !heridos.equals("")) {
            heridose = Integer.parseInt(heridos);
        }
        
        String fallecidos = request.getParameter("fallecidose");
        int fallecidose = 0;
        if (fallecidos != null && !fallecidos.equals("")) {
            fallecidose = Integer.parseInt(fallecidos);
        }
        java.util.Date datee = new Date();
        Date fechae=datee;
        
        Estadisticas estadistica = new Estadisticas(ide, mese, zonae, barrioe, localidade, tipoactorinvolucradoe, personasquetransitane, numeroaccidentese, heridose, fallecidose, fechae);
        
        if ("Generar Estadistica".equalsIgnoreCase(action)) {
            estadisticasFacade.create(estadistica);
        }
        
        request.setAttribute("estadisticas", estadistica);
        request.setAttribute("allEstadisticas", estadisticasFacade.findAll());
        

//----------------------------------------------------------------------------------------------------------------------------------------------            
        Integer id = (int) (Math.random() * (1000 + 1));
        
        String tipoactorvial = request.getParameter("tipoactorvial");
        String localidad = request.getParameter("localidad");
        String barrio = request.getParameter("barrio");
        String zona = request.getParameter("zona");
        String senales = request.getParameter("senales");
        String tiposuelo = request.getParameter("tiposuelo");
        String equipamiento = request.getParameter("equipamiento");
        String tiposenal = request.getParameter("tiposenal");
        
        java.util.Date date = new Date();
        Date fecha = date;
        
        Reporteincidente reporteincidente = new Reporteincidente(id, tipoactorvial, localidad, barrio, zona, senales, tiposuelo, equipamiento, tiposenal, fecha);
        
        
        request.setAttribute("reporteincidente", reporteincidente);
                
        request.setAttribute("allReportes", reporteincidenteFacade.findAll());
        
        request.getRequestDispatcher("Estadistica.jsp").forward(request, response);

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

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
import uTactico.Session.ReporteincidenteFacadeLocal;
import uTactico.entity.Reporteincidente;

/**
 *
 * @author ANDRES CASCAVITA
 */
@WebServlet(name = "MostrarReportes", urlPatterns = {"/MostrarReportes"})
public class MostrarReportes extends HttpServlet {

    @EJB
    private ReporteincidenteFacadeLocal reporteincidenteFacade;

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

        Integer id=(int)(Math.random() * (1000 + 1));
            
            String action= request.getParameter("action");
            
            String tipoactorvial=request.getParameter("tipoactorvial");
            String localidad=request.getParameter("localidad");
            String barrio=request.getParameter("barrio");
            String zona=request.getParameter("zona");
            String senales=request.getParameter("senales");
            String tiposuelo=request.getParameter("tiposuelo");
            String equipamiento=request.getParameter("equipamiento");
            String tiposenal=request.getParameter("tiposenal");
            
            java.util.Date date=new Date();
            Date fecha=date;
            
            Reporteincidente incidente = new Reporteincidente(id, tipoactorvial, localidad, barrio, zona, senales, tiposuelo, equipamiento, tiposenal, fecha);
            
           
            request.setAttribute("reporteincidente",incidente );     
            request.setAttribute("allReportes", reporteincidenteFacade.findAll());
            request.getRequestDispatcher("MostrarReporte.jsp").forward(request, response);
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

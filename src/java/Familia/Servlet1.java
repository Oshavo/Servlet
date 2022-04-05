/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Familia;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oshav
 */
@WebServlet(name = "Servlet1", urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Hola Mundo</title>");            
            out.println("</head>");
            out.println("<body style=\"background-color:wheat;\">");
            String papa="Oswaldo";
            String mama="Alejandra";
            String hermana="Melisa";
            String yo="Octavio";
            String epapa="46";
            String emama="48";
            String ehermana="14";
            String eyo="16";
            String url="Servlet2?par="+mama+"&año1="+emama+"&par2="+papa+"&año2="+epapa+"&par3="+yo+"&año3="+eyo+"&par4="+hermana+"&año4="+ehermana;
            out.println("<br>");
            out.println("<h1>Entra al link para descurbrir las edades de mi familia</h1>");
            out.println("<br>");
            out.println("<a href=\""+url+"\">¡¡Click aqui!! </a>");
            out.println("<br>");
            out.println(String.format("<center><img alt=\"\" src=\"cuenta.gif\"/></center>"));
            out.println("<br>");
            out.println(String.format("<center><img alt=\"\" src=\"Feliz.gif\"/></center>"));
            out.println("</body>");
            out.println("</html>");
        }
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

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
@WebServlet(name = "Servlet2", urlPatterns = {"/Servlet2"})
public class Servlet2 extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");            
            out.println("</head>");
            out.println("<body style=\"background-color:wheat;\">");
            String param1 = null;
            String param2 = null;
            String param3 = null;
            String param4 = null;
            String age1 = null;
            String age2 = null;
            String age3 = null;
            String age4 = null;
            param1=request.getParameter("par");
            param2=request.getParameter("par2");
            param3=request.getParameter("par3");
            param4=request.getParameter("par4");
            age1=request.getParameter("año1");
            age2=request.getParameter("año2");
            age3=request.getParameter("año3");
            age4=request.getParameter("año4");
            int edad1=Integer.parseInt(age1);
            int edad2=Integer.parseInt(age2);
            int edad3=Integer.parseInt(age3);
            int edad4=Integer.parseInt(age4);
            out.println("<br>");
            out.println("<center><h1> Familiares ordenados de mayor a menor " + "</h1></center>");
            if (edad1>edad2){
                if(edad1>edad3){
                    if(edad1>edad4){
                        out.println("<center><h3>Mi mamá es "+param1+" y tiene "+edad1+" años"+"</h3></center>");
                        out.println("<center><h3>Mi papá es "+param2+" y tiene "+edad2+" años"+"</h3></center>");
                        out.println("<center><h3>Yo soy "+param3+" y tengo "+edad3+" años"+"</h3></center>");
                        out.println("<center><h3>Mi hermana es "+param4+" y tiene "+edad4+" años"+"</h3></center>");
                    }
                }
            }
            out.println("<br><br>");
            out.println("<center><h1> Familiares ordenados de menor a mayor " + "</h1></center>");
            if(edad4<edad3){
                if(edad4<edad2){
                    if(edad4<edad1){
                        out.println("<center><h3>Mi hermana es "+param4+" y tiene "+edad4+" años"+"</h3></center>");
                        out.println("<center><h3>Yo soy "+param3+" y tengo "+edad3+" años"+"</h3></center>");
                        out.println("<center><h3>Mi papá es "+param2+" y tiene "+edad2+" años"+"</h3></center>");
                        out.println("<center><h3>Mi mamá es "+param1+" y tiene "+edad1+" años"+"</h3></center>");
                    }
                }
            }
            out.println(String.format("<center><img alt=\"\" src=\"Familia.gif\"/></center>"));
            out.println("<br>");
            out.println("<a href=\"Servlet1\">Volver </a>");
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

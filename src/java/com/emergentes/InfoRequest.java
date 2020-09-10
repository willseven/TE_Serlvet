/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wil
 */
@WebServlet(name = "InfoRequest", urlPatterns = {"/InfoRequest"})
public class InfoRequest extends HttpServlet {

 
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
      
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Informacion del Objeto request</title>");
        out.println("<head>");
        out.println("<body>");
        out.println("<h3>Request</h3>");
        out.println("Metodo: " + request.getMethod() +"<br>");
        out.println("Direccion URI: " + request.getRequestURI() + "<br>");
        out.println("Protocolo: " + request.getProtocol() + "<br>");
        out.println("Ruta contexto: " + request.getContextPath() + "<br>");
        out.println("Servidor: "+ request.getServerName() + "<br>");
        out.println("</body>");
        out.println("</html>");
        
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Wil
 */
@WebServlet(name = "InfoCabeceras", urlPatterns = {"/InfoCabeceras"})
public class InfoCabeceras extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet InfoCabeceras</title>");
        out.println("<head>");
        out.println("<body>");
        Enumeration e = request.getHeaderNames();
        while (e. hasMoreElements()){
            String cabe = (String) e.nextElement();
            String value = request.getHeader(cabe);
            out.println(cabe + " = " + value + "<br>");
        }
        
        out.println("</body>");
        out.println("</html>");
        }
       finally {
               out.close();
               } 
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

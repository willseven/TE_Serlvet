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
@WebServlet(name = "LeeParametrosGet", urlPatterns = {"/LeeParametrosGet"})
public class LeeParametrosGet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet LeeParametros Get</title>");
        out.println("<head>");
        out.println("<body>");
        out.println("<h1>LServlet LeeParametros Get</h1>");
        String color = request.getParameter("color");
        String numero = request.getParameter("numero");
        if(color != null || numero != null){
            out.println(("Su color es: <strong>" + color + "</strong><br>"));
            out.println(("Su numero es: <strong>" + numero + "</strong><br>"));
        }else{
            out.println("Ponga los parametros en la URL");
        }
        out.println("</body>");
        out.println("</html>");
        }
       finally {
               out.close();
               } 
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

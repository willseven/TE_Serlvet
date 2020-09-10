
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "UsoSession", urlPatterns = {"/UsoSession"})
public class UsoSession extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet UsoSession</title>");
        out.println("<head>");
        out.println("<body>");
       
           HttpSession session = request.getSession(true);
           //Datos session
           Date create = new Date(session.getCreationTime());
           Date accessed = new Date(session.getLastAccessedTime());
           out.println("ID: " + session.getId() + "<br>");
           out.print("Creado: " + create + "<br>");
           out.print("Ultimo acceso: "+ accessed + "<br>");
           //Introducir un dato de session
           String nomDato = request.getParameter("nomDato");
            if (nomDato != null && nomDato.length() > 0) {
                String valor = request.getParameter("valor");
                session.setAttribute(nomDato, valor);
            }
            // Mostrar datos de la session
            Enumeration e = session.getAttributeNames();
            while (e.hasMoreElements()) {                
                String nombre = (String) e.nextElement();
                String valor = session.getAttribute(nombre).toString();
                out.println(nombre + " = " + valor + "<br>");
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

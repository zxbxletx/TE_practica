package com.practica;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zxbxl
 */
@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

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
            out.println("<title>saludo de bienbenida</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>menu de ejercicios</h1>");
            out.println("<ol>");
            out.println("<form action = 'Ejercicio1' method = 'botton'>");
            out.println("<label><li>Usando servlets mostrar la edad de una persona a partir del año de nacimiento."
                    + "\n El formulario debe solicitar nombre y año de nacimiento.</li></label>");
            out.println("<input type = 'submit' value = 'ir al ejercicio 1'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action ='Ejercicio2' method = 'botton'>");
            out.println("<label><li>Con servlets crear un programa para leer un número y calcular su factorial</li></label>");
            out.println("<input type = 'submit' value = 'ir al ejercicio 2'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action = 'Ejercicio3' method = 'botton'>");
            out.println("<label><li>Utilizando un solo Servlet calcular la edad de una persona a partir de su año de nacimiento</li></label>");
            out.println("<input type = 'submit' value = 'ir al ejercicio'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action = 'Ejercicio4' method = 'botton'>");
            out.println("<label><li>Usando servlete realizar un programa que permita realizar "
                    + "\n el cambio te Bolivianos a Dólares y viceversa.</li></label>");
            out.println("<input type = 'submit' value = 'ir al ejercicio'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action = 'Ejercicio5' method = 'botton'>");
            out.println("<label><li>Crear un servlet para solicitar dos números y un operador </li></label>");
            out.println("<input type = 'submit' value = 'ir al ejercicio'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action = 'Ejercicio6' method = 'botton'>");
            out.println("<label><li>Crear un programa utilizando Servlets para simular el juego con dos dados.</li></label>");
            out.println("<input type = 'submit' value = 'ir al ejercicio'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<form action = 'Ejercicio7' method = 'botton'>");
            out.println("<label><li>Matriz caracol.</li></label>");
            out.println("<input type = 'submit' value = 'ir al ejercicio'>");
            out.println("</form>");
            out.println("</ol>");
            out.println("<br>");
            out.println("<small>zabaleta leuca juan jose fernando</small>");
            out.println("<br>");

            out.println("</form>");
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

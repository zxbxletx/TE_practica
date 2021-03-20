/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "Ejercicio2", urlPatterns = {"/Ejercicio2"})
public class Ejercicio2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ingrresa tu numero</h1>");
            out.println("<form action = 'SalidaEjercicio2' method = 'post'>");
            out.println("<label>numero para calcular factotial: </label>");
            out.println("<input type = 'number' name = 'numero'>");
            out.println("<br>");
            out.println("<input type = 'submit' value = 'Procesar'>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

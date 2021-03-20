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
@WebServlet(name = "Ejercicio5", urlPatterns = {"/Ejercicio5"})
public class Ejercicio5 extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio5</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ingrresa tus numeros</h1>");
            out.println("<form action='SalidaEjercicio5' method='post'>");
            out.println("<fieldset>");
            out.println("Primer numero:  <input type='text' name='valor1' value=>");
            out.println("<br>");
            out.println("realizar");
            out.println("<select name='tipoA' size=”4“>");
            out.println("<option value='suma'>sumar</option >");
            out.println("<option value='resta'>restar</option>");
            out.println("<option value='divicion'>dividir</option>");
            out.println("<option value='multiplicacion'>multiplicar</option>");
            out.println("</select>");    
            out.println("<br>");
            out.println("Segundo numero:  <input type='text' name='valor2' value=>");
            out.println("<br>");
            out.println("<input type='submit' value='calcular' >");
            out.println("</fieldset>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu </a>");
            out.println("</form>");
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

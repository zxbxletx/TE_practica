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
@WebServlet(name = "SalidaEjercicio2", urlPatterns = {"/SalidaEjercicio2"})
public class SalidaEjercicio2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
                  String numero;
    
        
        numero = request.getParameter("numero");
        int fact = Integer.parseInt(numero);
        int resultado = 1;
        for (int i = 1; i <= fact; i++) {
            resultado *= i;}
        try (PrintWriter out = response.getWriter()) {
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>los datos recibidos son :"+fact+" </h1>");         
            out.println("<h1>su factorial es: :"+ resultado +" </h1>");
            out.println("<br>");

            out.println("<a href='Ejercicio2'>volver al llenar datos </a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");
        
    }

}
}

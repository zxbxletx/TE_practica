/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Zxbxl
 */
@WebServlet(name = "Ejercicio3", urlPatterns = {"/Ejercicio3"})
public class Ejercicio3 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
       
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ingrresa tu año de nacimiento</h1>");
            out.println("<form action = 'Ejercicio3' method = 'post'>");
            out.println("<label>AÑO: </label>");
            out.println("<input type = 'number' name = 'fecha'>");
            out.println("<br>");
            out.println("<input type = 'submit' value = 'Procesar'>");
             out.println("<br>");
            out.println("<a href='Main'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int edad;
       
        String fecha = request.getParameter("fecha");
        int fechas = Integer.parseInt(fecha);
        Calendar fechaActual = new GregorianCalendar();
        int fechaActual1 = fechaActual.get(Calendar.YEAR);
        edad = Math.abs(fechas - fechaActual1);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ejercicio3</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>tu edad es:" + edad + " años </h1>");
            out.println("<br>");
            out.println("<a href='Ejercicio3'>volver al llenar datos </a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");

        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

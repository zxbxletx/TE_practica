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
@WebServlet(name = "SalidaEjercicio1", urlPatterns = {"/SalidaEjercicio1"})
public class SalidaEjercicio1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre;
        nombre = request.getParameter("nombre");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             int ed;
        String fecha = request.getParameter("fecha");
        int fechas = Integer.parseInt(fecha);
        Calendar fechaActual = new GregorianCalendar();
        int fechaActual1 = fechaActual.get(Calendar.YEAR);
        ed = Math.abs(fechas - fechaActual1);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>los datos recibidos son : </h1>");         
            out.println("<h1>nombre :"+ nombre +" </h1>");
            out.println("<br>");
            out.println("<h1>tu edad es:" + ed + " años </h1>");
            out.println("<br>");
            out.println("<a href='Ejercicio1'>volver al llenar datos </a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");
    }

   
}}

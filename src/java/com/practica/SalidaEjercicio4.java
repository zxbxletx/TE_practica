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
@WebServlet(name = "SalidaEjercicio4", urlPatterns = {"/SalidaEjercicio4"})
public class SalidaEjercicio4 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {{
             
        String valor;
        valor = request.getParameter("valor");
        float val = Integer.parseInt(valor);
        String tipoA = request.getParameter("tipoA");
        String tipoB;
        tipoB = request.getParameter("tipoB");

        if("USD".equals(tipoA)){
        if("BS".equals(tipoB)){
        val *= 6.96;
        }else if("USD".equals(tipoB)){
        val*=1;
        }
        }else if("BS".equals(tipoA)){
        if("USD".equals(tipoB)){
        val/=6.96;
        }else if("BS".equals(tipoB)){
        val*=1;
        }
        }
    
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El cambio recibido es :"+tipoA+" "+valor+".- </h1>");         
            out.println("<h1>Cambio convertido en :"+ tipoB +" "+val+".- </h1>");
            out.println("<br>");
            out.println("<a href='Ejercicio4'>volver al llenar datos </a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");
    }


        }
    }
  
}


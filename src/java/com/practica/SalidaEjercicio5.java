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
@WebServlet(name = "SalidaEjercicio5", urlPatterns = {"/SalidaEjercicio5"})
public class SalidaEjercicio5 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {{
             
        String valor1;
        valor1 = request.getParameter("valor1");
        String valor2;
        valor2 = request.getParameter("valor2");
        int val1 = Integer.parseInt(valor1);
        int val2 = Integer.parseInt(valor2);
        String tipoA = request.getParameter("tipoA");
        int val = 0;

        
        if("suma".equals(tipoA)){
           val = val1+val2;
        }else if("resta".equals(tipoA)){
        val = val1-val2;
        }
        else if("divicion".equals(tipoA))
        {
         val = val1/val2;   
        }
        else if("multiplicacion".equals(tipoA)){
        val = val1*val2;
        }
        
    
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El valor 1 es :"+valor1+" el valor 2 es :"+valor2+".- </h1>");         
            out.println("<h1>La "+ tipoA +" es : "+val+".- </h1>");
            out.println("<br>");
            out.println("<a href='Ejercicio5'>volver al llenar datos </a>");
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

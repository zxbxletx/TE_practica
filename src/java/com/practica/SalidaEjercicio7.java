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
@WebServlet(name = "SalidaEjercicio7", urlPatterns = {"/SalidaEjercicio7"})
public class SalidaEjercicio7 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       {
          response.setContentType("text/html;charset=UTF-8");
        String numero;   
        numero = request.getParameter("numero");
        int n = Integer.parseInt(numero);
        int[][] M = new int[n][n];
        int i, a, x = 1;
        for (a = 0; a < n / 2; a++) {
            for (i = a; i < n - (a + 1); i++) {
                M[a][i] = x;
                x = x + 1;
            }
            for (i = a; i < n - (a + 1); i++) {
                M[i][n - a - 1] = x;
                x = x + 1;
            }
            for (i = n - a - 1; i >= a + 1; i--) {
                M[n - a - 1][i] = x;
                x = x + 1;
            }
            for (i = n - a - 1; i >= a + 1; i--) {
                M[i][a] = x;
                x = x + 1;
            }
        }
        if (n % 2 == 1) {
            M[n / 2][n / 2] = x;
        }
        int j,k;
        for (k = 0; k < n; k++) {
            for (j = 0; j < n; j++) {
                System.out.print("\t" + M[k][j]);
            }
  }

        try (PrintWriter out = response.getWriter()) {
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Salida</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>los datos recibidos son :"+n+" </h1>");         
            out.println("<h1>su factorial es: :"+ M+" </h1>");
            out.println("<br>");

            out.println("<a href='Ejercicio2'>volver al llenar datos </a>");
            out.println("<br>");
            out.println("<a href='Main'>volver al menu </a>");
            out.println("</body>");
            out.println("</html>");
        
    }


    }



 
}
}
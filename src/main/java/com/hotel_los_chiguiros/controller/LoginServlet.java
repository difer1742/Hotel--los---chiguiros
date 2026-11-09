/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel_los_chiguiros.controller;

import com.hotel_los_chiguiros.dao.UsuarioDAO;
import com.hotel_los_chiguiros.model.Usuario;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet  extends HttpServlet{
     @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException,  IOException{
        
        String usuario=
                request.getParameter("usuario");
        
        String password=
                request.getParameter("password");
        
        System.out.println("Usuario recibido: " + usuario);
        System.out.println("Password recibido: " + password);
        
        UsuarioDAO dao = new UsuarioDAO();
        
        Usuario usuarioEncontrado = 
                dao.validarUsuario(usuario, password);
        
        System.out.println("Resultado: " + usuarioEncontrado);
        
        if (usuarioEncontrado != null){
            
            response.sendRedirect("dashboard.html");
        }else {
            response.getWriter().println(
                        "<h1> Usuario o contraseña Incorreectos ");
        }
        
    }
}

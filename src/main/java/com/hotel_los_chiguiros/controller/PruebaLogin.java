/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel_los_chiguiros.controller;

import com.hotel_los_chiguiros.dao.UsuarioDAO;
import com.hotel_los_chiguiros.model.Usuario;
/**
 *
 * @author cdieg
 */
public class PruebaLogin {
    public static void main(String[] args) {

        UsuarioDAO dao = new UsuarioDAO();

        Usuario usuario =
                dao.validarUsuario(
                        "admin",
                        "123456"
                );

        if(usuario != null){

            System.out.println(
                    "Bienvenido "
                    + usuario.getUsuario());

        }else{

            System.out.println(
                    "Usuario no encontrado");

        }

    }
}

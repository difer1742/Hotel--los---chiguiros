/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel_los_chiguiros.dao;
import com.hotel_los_chiguiros.config.Conexion;
import com.hotel_los_chiguiros.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author cdieg
 */
public class UsuarioDAO {
    public Usuario validarUsuario(String usuario,
                                  String password){
        Usuario usuarioEncontrado = null;
        
        try{
            Connection con = Conexion.conectar();
            if(con == null){
                    return null;

                }else{

                }
                    
            
            String sql =
                    "SELECT * FROM usuarios " +
                    "WHERE usuario = ? " +
                    "AND password = ? ";      
            
            
            PreparedStatement ps =
                    con.prepareStatement(sql);
            
            ps.setString(1, usuario);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){

               
                usuarioEncontrado = new Usuario();

                usuarioEncontrado.setIdUsuario(
                    rs.getInt("id_usuario"));

                usuarioEncontrado.setUsuario(
                        rs.getString("usuario"));

                usuarioEncontrado.setPassword(
                        rs.getString("password"));

                usuarioEncontrado.setIdRol(
                        rs.getInt("id_rol"));

            }else{

}
    }catch(Exception e){

            System.out.println(
                    "Error: " + e.getMessage());
    } 
         return usuarioEncontrado;
    }
}

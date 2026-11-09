/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel_los_chiguiros.config;

/**
 *
 * @author cdieg
 */

import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion {
    private static final String URL =
        "jdbc:mysql://localhost:3306/hotel_chiguiros?useSSL=false&allowPublicKeyRetrieval=true";
    
    private static final String USER = "root";
    
    private static final String PASSWORD ="123456";
    
    public static Connection conectar() {
        Connection Conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Conexion = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );
            System.out.println("Conexion exitosa a MySQL");
        }catch(Exception e){

                System.out.println("ERROR COMPLETO:");
                e.printStackTrace();


        }
        return Conexion;
    }
}

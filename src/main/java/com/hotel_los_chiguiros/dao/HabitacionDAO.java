/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel_los_chiguiros.dao;


/*
 * Esta clase se encarga de hablar con MySQL.
 * Toda operación relacionada con habitaciones irá aquí.
 */

import com.hotel_los_chiguiros.config.Conexion;
import com.hotel_los_chiguiros.model.Habitacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class HabitacionDAO {
    public boolean registrarHabitacion(Habitacion habitacion) {

        try {

            // Obtener conexión con la BD
            Connection con = Conexion.conectar();

            // Consulta SQL parametrizada
            String sql =
                    "INSERT INTO habitaciones "
                    + "(numero_habitacion, tipo, precio, estado) "
                    + "VALUES (?, ?, ?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            // Asignar valores a los ?
            ps.setString(1,
                    habitacion.getNumeroHabitacion());

            ps.setString(2,
                    habitacion.getTipo());

            ps.setDouble(3,
                    habitacion.getPrecio());

            ps.setString(4,
                    habitacion.getEstado());

            // Ejecutar INSERT
            ps.executeUpdate();

            return true;

        } catch (Exception e) {

            System.out.println(
                    "Error al registrar habitación: "
                    + e.getMessage());

            return false;
        }
    }
    /*
 * Obtener todas las habitaciones
 * almacenadas en la base de datos.
 */
    public List<Habitacion> listarHabitaciones(){

    List<Habitacion> habitaciones =
            new ArrayList<>();

    try{

        Connection con =
                Conexion.conectar();

        String sql =
                "SELECT * FROM habitaciones";

        PreparedStatement ps =
                con.prepareStatement(sql);

        ResultSet rs =
                ps.executeQuery();

        while(rs.next()){

            Habitacion habitacion =
                    new Habitacion();

            habitacion.setIdHabitacion(
                    rs.getInt("id_habitacion"));

            habitacion.setNumeroHabitacion(
                    rs.getString("numero_habitacion"));

            habitacion.setTipo(
                    rs.getString("tipo"));

            habitacion.setPrecio(
                    rs.getDouble("precio"));

            habitacion.setEstado(
                    rs.getString("estado"));

            habitaciones.add(habitacion);
        }

    }catch(Exception e){

        System.out.println(
                "Error al listar habitaciones: "
                + e.getMessage());
    }

    return habitaciones;
}
    
}

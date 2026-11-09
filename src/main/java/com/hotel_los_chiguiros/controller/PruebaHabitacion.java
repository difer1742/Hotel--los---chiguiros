/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel_los_chiguiros.controller;


import com.hotel_los_chiguiros.dao.HabitacionDAO;
import com.hotel_los_chiguiros.model.Habitacion;
/**
 *
 * @author cdieg
 */
public class PruebaHabitacion {
    public static void main(String[] args) {

        // Crear objeto habitación
        Habitacion habitacion =
                new Habitacion();

        habitacion.setNumeroHabitacion("101");

        habitacion.setTipo("Sencilla");

        habitacion.setPrecio(120000);

        habitacion.setEstado("Disponible");

        HabitacionDAO dao =
                new HabitacionDAO();

        boolean resultado =
                dao.registrarHabitacion(habitacion);

        if(resultado){

            System.out.println(
                    "✅ Habitación registrada");

        }else{

            System.out.println(
                    "❌ Error al registrar");
        }
    }
}

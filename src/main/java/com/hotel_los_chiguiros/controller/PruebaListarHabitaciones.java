/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel_los_chiguiros.controller;

import com.hotel_los_chiguiros.dao.HabitacionDAO;
import com.hotel_los_chiguiros.model.Habitacion;

import java.util.List;

/*
 * Clase de prueba para verificar
 * que estamos recuperando habitaciones
 * desde MySQL correctamente.
 */
public class PruebaListarHabitaciones {

    public static void main(String[] args) {

        // Crear objeto DAO
        HabitacionDAO dao =
                new HabitacionDAO();

        // Obtener lista de habitaciones
        List<Habitacion> habitaciones =
                dao.listarHabitaciones();

        System.out.println("===== HABITACIONES =====");

        // Recorrer la lista
        for(Habitacion h : habitaciones){

            System.out.println(
                    "ID: " + h.getIdHabitacion()
                    + " | Número: " + h.getNumeroHabitacion()
                    + " | Tipo: " + h.getTipo()
                    + " | Precio: " + h.getPrecio()
                    + " | Estado: " + h.getEstado()
            );
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hotel_los_chiguiros.controller;

import com.hotel_los_chiguiros.dao.HabitacionDAO;
import com.hotel_los_chiguiros.model.Habitacion;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
 * Servlet encargado de recibir los datos
 * del formulario de habitaciones.
 */
@WebServlet("/HabitacionServlet")
public class HabitacionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        /*
         * Recibimos los datos enviados desde
         * crearHabitacion.html
         */

        String numeroHabitacion =
                request.getParameter("numeroHabitacion");

        String tipo =
                request.getParameter("tipo");

        double precio =
                Double.parseDouble(
                        request.getParameter("precio"));

        String estado =
                request.getParameter("estado");

        /*
         * Creamos un objeto Habitacion
         * y cargamos los datos recibidos
         */

        Habitacion habitacion =
                new Habitacion();

        habitacion.setNumeroHabitacion(
                numeroHabitacion);

        habitacion.setTipo(
                tipo);

        habitacion.setPrecio(
                precio);

        habitacion.setEstado(
                estado);

        /*
         * Utilizamos el DAO para guardar
         * la habitación en MySQL
         */

        HabitacionDAO dao =
                new HabitacionDAO();

        boolean resultado =
                dao.registrarHabitacion(
                        habitacion);

        /*
         * Si se guarda correctamente,
         * volvemos al formulario.
         */

        if(resultado){

            response.getWriter().println(
                    "<h1> ✅ Habitación registrada correctamente</h1>"
            );

        }else{

            response.getWriter().println(
                    "<h1>❌ Error al registrar habitación</h1>"
            );
        }
    }
}

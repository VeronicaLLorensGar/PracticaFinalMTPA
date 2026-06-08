/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.salones;

import com.mycompany.practicafinalmtpa.servidor.Connection;
import java.util.ArrayList;

/**
 *
 * @author Veronica
 */


    public class Salon {

        protected String nombre;
        protected ArrayList<Connection> conexiones = new ArrayList<>();
        protected int numMensajes = 0;

        public void añadirConexion(Connection c) {
            conexiones.add(c);
        }

        public void eliminarConexion(Connection c) {
            conexiones.remove(c);
        }

        public ArrayList<Connection> getConexiones() {
            return conexiones;
        }

        public String getNombre() {
            return nombre;
        }

        public void incrementarMensajes() {
            numMensajes++;
        }
    }


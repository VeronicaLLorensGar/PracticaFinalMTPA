/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

/**
 *
 * @author Veronica
 */
//este tampoco se si meterle en gestion sistema o no
public class GestorConexiones {
    
    private static GestorConexiones instancia;
    private ArrayList<Connection> conexiones;

    private GestorConexiones() {
        conexiones = new ArrayList<>();
    }

    public static GestorConexiones getInstancia() {
        if (instancia == null) {
            instancia = new GestorConexiones();
        }
        return instancia;
    }

    public void añadirConexion(Connection c) {
        conexiones.add(c);
    }

    public void eliminarConexion(Connection c) {
        conexiones.remove(c);
    }

    public ArrayList<Connection> getConexiones() {
        return conexiones;
    }

    public Connection buscarPorUsuario(String nombre) {
        for (Connection c : conexiones) {
            if (c.getUsuario() != null &&
                c.getUsuario().getNombre().equals(nombre)) {
                return c;
            }
        }
        return null;
    }
}

    
    
}

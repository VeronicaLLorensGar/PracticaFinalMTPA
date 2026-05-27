/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import java.util.ArrayList;

/**
 *
 * @author Veronica
 */

public class EstadoServidor {
    
    
    

    private boolean mantenimiento = false;
    public static int MAX_CLIENTES = 20;
    private int clientesConectados = 0;

    public static EstadoServidor estado;

    private EstadoServidor() {
    }

    public static EstadoServidor getEstado() {
        if (estado == null) {
            estado = new EstadoServidor();
        }

        return estado;
    }

    

    public int getClientesConectados() {
        return clientesConectados;
    }

    public void registrarConexion() {
        clientesConectados++;
    }

    public void registrarDesconexion() {
        clientesConectados--;
    }
    

    public boolean aceptarClientes() { 
        if (mantenimiento) {
            return false;
        }
        return (clientesConectados < MAX_CLIENTES);
    }

        public void acabarMantenimiento() {
        mantenimiento = false;
    }

    public void iniciarMantenimiento() {
        mantenimiento = true;
    }

}

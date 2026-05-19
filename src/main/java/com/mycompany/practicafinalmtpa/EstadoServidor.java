/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
//singleton aqui aunq nose todavia
public class EstadoServidor {

    public static int MAX_CLIENTES = 20;

    public static EstadoServidor estado;

    private EstadoServidor() {
    }

    public static EstadoServidor getEstado() {
        if (estado == null) {
            estado = new EstadoServidor();
        }

        return estado;
    }

    public int clientesConectados;

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
        if (clientesConectados < MAX_CLIENTES) {
            return true;
        }
        return false;

    }
}

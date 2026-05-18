/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */

public class EstadoServidor {

    public static int clientesConectados;

    public static int getClientesConectados() {
        return clientesConectados;
    }

    public void registrarConexion() {
        clientesConectados++;
    }

    public void registrarDesconexion() {
        clientesConectados--;
    }

}

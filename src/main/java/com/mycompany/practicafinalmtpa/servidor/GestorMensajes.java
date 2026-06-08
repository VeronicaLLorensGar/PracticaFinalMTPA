/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

/**
 *
 * @author Veronica
 */
public class GestorMensajes {

    private static GestorMensajes instancia;

    private GestorMensajes() {
    }

    public static GestorMensajes getInstancia() {
        if (instancia == null) {
            instancia = new GestorMensajes();
        }
        return instancia;
    }
    
    public void enviarMensajePrivado(String mensaje, Connection c){
    }
    public void enviarMensajeSalon(String mensaje, String salon){
    }
}

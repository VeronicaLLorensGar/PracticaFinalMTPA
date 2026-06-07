/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.mensajes;

import java.time.LocalDateTime;


/**
 *
 * @author Veronica
 */
public class Mensaje {

    private String mensaje;
    private String user;
    private LocalDateTime date;
    private static final int tamaño = 190;

    public String getMensaje() {
        return mensaje;
    }

    public String getUser() {
        return user;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public static int getTamaño() {
        return tamaño;
    }

    public Mensaje(String mensaje, String user) {
        if (mensaje.length() <= tamaño) {
            this.mensaje = mensaje;
            this.user = user;
            date = LocalDateTime.now();
        }else{
            //error
        }
    }

}

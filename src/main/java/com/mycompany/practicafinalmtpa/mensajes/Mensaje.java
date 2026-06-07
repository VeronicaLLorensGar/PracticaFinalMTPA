/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.mensajes;

import java.util.Date;

/**
 *
 * @author Veronica
 */
public class Mensaje {

    private String mensaje;
    private String user;
    private Date date;
    private static final int tamaño = 190;

    public Mensaje(String mensaje, String user, Date date) {
        if (mensaje.length() <= tamaño) {
            this.mensaje = mensaje;
            this.user = user;
            date = LoacalDateTime.now();
        }else{
            //error
        }
    }

}

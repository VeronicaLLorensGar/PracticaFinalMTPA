/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.mensajes;

/**
 *
 * @author Veronica
 */
public class MensajeSalon extends Mensaje {
    private String salon;

    public MensajeSalon(String mensaje, String user, String salon) {
        super(mensaje, user);
        this.salon = salon;
    }
    
    public String getSalon() {
        return salon;
    }


    
}

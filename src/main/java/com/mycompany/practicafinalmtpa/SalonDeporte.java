/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class SalonDeporte extends Salon{
    public static SalonDeporte instancia;

    private SalonDeporte() {}

    public static SalonDeporte getInstancia() {
        if (instancia == null) {
            instancia = new SalonDeporte();
        }
        return instancia;
    }

    
}

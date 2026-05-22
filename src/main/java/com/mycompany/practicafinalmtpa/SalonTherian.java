/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class SalonTherian extends Salon {
        public static SalonTherian instancia;

    private SalonTherian() {}

    public static SalonTherian getInstancia() {
        if (instancia == null) {
            instancia = new SalonTherian();
            gc.añadirLista(instancia);
            
        }
        return instancia;
    }
    
}

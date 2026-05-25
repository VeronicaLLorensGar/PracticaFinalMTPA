/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class SalonManga extends Salon {
        public static SalonManga instancia;

    private SalonManga() {}

    public static SalonManga getInstancia() {
        if (instancia == null) {
            instancia = new SalonManga();
        }
        return instancia;
    }
    
}

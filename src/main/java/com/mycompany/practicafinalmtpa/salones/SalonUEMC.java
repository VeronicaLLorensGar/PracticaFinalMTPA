/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.salones;

import com.mycompany.practicafinalmtpa.salones.Salon;

/**
 *
 * @author Veronica
 */
public class SalonUEMC extends Salon {

    public static SalonUEMC instancia;

    private SalonUEMC() {
    }

    public static SalonUEMC getInstancia() {
        if (instancia == null) {
            instancia = new SalonUEMC();
        }
        return instancia;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import com.mycompany.practicafinalmtpa.salones.Salon;
import java.util.ArrayList;

/**
 *
 * @author Veronica
 */
public class GestorSalones {

    public ArrayList<Salon> listaSalones = new ArrayList<>();
    //igual tambien hay q hacer un arraylist de Salones no solo de su nombre
    //o se puede hacer solo el arrylist de salones y q luego haga el getter del nombre
    private static GestorSalones instancia;

    private GestorSalones() {
    }

    public static GestorSalones getInstancia() {
        if (instancia == null) {
            instancia = new GestorSalones();
        }

        return instancia;
    }

    public ArrayList<Salon> getListaSalones() {
        return listaSalones;
    }

    public void añadirLista(Salon salon) {
        listaSalones.add(salon);
    }

}

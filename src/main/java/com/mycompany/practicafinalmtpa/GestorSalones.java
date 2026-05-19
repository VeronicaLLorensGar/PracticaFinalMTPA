/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.util.ArrayList;

/**
 *
 * @author Veronica
 */
public class GestorSalones {
    public ArrayList<Salon> listaSalones = new ArrayList<>() ;
    //igual tambien hay q hacer un arraylist de Salones no solo de su nombre
    //o se puede hacer solo el arrylist de salones y q luego haga el getter del nombre

    public ArrayList<String> getListaSalones() {
        return listaSalones;
    }
    
    public void añadirLista(Salon salon){
        listaSalones.add(salon);
    }
    
    
}

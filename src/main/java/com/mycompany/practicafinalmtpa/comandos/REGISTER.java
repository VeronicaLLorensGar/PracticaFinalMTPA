/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.comandos;

import com.mycompany.practicafinalmtpa.servidor.GestionAcceso;

/**
 *
 * @author Veronica
 */
public class REGISTER implements Comando{
    public GestionAcceso ga = new GestionAcceso();
    @Override
    public void ejecutar(String[] parte) {
        String nombre = parte[1];       
        ga.iniciarRegistro(nombre);
    }

  
    
}

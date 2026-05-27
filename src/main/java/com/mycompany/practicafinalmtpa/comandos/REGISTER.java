/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.comandos;

import com.mycompany.practicafinalmtpa.comandos.Comando;
import com.mycompany.practicafinalmtpa.servidor.GestionarRegistro;

/**
 *
 * @author Veronica
 */
public class REGISTER implements Comando{
    public GestionarRegistro gr = new GestionarRegistro();
    @Override
    public void ejecutar(String[] parte) {
        String nombre = parte[1];       
        gr.iniciarRegistro(nombre);
    }

  
    
}

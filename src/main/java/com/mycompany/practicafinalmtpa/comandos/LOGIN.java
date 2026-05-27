/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.comandos;

import com.mycompany.practicafinalmtpa.comandos.Comando;
import com.mycompany.practicafinalmtpa.servidor.ValidadorAcceso;

/**
 *
 * @author Veronica
 */
public class LOGIN implements Comando{
    public ValidadorAcceso v = new ValidadorAcceso();
    @Override
    public void ejecutar(String[] parte) {
        String nombre = parte[1];
        int password = Integer.parseInt(parte[2]);
        v.validarCredenciales(nombre, password);
    }
    
}

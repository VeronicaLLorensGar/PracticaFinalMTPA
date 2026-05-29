/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practicafinalmtpa.comandos;
import com.mycompany.practicafinalmtpa.servidor.Connection;

/**
 *
 * @author Veronica
 */
//igual convertir esto en una clase abstraca y meter todos los gestores nose
public interface Comando {
    public void ejecutar(String[] parte, Connection c);
    
}

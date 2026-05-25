/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class LOGIN implements Comando{
    public GestorLogin gl = new GestorLogin();
    @Override
    public void ejecutar(String[] parte) {
        String nombre = parte[1];
        int password = Integer.parseInt(parte[2]);
        gl.validarCredenciales(nombre, password);
    }
    
}

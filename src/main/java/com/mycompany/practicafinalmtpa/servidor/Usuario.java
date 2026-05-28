/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

/**
 *
 * @author Veronica
 */
public class Usuario {
    private String nombre;
    private int contraseña;

    public Usuario(String nombre, int contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getContraseña() {
        return contraseña;
    }
    
    
}

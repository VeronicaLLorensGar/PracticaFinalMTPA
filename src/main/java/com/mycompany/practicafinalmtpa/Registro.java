/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class Registro {
    public String nombre;
    public GestorContraseña gc = new GestorContraseña();
    public GestorUsuarios gu = new GestorUsuarios();
    
    public Registro(String _nombre){
        boolean existeNombre= gu.existeNombre(_nombre);;
      
        if(existeNombre){
            gc.generarContraseña();
        }else{
            //aqui mandar un error de que ese nombre ya existe
        }
        
        
    }
}

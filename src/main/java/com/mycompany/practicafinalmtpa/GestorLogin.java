/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class GestorLogin {
     public GestorContraseña gc = new GestorContraseña();
     public GestorUsuarios gu = new GestorUsuarios();
    
     public boolean validarCredenciales(String nombre, int contraseña){
         if (gc.existePassword(contraseña) && gu.existeNombre(nombre)){
             return true;
         }
         return false;
     }

}

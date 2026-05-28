/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;



/**
 *
 * @author Veronica
 */
public class GestionAcceso {
    
    public GestorContraseña gc = new GestorContraseña();
    public GestorUsuarios gu = new GestorUsuarios();
    
    public void iniciarRegistro(String nombre){
        boolean existeNombre = gu.existeNombre(nombre);
      
        if(!existeNombre){
            
            int password = gc.generarContraseña();
            Usuario u = new Usuario(nombre, password);
            
        }else{
            //aqui mandar un error de que ese nombre ya existe
        }
        
        
    }
    
public String login(String nombre, int password) {

        if (gu.validarCredenciales(nombre, password)) {
            return //comando ok
        }

        return //comando error
    }
}

    
    
    


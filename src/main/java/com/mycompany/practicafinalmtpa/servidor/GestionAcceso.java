/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import com.mycompany.practicafinalmtpa.persistencia.Persistencia;



/**
 *
 * @author Veronica
 */
public class GestionAcceso {
    
    GestorContraseña gc = GestorContraseña.getInstancia();
    GestorUsuarios gu = GestorUsuarios.getInstancia();
        private static GestionAcceso instancia;

    private GestionAcceso() {
    }

    public static GestionAcceso getInstancia() {
        if (instancia == null) {
            instancia = new GestionAcceso();
        }

        return instancia;
    }
    
    public void iniciarRegistro(String nombre){
        boolean existeNombre = GestorUsuarios.getInstancia().existeNombre(nombre);
      
        if(!existeNombre){
            
            int password = gc.generarContraseña();
            Usuario u = new Usuario(nombre, password);
            Persistencia.guardarUsuario(u);
            
        }else{
            //aqui mandar un error de que ese nombre ya existe
        }
        
        
    }
    
public String login(String nombre, int password) {

        if (GestorUsuarios.getInstancia().validarCredenciales(nombre, password)) {
            return //comando ok
        }

        return //comando error
    }
}

    
    
    


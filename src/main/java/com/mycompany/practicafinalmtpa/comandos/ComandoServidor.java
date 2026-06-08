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
//para los mensajes que le llegan al servidor( los tiene que porcesar po eso necesita connection)
public interface ComandoServidor {
    public void ejecutar(String[] parte, Connection c);
    
}

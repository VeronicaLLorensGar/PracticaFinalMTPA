/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.comandos;

import com.mycompany.practicafinalmtpa.servidor.Connection;
import com.mycompany.practicafinalmtpa.servidor.GestionAcceso;

/**
 *
 * @author Veronica
 */
public class LOGIN implements ComandoServidor {

    @Override
    public void ejecutar(String[] parte, Connection c) {

        if (parte.length < 3) {
            //error
            
        }

        String nombre = parte[1];
        int password = Integer.parseInt(parte[2]);

        GestionAcceso ga = GestionAcceso.getInstancia();

        ga.login(nombre, password);


    }

}



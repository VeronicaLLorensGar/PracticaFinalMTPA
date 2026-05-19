/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.util.ArrayList;

/**
 *
 * @author Veronica
 */

public abstract class Salon {

    public String nombre;

    public ArrayList<Usuario> listaUsuario = new ArrayList <>  ();

    public static GestorSalones gc = new GestorSalones();

    public int getClientesConectados() {
        return listaUsuario.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void añadiraSalon(Usuario user) {
        listaUsuario.add(user);

    }

}

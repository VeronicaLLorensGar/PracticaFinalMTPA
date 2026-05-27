/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.salones;

import com.mycompany.practicafinalmtpa.cliente.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Veronica
 */
public abstract class Salon {

    public String nombre;
    public ArrayList<Usuario> listaUsuario = new ArrayList<>();
    public int numMensajes;

    public int getClientesConectados() {
        return listaUsuario.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void añadiraSalon(Usuario user) {
        listaUsuario.add(user);

    }

    public int getMensajes() {
        return numMensajes;
    }

    public void incrementarMensajes() {
        numMensajes++;

    }

    public void registrarDesconexionSalon(Usuario user) {

        listaUsuario.remove(user);

    }
}

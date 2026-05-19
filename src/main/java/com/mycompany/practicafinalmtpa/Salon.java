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
//hay q plantear esto a ver si son como servidores que luego mandan a clientes,
//o tienen la lista de clientes conectados
//y es el mismo servidor quien se lo manda a los clientes conectados, o esto son clientes o hilos nose
//pone q todo tiene q ser comunicacion servidor pero nose
public abstract class Salon {
    
    public int usuariosConectados;//iigual ni hace falta con el size de la lista
    public String nombre;
    public ArrayList<Usuario>() = new ArrayList<>();
    
    public GestorSalones gc = new GestorSalones();

    public int getClientesConectados() {
        return usuariosConectados;
    }
    
    
    
    
    
}

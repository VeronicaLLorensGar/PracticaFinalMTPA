/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.sistema;

import com.mycompany.practicafinalmtpa.persistencia.Persistencia;
import com.mycompany.practicafinalmtpa.servidor.GestionAcceso;
import com.mycompany.practicafinalmtpa.servidor.GestorContraseña;
import com.mycompany.practicafinalmtpa.servidor.GestorSalones;
import com.mycompany.practicafinalmtpa.servidor.GestorUsuarios;

/**
 *
 * @author Veronica
 */
//etsa clase tiene todas las instancias de todo peor ns si dejarla o no pq ns si funciona o si se necesita ralmente
public class GestionSistema {

    private GestionAcceso ga;
    private GestorContraseña gc;
    private GestorSalones gs;
    private Persistencia p;
    private GestorUsuarios gu;
    //tambien puedo meter EstadoServidor aqui

    private static GestionSistema instancia;

    private GestionSistema() {

        gu = new GestorUsuarios();
        gc = new GestorContraseña();
        p = new Persistencia();
        gs = new GestorSalones();
        ga = new GestionAcceso();

    }

    public static GestionSistema getInstancia() {

        if (instancia == null) {
            instancia = new GestionSistema();
        }

        return instancia;
    }

    // getters
    public GestorUsuarios getGestorUsuarios() {
        return gu;
    }

    public GestorContraseña getGestorContraseña() {
        return gc;
    }

    public Persistencia getPersistencia() {
        return p;
    }

    public GestorSalones getGestorSalones() {
        return gs;
    }

    public GestionAcceso getGa() {
        return ga;
    }

}

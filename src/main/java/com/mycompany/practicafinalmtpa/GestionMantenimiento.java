/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Veronica
 */
public class GestionMantenimiento {    
    //nuevo
    private static GestionMantenimiento instancia;
    private EstadoServidor estado = EstadoServidor.getEstado();
    
    private GestionMantenimiento (){}
    
    public static GestionMantenimiento getGestionMantenimiento(){
    if(instancia ==null){
    instancia= new GestionMantenimiento();
    }
    return instancia;
    }
    
    public void acabarMantenimiento() {
        estado.setMantenimiento(false);
    }

    public void iniciarMantenimiento() {
        estado.setMantenimiento(true);
        Servidor.cerrarConexionesActivas();
        estado.resetearClientes();
    }
    

}
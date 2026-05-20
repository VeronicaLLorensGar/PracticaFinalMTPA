/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
//singleton aqui aunq nose todavia
public class EstadoServidor {

    private boolean mantenimiento = false;
    public static int MAX_CLIENTES = 20;

    public static EstadoServidor estado;

    private EstadoServidor() {
    }

    public static EstadoServidor getEstado() {
        if (estado == null) {
            estado = new EstadoServidor();
        }

        return estado;
    }

    private int clientesConectados = 0;//no estaba inicializado, lo inicializo a 0

    public int getClientesConectados() {
        return clientesConectados;
    }

    public void registrarConexion() {
        clientesConectados++;
    }

    public void registrarDesconexion() {
        clientesConectados--;
    }
    
    public void resetearClientes(){
    clientesConectados=0;
    }
    /*
    public boolean aceptarClientes() { //implementacion vieja, la dejo por si quieres ver los cambios de antes a ahora, es lo mismo pero con otra funcionalidad nueva
        if (clientesConectados < MAX_CLIENTES) {
            return true;
        }
        return false;
    }
     */
    public boolean aceptarClientes() { //tambien cambio la implementacion de este metodo y le añado algo nuevo
        if (mantenimiento) {
            return false;
        }
        return (clientesConectados < MAX_CLIENTES);
    }

    //nuevas implementaciones
    public boolean getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(boolean mantenimiento) {
        this.mantenimiento = mantenimiento;

    }

}

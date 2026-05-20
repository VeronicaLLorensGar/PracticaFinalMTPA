/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class GestionMantenimiento {
    private static volatile boolean mantenimiento=false; //hay que mirar si usar volatile, todos los hilos ven siempre el valor mas reciente de mantenimiento? si no uso volatile el sistema tendria un comportamiento determinista (no se sabe cuando va a funcionar y cuando no)
    //yo diria de meter aqui toodo lo de mantenimiento
        //metodo de la gestion del mantenimiento

    private static void acabarMantenimiento() {
        mantenimiento= false;
    }

    private static void iniciarMantenimiento() {
        mantenimiento=true;
    }

    /*posibles opciones
    
    mantenimiento es un metodo? un boolean? o ambas
    private void CerrarServidor(){
    
    
    }
    private void CerrarCliente(){}
    interrumpirCliente(){}
    
     */
}

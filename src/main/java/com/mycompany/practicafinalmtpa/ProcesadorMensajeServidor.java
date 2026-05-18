/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class ProcesadorMensajeServidor {
    //esta clase simplemente separara el mensaje del comando
    public void separarComando(String mensaje) {

        String[] partes = mensaje.split(";");
        String comando = partes[0];
        
        FactoriaComando fc= new FactoriaComandosServidor();
        fc.generarComando(comando);
        

    }

}
    

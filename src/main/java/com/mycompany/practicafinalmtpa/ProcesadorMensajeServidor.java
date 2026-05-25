/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
//esta clase igual al final no tiene que hacer esto
public class ProcesadorMensajeServidor {

    public void separarComando(String protocolo) {

        String [] parte = protocolo.split(";");
        String comando = parte[0];

    

        FactoriaComando fc = new FactoriaComandosServidor();
        Comando c = fc.gestionarComando(comando);

        c.ejecutar(parte);

    }

}

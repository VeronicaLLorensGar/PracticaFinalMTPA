/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import com.mycompany.practicafinalmtpa.comandos.ComandoServidor;
import com.mycompany.practicafinalmtpa.comandos.FactoriaComandosServidor;

public class ProcesadorMensajeServidor {

    public void separarComando(String protocolo, Connection c) {

        String [] parte = protocolo.split(";");
        String comando = parte[0];

    

        FactoriaComandosServidor fc = new FactoriaComandosServidor();
        ComandoServidor com = fc.gestionarComando(comando);

        com.ejecutar(parte, c);

    }

}

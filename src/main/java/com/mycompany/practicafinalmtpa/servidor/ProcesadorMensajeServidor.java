/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import com.mycompany.practicafinalmtpa.comandos.Comando;
import com.mycompany.practicafinalmtpa.comandos.FactoriaComando;
import com.mycompany.practicafinalmtpa.comandos.FactoriaComandosServidor;

public class ProcesadorMensajeServidor {

    public void separarComando(String protocolo, Connection c) {

        String [] parte = protocolo.split(";");
        String comando = parte[0];

    

        FactoriaComando fc = new FactoriaComandosServidor();
        ComandoServidor com = fc.gestionarComando(comando);

        com.ejecutar(parte, c);

    }

}

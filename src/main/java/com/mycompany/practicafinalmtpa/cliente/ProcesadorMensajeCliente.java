/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.cliente;

import com.mycompany.practicafinalmtpa.comandos.Comando;
import com.mycompany.practicafinalmtpa.comandos.FactoriaComando;
import com.mycompany.practicafinalmtpa.comandos.FactoriaComandosCliente;

/**
 *
 * @author Veronica
 */
public class ProcesadorMensajeCliente {
        public void separarComando(String protocolo) {

        String [] parte = protocolo.split(";");
        String comando = parte[0];

    

        FactoriaComando fc = new FactoriaComandosCliente();
        Comando c = fc.gestionarComando(comando);

        c.ejecutar(parte);

    }
    
}

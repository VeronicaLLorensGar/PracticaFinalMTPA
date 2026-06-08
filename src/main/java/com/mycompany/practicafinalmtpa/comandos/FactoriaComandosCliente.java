/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.comandos;

/**
 *
 * @author Veronica
 */
//gestiona lso comandos que llegan al cliente
public class FactoriaComandosCliente {

    public ComandoCliente gestionarComando(String tipo) {

        if (tipo.equals("OK")) {
            return new OK();
        }
        if (tipo.equals("KEY")) {
            return new KEY();
        }
        if (tipo.startsWith("ERROR")) {
            return new ERROR();
        }
        if (tipo.startsWith("NOTIFY")) {
            return new NOTIFY();
        }
        if (tipo.equals("ROOMS")) {
            return new ROOMS();
        }
        if (tipo.equals("USERS")) {
            return new USERS();
        }
        if (tipo.equals("FRIENDS")) {
            return new FRIENDS();
        }
        if (tipo.equals("SEND_MESSAGE")) {
            return new SEND_MESSAGE();
        }
        if (tipo.equals("PRIVATE_SEND_MESSAGE")) {
            return new PRIVATE_SEND_MESSAGE();
        }

        return new ERROR();
    }
}

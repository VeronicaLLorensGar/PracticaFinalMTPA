/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
//gestiona lso comandos que llegan al cliente
public class FactoriaComandosCliente implements FactoriaComando {

    @Override
    public Comando gestionarComando(String tipo) {
        if (tipo.equals("OK")) {
            return new OK();
        }
        if (tipo.equals("KEY")) {
            return new KEY();
        }
        if (tipo.equals("ERROR")) {//hay q  cambiar el protocolo pq esto si no no se puede hacer bien, y lo de las notificaciones igual
            return new ERROR();
        }
        if (tipo.equals("NOTIFY")) {
            return new NOTIFY();
        }
        if (tipo.equals("ROOMS")) {
            return new ROOMS();
        }
        if (tipo.equals("USERS")) {
            return new USERS();
        }
        if (tipo.equals("FRIENDS")) {
            return new OK();
        }
        if (tipo.equals("SEND_MESSAGE")) {
            return new SEND_MESSAGE();
        }
        if (tipo.equals("PRIVATE_SEND_MESSAGE")) {
            return new PRIVATE_SEND_MESSAGE();
        }
        if (tipo.equals("SEND_FRIEND_REQUEST")) {
            return new SEND_FRIEND_REQUEST();
        }
        if (tipo.equals("SEND_MESSAGE")) {
            return new SEND_MESSAGE();
        }

    }

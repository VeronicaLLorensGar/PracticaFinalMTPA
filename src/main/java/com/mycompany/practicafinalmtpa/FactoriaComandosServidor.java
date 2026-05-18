/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
//gestiona los comandos que le llegan al servidor
public class FactoriaComandosServidor implements FactoriaComando {

    public static Comando generarComando(String comando) {
        if (tipo.equals("REGISTER")) {
            return new REGISTER();
        }
        if (tipo.equals("LOGIN")) {
            return new LOGIN();
        }
        if (tipo.equals("LOGOUT")) {
            return new LOGOUT();
        }
        if (tipo.equals("HEARTBEAT")) {
            return new HEATBEAT();
        }
        if (tipo.equals("LIST_ROOMS")) {
            return new LIST_ROOMS();
        }
        if (tipo.equals("LIST_USERS")) {
            return new LIST_USERS();
        }
        if (tipo.equals("LIST_FRIENDS")) {
            return new LIST_FRIENDS();
        }
         if (tipo.equals("JOIN")) {
            return new JOIN();
        }
        if (tipo.equals("MESSAGE")) {
            return new MESSAGE();
        }
        if (tipo.equals("PRIVATE_MESSAGE")) {
            return new PRIVATE_MESSAGE();
        }
        if (tipo.equals("ACCEPT_FRIEND_REQUEST")) {
            return new ACCEPT_FRIEND_REQUEST();
        }
         if (tipo.equals("DENY_FRIEND_REQUEST")) {
            return new DENY_FRIEND_REQUEST();
        }
  
    }

}

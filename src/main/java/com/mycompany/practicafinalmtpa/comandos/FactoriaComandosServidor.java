/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.comandos;

/**
 *
 * @author Veronica
 */
public class FactoriaComandosServidor {

    public ComandoServidor gestionarComando(String tipo) {

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
            return new HEARTBEAT();
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

        return new ERROR //esto habra q gestionarlo igual con exceptions o algo asi
    }
}

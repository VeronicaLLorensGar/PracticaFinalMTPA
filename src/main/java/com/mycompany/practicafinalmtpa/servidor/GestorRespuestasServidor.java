/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

/**
 *
 * @author Veronica
 */

    
public class GestorRespuestaServidor {

    public static void enviar(Connection c, String respuesta) {
        if (respuesta != null) {
            c.enviarMensaje(respuesta);
        }
    }

    public static String ok(String comando) {
        return "OK;" + comando;
    }

    public static String key(int clave) {
        return "KEY;" + clave;
    }

    public static String error(Exception e) {
        //estos son unos ekjjemplos-> se genera excepcion (clase eheredada de exception 
        //y todas las clases tienen un objeto gestorrespuesta, y llaman a esta clase
        if (e instanceof UsuarioExisteException) {
            return "ERROR_USER_ALREADY_EXISTS;Usuario ya existe";
        }

        if (e instanceof CredencialesInvalidasException) {
            return "ERROR_INVALID_CREDENTIALS;Credenciales invalidas";
        }

        if (e instanceof MensajeLargoException) {
            return "ERROR_MESSAGE_TOO_LONG;Mensaje demasiado largo";
        }

        if (e instanceof SalaNoExisteException) {
            return "ERROR_ROOM_NOT_FOUND;Sala no existe";
        }

        return "ERROR;Error";
    }
}

    


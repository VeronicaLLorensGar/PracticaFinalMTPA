/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.io.*;
import java.net.*;

public class Servidor {

    public static int MAX_CLIENTES = 20;
  
    public static EstadoServidor estado;
    


    public static void iniciacionServidor() {
        try {
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            //lo de los clientes conectados habra que cambiarlo luego opq cuando cuando se va uno hay q manjearlo
            
            while (true) {
                if (estado.getClientesConectados()!= MAX_CLIENTES) {
                    Socket clientSocket = listenSocket.accept();
                    Connection c = new Connection(clientSocket);
                    estado.registrarConexion();
                }else{
                    //lamar a una clase que el cliente que se quiera conectar mande un mensaje de q no se puede una notify
                }
            }
        } catch (IOException e) {
            System.out.println("Listen socket:" + e.getMessage());
        }
    }
}



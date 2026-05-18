/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.io.*;
import java.net.*;

public class Servidor {

    public static int MAX_CLIENTES = 20;
    public static int clientesConectados;
    
     //aqui no se si implementar un singleton para controlar los clientes conectados o no
    //

    public static int getClientesConectados() {
        return clientesConectados;
    }
    

    public static void iniciacionServidor() {
        try {
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            //lo de los clientes conectados habra que cambiarlo luego opq cuando cuando se va uno hay q manjearlo

            while (true) {
                if (clientesConectados == MAX_CLIENTES) {
                    Socket clientSocket = listenSocket.accept();
                    Connection c = new Connection(clientSocket);
                }
            }
        } catch (IOException e) {
            System.out.println("Listen socket:" + e.getMessage());
        }
    }
}



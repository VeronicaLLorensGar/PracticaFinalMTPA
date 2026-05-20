/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Servidor {


    public static void iniciacionServidor() {
        EstadoServidor estado = EstadoServidor.getEstado();

        try {
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            

            while (true) {
                if (estado.aceptarClientes()) {
                    Socket clientSocket = listenSocket.accept();
                   
                    Connection c = new Connection(clientSocket);
                    estado.registrarConexion();
                } else {
                    //llamar a una clase que el cliente que se quiera conectar mande un mensaje de q no se puede una notify
                    //hay que hacer aqui lo de cortar la conexion cliente/servidor para hacer mantenimiento
                }
            }
        } catch (IOException e) {
            System.out.println("Listen socket:" + e.getMessage());
        }
    }


}

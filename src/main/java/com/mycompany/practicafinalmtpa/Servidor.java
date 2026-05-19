/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.io.*;
import java.net.*;

public class Servidor {
  
  
    


    public static void iniciacionServidor() {
        EstadoServidor estado= EstadoServidor.getEstado();
        
        try {
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            //lo de los clientes conectados habra que cambiarlo luego opq cuando cuando se va uno hay q manjearlo
            
            while (true) {
                if (estado.aceptarClientes()) {
                    Socket clientSocket = listenSocket.accept();
                    Connection c = new Connection(clientSocket);
                    estado.registrarConexion();
                }else{
                    //lamar a una clase que el cliente que se quiera conectar mande un mensaje de q no se puede una notify
                    //hay que hacer aqui lo de cortar la conexion cliente/servidor para hacer mantenimiento
                }
            }
        } catch (IOException e) {
            System.out.println("Listen socket:" + e.getMessage());
        }
    }
    //metodo de la gestion del mantenimiento
    public static void mantenimiento(){
    
    
    
    }
    /*posibles opciones
    
    mantenimiento es un metodo? un boolean? o ambas
    private void CerrarServidor(){
    
    
    }
    private void CerrarCliente(){}
    interrumpirCliente(){}
    
    */
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Servidor {

    private static ArrayList<Socket> conexionesActivas = new ArrayList<>();

    public static ArrayList<Socket> getConexionesActivas() {
        return conexionesActivas;
    }

    public static void iniciacionServidor() {
        EstadoServidor estado = EstadoServidor.getEstado();

        try {
            int serverPort = 7896;
            ServerSocket listenSocket = new ServerSocket(serverPort);
            //lo de los clientes conectados habra que cambiarlo luego opq cuando cuando se va uno hay q manjearlo

            while (true) {
                if (estado.aceptarClientes()) {
                    Socket clientSocket = listenSocket.accept();
                    conexionesActivas.add(clientSocket);//nuevo para poder saber las conexiones activas que tenemos a la hora del mantenimiento
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

    public static void cerrarConexionesActivas() {
        ArrayList<Socket> lista = Servidor.getConexionesActivas();
        for (int i = 0; i < lista.size(); i++) {
            Socket s = lista.get(i);
            try {
                s.close();
            } catch (IOException e) {}
        }
        conexionesActivas = new ArrayList<>();

    }
    /*posibles opciones
    
    mantenimiento es un metodo? un boolean? o ambas
    private void CerrarServidor(){
    
    
    }
    private void CerrarCliente(){}
    interrumpirCliente(){}
    
     */
}

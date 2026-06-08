/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.cliente;

import java.net.*;
import java.io.*;

public class Cliente extends Thread {

    private Socket s = null;
    private DataInputStream in;
    private DataOutputStream out;
    private boolean conectado;
    private FrameCliente frame;
    
    public Cliente(FrameCliente frame)
    {
    this.frame=frame;
    }
    public DataOutputStream getSalida(){
    return out;
    }

    public void iniciarCliente() {

        try {
            int serverPort = 7896;
            s = new Socket("localhost", serverPort);
            in = new DataInputStream(s.getInputStream());
            out = new DataOutputStream(s.getOutputStream());
            conectado = true;
            this.start();

        } catch (UnknownHostException e) {
            System.out.println("Socket:" + e.getMessage());
        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("readline:" + e.getMessage());
        }
    }

    public void run() {
        try {
            while (conectado) {
                String protocolo = in.readUTF();
                ProcesadorMensajeCliente pm = new ProcesadorMensajeCliente();
                pm.separarComando(protocolo);
            }
        } catch (IOException e) {
            System.out.println("Error leyendo: " + e.getMessage());
        }
    }

    public void enviarMensajeServidor(String mensaje) throws IOException {
        out.writeUTF(mensaje);
    }

    public void cerrarConexion() {
        conectado = false;
        try {
            if (s != null) {
                s.close();
            }
        } catch (IOException ignored) {
        }

    }
}

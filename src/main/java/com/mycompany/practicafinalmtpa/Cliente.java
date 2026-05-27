/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
import java.net.*;
import java.io.*;

public class Cliente {

    public static Socket s = null;
    public static DataInputStream in;
    public static DataOutputStream out;

    public static void inciarCliente() {

        try {
            int serverPort = 7896;
            s = new Socket("localhost", serverPort);
            in = new DataInputStream(s.getInputStream());
            out = new DataOutputStream(s.getOutputStream());
            String data = in.readUTF();
            
            System.out.println("Received: " + data);
        } catch (UnknownHostException e) {
            System.out.println("Socket:" + e.getMessage());
        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("readline:" + e.getMessage());
        } finally {
            if (s != null) try {
                s.close();
            } catch (IOException e) {
                System.out.println("close:" + e.getMessage());
            }
        }
    }

    public void enviarMensajeServidor(String mensaje) throws IOException {
        out.writeUTF(mensaje);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;


import com.mycompany.practicafinalmtpa.salones.Salon;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Veronica
 */
public class Connection
        extends Thread {

    DataInputStream in;
    DataOutputStream out;
    Socket clientSocket;
    EstadoServidor estado = EstadoServidor.getEstado();

    private Usuario usuario;
    private Salon salonActual;

    public Connection(Socket aClientSocket) {
        try {
            clientSocket = aClientSocket;
            in = new DataInputStream(clientSocket.getInputStream());
            out = new DataOutputStream(clientSocket.getOutputStream());
            estado.registrarConexion();
            this.start();
        } catch (IOException e) {
            System.out.println("Connection:" + e.getMessage());
        }
    }

    public void run() {
        try {

            while (true) {
                String protocolo = in.readUTF();
                enviarMensaje();

                ProcesadorMensajeServidor pm = new ProcesadorMensajeServidor();
                pm.separarComando(protocolo, this);
            }

        } catch (EOFException e) {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("readline:" + e.getMessage());
        } finally {
            try {
                clientSocket.close();
                estado.registrarDesconexion();
            } catch (IOException e) {
            }
        }

    }

    public void enviarMensaje() throws IOException {
        out.writeUTF("");//revisar cuando hagamos la clase de generar respuestas y el argumento con la respuesta a enviar
    }

    //diferenciamos ambos tipos de mensajes por el formato desconocido no sabemos de momento
    /* public void enviarRespuesta(respuesta)throws IOException{
    out.writeUTF(respuesta);
    }*/
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Salon getSalonActual() {
        return salonActual;
    }

    public void setSalonActual(Salon salonActual) {
        this.salonActual = salonActual;
    }

}

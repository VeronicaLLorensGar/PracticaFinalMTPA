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
    private FrameCliente frame;
    
    public DataOutputStream getSalida(){
    return out;
    }
    
    public Cliente(FrameCliente frame){
    
    this.frame= frame;
    }

    public static void iniciarCliente() {

        try {
            int serverPort = 7896;
            s = new Socket("localhost", serverPort);
            in = new DataInputStream(s.getInputStream());
            out = new DataOutputStream(s.getOutputStream());
            
            new Thread(()->{
                try{
                    while(true){
                        String data = in.readUTF();
                        System.out.println("Recibido: "+data);
                        procesarMensaje(data);
                    }
                }catch (IOException e){
                    System.out.println("EOF:"+ e.getMessage());
                }
            }).start();
           
        } catch (UnknownHostException e) {
            System.out.println("Socket:" + e.getMessage());
        } catch (IOException e) {
            System.out.println("readline:" + e.getMessage());
        } 
    }

    public void enviarMensajeServidor(String mensaje) throws IOException {
        out.writeUTF(mensaje);
    }
}

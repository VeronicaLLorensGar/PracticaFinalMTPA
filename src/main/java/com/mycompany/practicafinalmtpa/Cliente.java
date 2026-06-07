package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
import java.net.*;
import java.io.*;



public class Cliente {

    private Socket s = null;
    private DataInputStream in;
    private DataOutputStream out;
    private FrameCliente frame;
    
    public DataOutputStream getSalida(){
    return out;
    }
    
    public Cliente(FrameCliente frame){
    
    this.frame= frame;
    }

    public void iniciarCliente() {

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
    
    private void procesarMensaje(String data){

        //mirar como lo ha hecho vero en el servidor
    }

    public void enviarMensajeServidor(String mensaje) throws IOException {
        out.writeUTF(mensaje);
        out.flush();
    }
}

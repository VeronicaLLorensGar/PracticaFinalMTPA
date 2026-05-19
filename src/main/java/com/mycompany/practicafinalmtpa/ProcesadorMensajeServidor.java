/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

/**
 *
 * @author Veronica
 */
public class ProcesadorMensajeServidor {
    String [] parte;    //esta clase simplemente separara el mensaje del comando
    
    
    //la vdd esq esto no es muy principio open-closed pq si se cambia el protocolo o se añade loq sea hay q cambiarlo asi q esto es temporal
    public String[] getParte1() {
        return parte[1];
    }
      public String[] getParte2() {
        return parte[2];
    }
       public String[] getPartes3() {
        return parte[3];
    }
         public String[] getParte4() {
        return parte[4];
    }
    public void separarComando(String mensaje) {
        
        
        parte = mensaje.split(";");
        String comando = parte[0];
        
        FactoriaComando fc= new FactoriaComandosServidor();
        fc.generarComando(comando);
        

    }

}
    

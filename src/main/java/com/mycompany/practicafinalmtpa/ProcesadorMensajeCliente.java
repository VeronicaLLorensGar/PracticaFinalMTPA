package com.mycompany.practicafinalmtpa;

/**
 *
 * @author david
 */
public class ProcesadorMensajeCliente {

   private FactoriaComando factoria;

    public ProcesadorMensajeCliente() {
        this.factoria = new FactoriaComandosCliente();
    }

    public void procesarMensaje(String mensaje) {

        String[] partes = mensaje.split(";");
        String comando = partes[0];

        Comando cmd = factoria.generarComando(comando);

        if (cmd != null) {
            cmd.procesarMensaje(partes);
        } else {
            System.out.println("Comando desconocido: " + comando);
        }
    }
}

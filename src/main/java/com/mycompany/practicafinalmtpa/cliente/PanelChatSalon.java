package com.mycompany.practicafinalmtpa.cliente;

import com.mycompany.practicafinalmtpa.cliente.FrameCliente;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//importa el paquete entero de java.swinx  y java.awt el *
import javax.swing.*;



public class PanelChatSalon extends JPanel{
    private String salon;
    
    private JLabel lblNombreSalon;
    private JTextArea areaMensajes;
    private JTextField campoMensaje;
    private JButton botonEnviar ;
    private JButton botonVolver;

    public PanelChatSalon(String salon){
    
        this.salon=salon;
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        
        lblNombreSalon= new JLabel ("Salon: "+salon);
        lblNombreSalon.setFont(new Font("Calibri",Font.BOLD,18));
        
        areaMensajes= new JTextArea();
        areaMensajes.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaMensajes);
        
        campoMensaje= new JTextField();
        
        botonEnviar = new JButton("Enviar");
        botonVolver = new JButton("Volver");
        
        setLayout(new BorderLayout());
        
        //pone el nombre del salon centrado en la parte de arriba
        add(lblNombreSalon,BorderLayout.NORTH);
        
        //pone los mensajes en el centro
        add(scroll,BorderLayout.CENTER);
        
        //pone abajo el campo, el boton de enviar y el de volver
        JPanel panelInferior = new JPanel(new BorderLayout());
        panelInferior.add(campoMensaje,BorderLayout.CENTER);
        
        JPanel panelBotones = new JPanel();
        panelBotones.add(botonEnviar);
        panelBotones.add(botonVolver);
        
        panelInferior.add(panelBotones, BorderLayout.EAST);

        add(panelInferior, BorderLayout.SOUTH);
        
        //significado?
        botonVolver.addActionListener((ActionEvent e1) -> {
            volverASalones();
        });
        
        botonEnviar.addActionListener((ActionEvent e2) -> {
            enviarMensaje();
    });
    }
    
    private void volverASalones(){
    
        //Cast del Jframe a FrameCliente para poder usar mostrarSalones...
        FrameCliente ventana =(FrameCliente)
                SwingUtilities.getWindowAncestor(this);
        ventana.mostrarSalones();
    
    }
    
    private void enviarMensaje(){
    
        String texto = campoMensaje.getText().trim();
        
        if(!texto.isEmpty()){
        
            areaMensajes.append("Yo:"+texto+"\n");
            campoMensaje.setText("");
        
        }
        
    }

}

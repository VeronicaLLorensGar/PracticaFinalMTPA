/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.persistencia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.mycompany.practicafinalmtpa.servidor.Usuario;

/**
 *
 * @author Veronica
 */
public class Persistencia {

    private static final String fichero_usuarios = "usuarios.txt";
    private static final String fichero_ia = "salonIA.txt";
    private static final String fichero_manga = "salonManga.txt";
    private static final String fichero_therian = "salonTherian.txt";
    private static final String fichero_deportes = "salonDeportes.txt";
    private static final String fichero_uemc = "salonUEMC.txt";

    public void guardarUsuario(Usuario u) {
    
    }
    public void guardarMensajes(){
    }
    public ArrayList<Mensaje> cargarMensajesDia(){
    }
      public ArrayList<Mensaje> cargarMensajesAnteriores(){
    }

    
    


}



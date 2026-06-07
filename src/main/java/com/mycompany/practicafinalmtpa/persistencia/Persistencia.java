/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.mycompany.practicafinalmtpa.servidor.Usuario;
import com.mycompany.practicafinalmtpa.mensajes.Mensaje;
import java.io.BufferedWriter;
import java.util.Date;

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

        try (FileWriter fw = new FileWriter(fichero_usuarios, true); BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(u.getNombre() + ";" + u.getContraseña());
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error guardando usuario");
        }
    }

    public void guardarMensajes(Mensaje m, String salon) {

        String fichero = obtenerFicheroSalon(salon);

        try (FileWriter fw = new FileWriter(fichero, true); BufferedWriter bw = new BufferedWriter(fw)) {

            // formato: user;mensaje;timestamp
            bw.write(m.getUser() + ";" + m.getMensaje() + ";" + m.getDate());
            bw.newLine();

        } catch (IOException e) {
            System.out.println("Error guardando mensaje");
        }
    }

    public ArrayList<Mensaje> cargarMensajesDia(String salon) {

        ArrayList<Mensaje> lista = new ArrayList<>();
        String fichero = obtenerFicheroSalon(salon);

        Date hoy = new Date();
        long inicioDia = hoy.getTime() - (24 * 60 * 60 * 1000);

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                long timestamp = Long.parseLong(partes[2]);

                if (timestamp >= inicioDia) {

                    Mensaje m = new Mensaje();
                    m.user = partes[0];
                    m.mensaje = partes[1];
                    m.date = new Date(timestamp);

                    lista.add(m);
                }
            }

        } catch (IOException e) {
            System.out.println("Error cargando mensajes del día");
        }

        return lista;
    }

    public ArrayList<Mensaje> cargarMensajesAnteriores(String salon) {

        ArrayList<Mensaje> lista = new ArrayList<>();
        String fichero = obtenerFicheroSalon(salon);

        Date hoy = new Date();
        long inicioDia = hoy.getTime() - (24 * 60 * 60 * 1000);

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                long timestamp = Long.parseLong(partes[2]);

                if (timestamp < inicioDia) {

                    Mensaje m = new Mensaje();
                    m.user = partes[0];
                    m.mensaje = partes[1];
                    m.date = new Date(timestamp);

                    lista.add(m);
                }
            }

        } catch (IOException e) {
            System.out.println("Error cargando mensajes antiguos");
        }

        return lista;
    }

    private String obtenerFicheroSalon(String salon) {

        if (salon.equalsIgnoreCase("IA")) {
            return fichero_ia;
        }
        if (salon.equalsIgnoreCase("MANGA")) {
            return fichero_manga;
        }
        if (salon.equalsIgnoreCase("THERIAN")) {
            return fichero_therian;
        }
        if (salon.equalsIgnoreCase("DEPORTES")) {
            return fichero_deportes;
        }
        if (salon.equalsIgnoreCase("UEMC")) {
            return fichero_uemc;
        }

        return //error;
    }
}



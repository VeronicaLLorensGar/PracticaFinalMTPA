/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Veronica
 */
//va a haber que hacer algo con el tema de los gestores, o in singleton o algo pq todos tiene q  tener las mismas listas y manejarlas
public class GestorUsuarios {

    private static GestorUsuarios instancia;

    private GestorUsuarios() {
    }

    public static GestorUsuarios getInstancia() {
        if (instancia == null) {
            instancia = new GestorUsuarios();
        }

        return instancia;
    }

    private static final String fichero = "usuarios.txt";

    public boolean existeNombre(String nombre) {

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes[0].equals(nombre)) {
                    return true;
                }
            }

        } catch (IOException e) {

        }

        return false;
    }

    public boolean validarCredenciales(String nombre, int contraseña) {

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split(";");

                String user = partes[0];
                int pass = Integer.parseInt(partes[1]);

                if (user.equals(nombre) && pass == contraseña) {
                    return true;
                }
            }

        } catch (IOException e) {
        }

        return false;
    }

}

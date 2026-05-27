/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import com.mycompany.practicafinalmtpa.cliente.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Veronica
 */
//va a haber que hacer algo con el tema de los gestores, o in singleton o algo pq todos tiene q  tener las mismas listas y manejarlas
public class GestorUsuarios {
    private static ArrayList<Usuario> listUsers = new ArrayList<>();

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

}

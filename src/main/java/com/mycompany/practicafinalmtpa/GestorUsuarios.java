/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Veronica
 */
public class GestorUsuarios {

    private static final String fichero = "usuarios.txt";

    public boolean existeNombre(String nombre) {

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes[0].equals(nombre)) {
                    return false;                }
            }

        } catch (IOException e) {

        }

        return false;
    }

}

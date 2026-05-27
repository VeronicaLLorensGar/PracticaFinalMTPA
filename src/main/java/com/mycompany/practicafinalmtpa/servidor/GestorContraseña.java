/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicafinalmtpa.servidor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Veronica
 */
public class GestorContraseña {

    private static final String fichero = "usuarios.txt";

    public int generarContraseña() {
        int password= 0;
        Random random = new Random();
        boolean encontrado = false;
        
        while(encontrado){
        password = 10000 + random.nextInt(90000);
        encontrado = existePassword(password);
        }
       return password;
    }

    public boolean existePassword(int password) {

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                int comprobar = Integer.parseInt(partes[1]);

                if (comprobar == password) {
                    return true;
                }
            }

        } catch (IOException e) {
            
        }

        return false;
    }

}



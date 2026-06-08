/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.practicafinalmtpa.comandos;

/**
 *
 * @author Veronica
 */
//para los comandos que le llegan al cliente, no los tiene que procesar pro eso no necesita connection
public interface ComandoCliente {
    public void ejecutar(String[] parte);
    
}

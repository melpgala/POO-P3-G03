/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

public class Servicio {
    private double precio;
    private String nombre;
    private int codigo;
    
    public Servicio(double precio, String nombre){
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = generarCodigo();  
    }
    
    public int generarCodigo(){}
}

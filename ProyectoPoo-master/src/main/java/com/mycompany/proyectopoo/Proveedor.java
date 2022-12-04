/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

public class Proveedor extends Administrado{
    
    public Proveedor(String nombre, String telefono, String direccion){
        super(nombre,telefono,direccion);
        this.codigo = generarCodigo();
        
    }
    
    
    
    
    
}

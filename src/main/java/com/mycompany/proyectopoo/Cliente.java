/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

public class Cliente extends Administrado{
    private String tipoCliente; //enum
    public Cliente(String nombre, String telefono, String direccion, String tipoCliente){
        super(nombre,telefono,direccion);
        this.tipoCliente = tipoCliente;
        this.codigo = generarCodigo();
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
    
}

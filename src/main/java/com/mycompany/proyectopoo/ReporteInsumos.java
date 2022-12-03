/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoo;

public class ReporteInsumos {
    private Tecnico tecnico;
    private String descripcion;
    private boolean correo;
    
    public ReporteInsumos(Tecnico tecnico, String descripcion, boolean correo){
        this.tecnico = tecnico;
        this.descripcion = descripcion;
        this.correo = correo;
    }
    
    public void crearCorreo(){}
    
    
}

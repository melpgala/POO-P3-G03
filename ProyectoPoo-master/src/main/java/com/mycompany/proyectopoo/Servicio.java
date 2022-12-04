
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

    public int getCodigo() {
        return codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean equals(int c){
        return codigo == c;
    }
}



package com.mycompany.proyectopoo;

public class Servicio {
    private double precio;
    private String nombre;
    private int codigo;
    private static int contador;
    
    public Servicio(double precio, String nombre){
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = contador +1;
        contador++;
 
    }
    

    public int getCodigo() {
        return codigo;
    }
    
    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean equals(int c){  //modificar
        return codigo == c;
    }

    public String getNombre() {
        return nombre;
    }
    
}


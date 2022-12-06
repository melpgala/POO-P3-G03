
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
    
    public Servicio(int codigo){
        this.codigo = codigo;
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

    public boolean equals(Object ob){  //modificar
        Servicio serv = (Servicio) ob;
        return this.codigo == serv.codigo ;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString(){
        return (codigo +" "+ nombre+ " "+ precio);
    }
    
    
}


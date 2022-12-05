
package com.mycompany.proyectopoo;

public class Administrado {
    
    protected int codigo;
    protected static int contador;
    protected String nombre;
    protected String telefono;
    protected String direccion;
    

    public Administrado(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigo = contador +1;
        contador++;
       
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

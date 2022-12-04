
package com.mycompany.proyectopoo;

public class Administrado {
    
    protected int codigo;
    protected String nombre;
    protected String telefono;
    protected String direccion;

    public Administrado(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
       
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
    
    public int generarCodigo(){
    return 0;
     }
    
    
}


package com.mycompany.proyectopoo.Administrable;

public class Administrado {
    
    protected int codigo;
    // el contador se encargara de generar el codigo para clientes y proveedores
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
    
    public Administrado(int codigo){
        this.codigo = codigo;
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
   
    public String toString(){
        return (codigo +" "+nombre + " "+ direccion+ " "+ telefono);
    }
    
}

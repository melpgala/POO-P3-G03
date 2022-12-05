
package com.mycompany.proyectopoo;

public class Proveedor extends Administrado{
    
    public Proveedor(String nombre, String telefono, String direccion){
        super(nombre,telefono,direccion);
        this.codigo = generarCodigo();
        
    } 
}

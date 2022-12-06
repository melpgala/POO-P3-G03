
package com.mycompany.proyectopoo;

public class Cliente extends Administrado{
    private String tipoCliente; 
    public Cliente(String nombre, String telefono, String direccion, int tipoCliente){
        super(nombre,telefono,direccion);
        switch(tipoCliente){
            case 1 -> this.tipoCliente = "Personal";
            case 2 -> this.tipoCliente = "Empresarial";
        }
    }
    public Cliente(int codigo){
        super(codigo);
    
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
    
    public boolean equals(Object ob){
        Cliente cl = (Cliente) ob;
        return (this.codigo == cl.codigo);
    }

    public String toString() {
        return (super.toString() +" "+ tipoCliente);
    }
    
    
}

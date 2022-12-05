
package com.mycompany.proyectopoo;

public abstract class Personal {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected Cargo cargo;
    
    
    public Personal(String usuario, String contrasena, String nombre, Cargo cargo){
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.cargo = cargo;
    }
    
    public abstract void mostrarMenu();

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

}

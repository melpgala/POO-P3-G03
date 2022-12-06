
package com.mycompany.proyectopoo.Personal;

public class Personal{ 
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
    
    public void mostrarMenu(){};  //mostrará un menú dependiendo del cargo que tenga la persona

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean equals(Object objeto){  //sobre escritura de equals para realizar comparaciones
        Personal comparacion = (Personal) objeto;
        return (this.usuario.equals(comparacion.usuario) && (this.contrasena.equals(comparacion.contrasena)));
    }
}

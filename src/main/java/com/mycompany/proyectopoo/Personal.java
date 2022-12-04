
package com.mycompany.proyectopoo;

public class Personal {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected Cargo cargo;
    
    public Personal(String usuario, String contrasena, String nombre, Cargo cargo){
        //this(usuario,contrasena);
        this.nombre = nombre;
        this.cargo = cargo;
    }
    
    /*public Personal(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    */
    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public Cargo getCargo() {
        return cargo;
    }
    
    /*
    public boolean equals(Object objeto){
        Personal comparacion = (personal) objeto;
        return this.usuario.equals(comparacion.usuario) and this.contrasena.equals(comparacion.contrasena);
    }
    */
   
}


package com.mycompany.proyectopoo.Facturable;

import com.mycompany.proyectopoo.Personal.Tecnico;

public class ReporteInsumos {
    private Tecnico tecnico;
    private String descripcion;
    private boolean correo;
    
    public ReporteInsumos(Tecnico tecnico, String descripcion, boolean correo){
        this.tecnico = tecnico;
        this.descripcion = descripcion;
        this.correo = correo;
    }
    
    public void crearCorreo(){} //metodo utilizado para enviar correo
    //al no tener como enviar correos se deja expresada la intencion del metodo
    
    
}

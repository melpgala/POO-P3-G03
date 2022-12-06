
package com.mycompany.proyectopoo.Facturable;

import com.mycompany.proyectopoo.Administrable.Servicio;
import com.mycompany.proyectopoo.Administrable.Cliente;
import com.mycompany.proyectopoo.Personal.Tecnico;
import java.util.ArrayList;

public class OrdenServicio {
    private String[] fecha = new String[3];
    private String tipoVehiculo;/////
    private String placaVehiculo;
    private Cliente cliente;
    private Tecnico tecnico;
    private ArrayList<Servicio> listaServiciosRealizados;
    
    public OrdenServicio(Cliente cliente, Tecnico tecnico, String[] fecha, String placaVehiculo, int numVehiculo, ArrayList<Servicio> listaServiciosRealizados){
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.fecha = fecha;
        this.placaVehiculo = placaVehiculo;
        switch (numVehiculo){
            case 1 -> this.tipoVehiculo = "Automovil";
            case 2 -> this.tipoVehiculo = "Motocicleta";
            case 3 -> this.tipoVehiculo = "Bus";
            
        }
        this.listaServiciosRealizados =listaServiciosRealizados;
    }
    

    public OrdenServicio(Cliente cl, String[] fecha){
        this.cliente = cl;
        this.fecha = fecha;
    }
    public String[] getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public ArrayList<Servicio> getListaServiciosRealizados() {
        return listaServiciosRealizados;
    }
    
    // se sobre escribe el equals para comparaciones
    public boolean equals(Object ob){ 
        OrdenServicio orden = (OrdenServicio) ob;
        
        //verifica que el cliente sea no nulo y compara sus codigos
        if (orden.getCliente() != null){
            
            if(this.cliente.equals(orden.getCliente())){ 
                return this.fecha[1].equals(orden.getFecha()[0]) && this.fecha[2].equals(orden.getFecha()[1]);
                // compara mes y año
            }
        
        }
        
        //verifica que el cliente sea nulo, sirve unicamente para comparar las fechas
        else if(orden.getCliente() == null){
            return this.fecha[1].equals(orden.getFecha()[0]) && this.fecha[2].equals(orden.getFecha()[1]);
        }
        
        return false;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }
    
    
}

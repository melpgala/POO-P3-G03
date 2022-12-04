
package com.mycompany.proyectopoo;

import java.util.ArrayList;

public class OrdenServicio {
    private String fecha;
    private int tipoVehiculo;
    private String placaVehiculo;
    private Cliente cliente;
    private Tecnico tecnico;
    private ArrayList<Servicio> listaServiciosRealizados;
    
    public OrdenServicio(Cliente cliente, Tecnico tecnico, String fecha, String placaVehiculo, int tipoVehiculo, ArrayList<Servicio> listaServiciosRealizados){
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.fecha = fecha;
        this.placaVehiculo = placaVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.listaServiciosRealizados =listaServiciosRealizados;
    }
}

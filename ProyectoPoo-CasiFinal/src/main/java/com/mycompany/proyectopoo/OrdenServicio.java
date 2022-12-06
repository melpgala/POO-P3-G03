
package com.mycompany.proyectopoo;

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
    
    public boolean equals(int codigo, String[] fechaIns){  /// no creo que ste bien
        if(cliente.equals(codigo)){
            if(fecha[1].equals(fechaIns[0]) && fecha[2].equals(fechaIns[1]))
                return true;
        }
        return false;
    }
    
    public boolean equals(String[] fechaIns){  // no se si esta pueda estar bien
        return (fecha[1].equals(fechaIns[0]) && fecha[2].equals(fechaIns[1]));
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }
    
    
}


package com.mycompany.proyectopoo;
import java.util.ArrayList;
public class Factura {
    private Cliente cliente;
    private String[] fecha = new String[2];
    private ArrayList<OrdenServicio> listaOrdenesCliente = new ArrayList<>();
    
    public Factura(int codigo,String[] fecha,ArrayList<OrdenServicio> listaOrdenesCliente){
        //busca al cliente por el codigo
        ArrayList<Cliente> listaClientes = Sistema.getListaClientes();
        int indice = listaClientes.indexOf(codigo);
        Cliente clienteP =  listaClientes.get(indice); //deberia ser el cliente de la asignacion de rriba
        
        //asginacion de parametros al objeto factura
        this.cliente = clienteP;
        this.fecha = fecha;
        this.listaOrdenesCliente = listaOrdenesCliente;
    }
    
    public void imprimeFactura(){
        System.out.println("Empresa: " + cliente.getNombre() );
        System.out.println("Periodo de facturacion: " + fecha[0]+"/" + fecha[1]);
        System.out.println("Detalles de servicio:");
        System.out.format("%-10s %-10s %-12s %-15s %-12s %-5s", "#Placa", "Fecha", "Tipo","Servicio","Cantidad","Total\n");
        double precio =0;
        for(OrdenServicio orden: listaOrdenesCliente){
            
            for(Servicio serv: orden.getListaServiciosRealizados()){
               precio += serv.getPrecio();
               System.out.format("%-10s %-10s %-12s %-15s %-12s %-5s", orden.getPlacaVehiculo(), orden.getFecha()[0]+"/"+orden.getFecha()[1], orden.getTipoVehiculo(), serv.getNombre(),"1" ,serv.getPrecio()+"\n");
            }
        }
        System.out.println("Total a pagar: "+ precio);
    }
   
} 

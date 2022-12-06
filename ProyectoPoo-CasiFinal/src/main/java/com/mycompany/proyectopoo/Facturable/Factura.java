
package com.mycompany.proyectopoo.Facturable;
import com.mycompany.proyectopoo.Administrable.Servicio;
import com.mycompany.proyectopoo.Administrable.Cliente;
import com.mycompany.proyectopoo.Sistema;
import java.util.ArrayList;
public class Factura {
    private Cliente cliente;
    private String[] fecha = new String[2];
    private ArrayList<OrdenServicio> listaOrdenesCliente = new ArrayList<>();
    
    public Factura(int codigo,String[] fecha,ArrayList<OrdenServicio> listaOrdenesCliente){
        //busca al cliente por el codigo
        ArrayList<Cliente> listaClientes = Sistema.getListaClientes();
        int indice = listaClientes.indexOf(new Cliente(codigo));
        Cliente clienteP =  listaClientes.get(indice); 
        
        //asginacion de parametros al objeto factura
        this.cliente = clienteP;
        this.fecha = fecha;
        this.listaOrdenesCliente = listaOrdenesCliente;
    }
    
    public void imprimeFactura(){
        System.out.println("Empresa: " + cliente.getNombre() );
        System.out.println("Periodo de facturacion: " + fecha[0]+"/" + fecha[1]);
        System.out.println("Detalles de servicio:");
        System.out.format("%-10s %-10s %-12s %-40s %-12s %-5s", "#Placa", "Fecha", "Tipo","Servicio","Cantidad","Total\n");
        double precio =0;
        
        // recorremos las ordenes que se encuentran en la lista
        for(OrdenServicio orden: listaOrdenesCliente){
            
            //recorremos los servicios de cada orden
            for(Servicio serv: orden.getListaServiciosRealizados()){
               precio += serv.getPrecio();
               System.out.format("%-10s %-10s %-12s %-40s %-12s %-5s", orden.getPlacaVehiculo(), orden.getFecha()[0]+"/"+orden.getFecha()[1], orden.getTipoVehiculo(), serv.getNombre(),"1" ,serv.getPrecio()+"\n");
            }
        }
        
        //se agrega valor adicional a las empresas
        if (cliente.getTipoCliente().equals("Empresarial")){
            System.out.println("Por tener prioridad en la atencion: $50 adicionales");

            System.out.println("Total a pagar: "+ (precio + 50));
        }
        else {
            System.out.println("Total a pagar: "+ precio);
        }
    }
   
} 

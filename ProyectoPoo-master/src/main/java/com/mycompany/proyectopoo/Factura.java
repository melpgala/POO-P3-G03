
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
        Cliente clienteP =  listaClientes.get(indice);
        
        //asginacion de parametros al objeto factura
        this.cliente = clienteP;
        this.fecha = fecha;
        this.listaOrdenesCliente = listaOrdenesCliente;
    }
    
    public void imprimeFactura(){}
   
}

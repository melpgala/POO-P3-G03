
package com.mycompany.proyectopoo.Personal;
import com.mycompany.proyectopoo.Administrable.Cliente;
import com.mycompany.proyectopoo.Facturable.Factura;
import com.mycompany.proyectopoo.Facturable.OrdenServicio;
import com.mycompany.proyectopoo.Personal.Tecnico;
import com.mycompany.proyectopoo.Personal.Personal;
import com.mycompany.proyectopoo.Administrable.Servicio;
import com.mycompany.proyectopoo.Sistema;
import java.util.Scanner;
import java.util.ArrayList;

public class Cobranza extends Personal{
    
    public Cobranza(String usuario, String contrasena, String nombre,Cargo cargo){
        super(usuario,contrasena,nombre,cargo);
    }
    
    @Override
    public void mostrarMenu(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Seleccione el número de la acción que desea realizar:");
      System.out.println("1. Generar facturas a empresas.\n2. Reporte de ingresos por servicios.\n3. Reporte de atenciones por técnico.");
      int opcion = sc.nextInt();
      sc.nextLine();
      
       //verificacion de uso de opcion correcta
       while(opcion < 1 && opcion > 3){
           System.out.println("Ingrese el número de una acción valida");
           opcion = sc.nextInt();
           sc.nextLine();
        }
       
        // llamando los metodos correspondientes a las opciones
        switch(opcion){
          case 1 -> generarFactura();
          case 2 -> reporteIngreso();
          case 3 -> reporteTecnico(); 
        }            
    }

    
    public void generarFactura(){
        // pide los datos para la factura
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el código del cliente a quien le desea generar la factura:");
        int codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Inserte el mes y año de facturación, recuerde que la fecha debe de tener el siguiente formato: mm/aaaa");
        String fecha = sc.nextLine();
        String[] listaFecha = fecha.split("/");
        
        //busca las ordenes de servicios de las empresas
        ArrayList<OrdenServicio> listaOrdenesFiltrada = new ArrayList<>();
        ArrayList<Cliente> listaCliente = Sistema.getListaClientes();
        
        //buscamos el cliente
        int indice = listaCliente.indexOf(new Cliente(codigo));
        Cliente cliente = listaCliente.get(indice);
        
        //filtramos las ordenes de servicio segun cliente y fecha
        for(OrdenServicio orden: Sistema.getListaOrdenes()){
            if(orden.equals(new OrdenServicio(cliente,listaFecha))){ 
                listaOrdenesFiltrada.add(orden);
            }
        }
        
        //creacion de facturas
        Factura factura1 = new Factura(codigo,listaFecha,listaOrdenesFiltrada);
        factura1.imprimeFactura();
        
        mostrarMenu();
        
    }
    
    public void reporteIngreso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese mes y año que desee consultar, recuerde que la fecha debe tener el siguiente formato: mm/aaaa");
        String fecha = sc.nextLine();
        String[] listaFecha = fecha.split("/");
        
        //busca los servicios del mes
        ArrayList<Servicio> totalServicios = new ArrayList<>();
        ArrayList<Servicio> serviciosSinRepetir =new ArrayList<>();
        ArrayList<Integer> contador = new ArrayList<>();
        for(OrdenServicio orden: Sistema.getListaOrdenes()){
            if(orden.equals(new OrdenServicio(null,listaFecha))){ // mirar si el equals esta bien
                totalServicios.addAll(orden.getListaServiciosRealizados());
            }
        }
        
        //contando los servicios
        for(Servicio servicio: totalServicios){
            if(!serviciosSinRepetir.contains(servicio)){ // esta bien pero debe modificar el equals para que sea un objeto como este
                serviciosSinRepetir.add(servicio);
                contador.add(1);
            }else{
                int indice = serviciosSinRepetir.indexOf(servicio);
                contador.set(indice,contador.get(indice)+1);
                //revisar equals()
            }    
        }
        
        //uso del format para salida de informacion
        double total =0;
        System.out.format("%-50s %-7s", "Servicio","Total\n");
        for(int i= 0; i<serviciosSinRepetir.size();i++){
            System.out.format("%-50s %-7s", serviciosSinRepetir.get(i).getNombre(),contador.get(i)*serviciosSinRepetir.get(i).getPrecio()+"\n");
            total+= contador.get(i)*serviciosSinRepetir.get(i).getPrecio();
        }
        System.out.println("Total recaudado por los servicios: " + total);
        mostrarMenu();
        
     
        

    }
    
    public void reporteTecnico(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese mes y año que desee consultar, recuerde que la fecha debe tener el siguiente formato: mm/aaaa");
        String fecha = sc.nextLine();
        String[] listaFecha = fecha.split("/");
        

        ArrayList<Tecnico> totalTecnicos = new ArrayList<>(); //guarda los tecnicos de cada orden
        ArrayList<Tecnico> tecnicosSinRepetir = new ArrayList<>(); //lista de tecnicos sin repetir
        ArrayList<Double> acumulador = new ArrayList<>(); // guarda el total de cada orden
        ArrayList<Double> contador = new ArrayList<>(); // guarda el total de cada tecnico
        
        //se obtiene las ordenes de servicio en la fecha ingresada
        for(OrdenServicio orden: Sistema.getListaOrdenes()){
            if(orden.equals(new OrdenServicio(null,listaFecha))){  // ver el equals
                totalTecnicos.add(orden.getTecnico());
                ArrayList<Servicio> serviciosTecnico = orden.getListaServiciosRealizados();
                double acumuladorPrecio = 0;
                for(Servicio servicio : serviciosTecnico){
                    acumuladorPrecio += servicio.getPrecio();
                }
                acumulador.add(acumuladorPrecio);  
            }
        } 
        
        //contando los tecnicos y los ingresos recaudados
        for(int t = 0;t < totalTecnicos.size();t++ ){
            if(!tecnicosSinRepetir.contains(totalTecnicos.get(t))){
                tecnicosSinRepetir.add(totalTecnicos.get(t));
                contador.add(acumulador.get(t));
            }else{
                int indice = tecnicosSinRepetir.indexOf(totalTecnicos.get(t));
                contador.set(indice,(contador.get(indice)+ acumulador.get(t))); ////
                //revisar equals()
            }    
        }
        
        //mostrar cuando recaudo cada tecnico
        System.out.format("%-20s %-7s", "Tecnico","Total\n");
        for(int e=0; e<tecnicosSinRepetir.size(); e++ ){
            System.out.format("%-20s %-7s",tecnicosSinRepetir.get(e).getNombre(),contador.get(e)+"\n");
        }
        
        mostrarMenu();
        
    }
    
}

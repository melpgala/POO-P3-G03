
package com.mycompany.proyectopoo;
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
        for(OrdenServicio orden: Sistema.getListaOrdenes()){
            if(orden.equals(codigo,listaFecha)){  /// cambiar el equals
                listaOrdenesFiltrada.add(orden);
            }
        }
        
        //creacion de facturas
        Factura factura1 = new Factura(codigo,listaFecha,listaOrdenesFiltrada);
        factura1.imprimeFactura();
        sc.close();
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
            if(orden.equals(listaFecha)){ // mirar si el equals esta bien
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
        
        //format
        for(int i= 0; i<serviciosSinRepetir.size();i++){
           //format.(serviciosSinRepetir.get(i).getNombre(),contador.get(i)*serviciosSinRepetir.get(i).getPrecio()) 
        }
        /* total = 0
        for (int i= 0; i<serviciosSinRepetir.size();i++){
          subtotal = contador.get(i)*serviciosSinRepetir.get(i).getPrecio()
          total+= subtotal
        */
        

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
        for(OrdenServicio orden: Sistema.getListaOrdenes()){
            if(orden.equals(listaFecha)){  // ver el equals
                totalTecnicos.add(orden.getTecnico());
                ArrayList<Servicio> serviciosTecnico = orden.getListaServiciosRealizados();
                double acumuladorPrecio = 0;
                for(Servicio servicio : serviciosTecnico){
                    acumuladorPrecio += servicio.getPrecio();
                }
                acumulador.add(acumuladorPrecio);  
            }
        } 
        
        //contando los tecnicos
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
        
        
    }
    
}

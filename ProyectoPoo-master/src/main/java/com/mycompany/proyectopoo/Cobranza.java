
package com.mycompany.proyectopoo;
import java.util.Scanner;

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
    }
    
    public void reporteIngreso(){}
    
    public void reporteTecnico(){}
    
}

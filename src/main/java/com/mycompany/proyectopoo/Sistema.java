
package com.mycompany.proyectopoo;

import java.util.Scanner;
public class Sistema {
     /*ArrayList<Personal> personal;
    ArrayList<Cliente> clientes;
    ArrayList<Servicio> servicios;
    ArrayList<Proveedor> proveedores;
    ArrayList<Factura> facturas; revisar este de ordenes
    
    public Sistema(){
       personal = new ArrayList<Personal>;
       clientes = new ArrayList<Cliente>;
       servicios = new ArrayList<Servicio>;
    proveedores = new ArrayList<Proveedor>;
    ArrayList<Factura> facturas =  new ArrayList<Factura>;
    
    -Poner datos dados por la miss
    -Dejar que al mismo tiempo se haga login automatico 
    }
    */
    
        public boolean logIn(){
        boolean registrado = false;
        while(!registrado){
        System.out.println("Ingrese usuario: ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        
        System.out.println("Ingrese contrasena: ");
        String contra = sc.nextLine();
        /*
            registrado = personal.contains(new Personal(user,contra));
        */
        
            
        if(user == usuario) // esto se borraria se cambia la condicion

        }
        /*for(Personal persona: personal){
        boolean personaCorrecta = persona.equals(new Personal(user,contra));
            if(personaCorrecta){
            if (persona instanceof admin){
                Admin esAdministrador = (Admin) admin;
                
        }
            else if( persona instanceof cobranza){}
        else if( persona instanceof tecnico){}
        }
        }
        
        
        
        }
        */
        
        
}

        
        /*
        puedo crear el 
        public static void main(String[] args){
            System.out.println("Bienvenido")
            Sistema inicioSistema = new Sistema();
            
            
        }
        */
//} falta otro corchete 
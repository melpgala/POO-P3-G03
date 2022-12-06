
package com.mycompany.proyectopoo;
import java.util.Scanner;
import java.util.ArrayList;

public class Admin extends Personal{
    
    public Admin(String usuario, String contrasena, String nombre, Cargo cargo) {
        super(usuario,contrasena,nombre,cargo);
    }
    
    @Override
    public void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el número de la acción que desea realizar:");
        System.out.println("1. Administrar clientes.\n2. Administrar proveedores. \n3. Administrar servicios.");
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
          case 1 -> administrarClientes();
          case 2 -> administrarProveedor();
          case 3 -> administrarServicios();
        }
        
    }
    
    public void administrarClientes(){
    // mostrar los clientes
        for(Cliente cl: Sistema.getListaClientes()){
            System.out.println(cl);
        }
        System.out.println("Seleccione el numero de opción que desea realizar.");
        System.out.println("1. Agregar Cliente.\n2. Regresar al menú principal");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        sc.nextLine();
        
        //verificacion de uso de opcion correcta
        while(opcion < 1 && opcion > 2){
            System.out.println("Ingrese el número de una acción valida");
            opcion = sc.nextInt();
            sc.nextLine();
        }
        
        switch(opcion){
            case 1 -> agregarCliente();
            case 2 -> mostrarMenu(); //regresa al menu anterior
        }    
      
    }
    
    
    public void agregarCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la dirección del cliente:");
        String direccion = sc.nextLine();
        System.out.println("Ingrese telefono del cliente: ");
        String telefono = sc.nextLine();
        System.out.println("¿Qué tipo de cliente es?\nSi es de tipo Personal digite 1.\nSi es de tipo Empresarial digite 2.");
        int tipoCliente = sc.nextInt();
        sc.nextLine();
        Sistema.addCliente(new Cliente(nombre,direccion,telefono,tipoCliente));
        System.out.println("Cliente creado con éxito");
        administrarClientes(); //devuelve al submenu
    }

    public void administrarProveedor(){
        // mostrar los proveedores
        for(Proveedor prov: Sistema.getListaProveedores()){
            System.out.println(prov);
        }
        System.out.println("Seleccione el numero de opción que desea realizar.");
        System.out.println("1. Agregar Proveedor.\n2. Regresar al menú principal");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        sc.nextLine();
        
        //verificacion de uso de opcion correcta
        while(opcion < 1 && opcion > 2){
            System.out.println("Ingrese el número de una acción valida");
            opcion = sc.nextInt();
            sc.nextLine();
        }
        
        switch(opcion){
            case 1 -> agregarProveedor();
            case 2 -> mostrarMenu(); //regresa al menu anterior  
        }    
      
    }
    
    
    public void agregarProveedor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del Proveedor:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la dirección del Proveedor:");
            String direccion = sc.nextLine();
            System.out.println("Ingrese telefono del Proveedor: ");
            String telefono = sc.nextLine();
            Sistema.addProveedor(new Proveedor(nombre,direccion,telefono));
            System.out.println("Proveedor creado con éxito");
            administrarProveedor(); //devuelve al submenu 
    }
    
    
    public void administrarServicios(){
    // mostrar los servicios
        for(Servicio serv: Sistema.getListaServicios()){
            System.out.println(serv);
        }
        System.out.println("Seleccione el numero de opción que desea realizar.");
        System.out.println("1. Agregar Servicio.\n2. Editar Servicio.\n3. Regresar al menú principal");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        sc.nextLine();
        
        //verificacion de uso de opcion correcta
        while(opcion < 1 && opcion > 3){
            System.out.println("Ingrese el número de una acción valida");
            opcion = sc.nextInt();
            sc.nextLine();
        }
        
        switch(opcion){
            case 1 -> agregarServicio();
            case 2 -> modificarValorServicio();
            case 3 -> mostrarMenu(); //regresa al menu anterior  
        }
    }
    
    
    
    public void agregarServicio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del Servicio:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el precio del Servicio:");
        double precio = sc.nextDouble();
        sc.nextLine();
        Sistema.addServicio(new Servicio(precio,nombre));
        administrarServicios();
        
    }
    
    public void modificarValorServicio(){
        System.out.println("Indique el código del servicio que desea modificar.");
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        sc.nextLine();
        
        //verificar que el código del servicio existe
        while(!Sistema.getListaServicios().contains(new Servicio(codigo))){ // cambiar equals
            System.out.println("código no encontrado, inserte un código valido");
            codigo = sc.nextInt();
        }
        
        System.out.println("Inserte el nuevo precio del Servicio");
        double precio = sc.nextDouble();
        
        int indice = Sistema.getListaServicios().indexOf(new Servicio(codigo));
        Sistema.setPrecioServicio(indice, precio);
        System.out.println("Se ha cambiado el precio al servicio de forma exitosa");
        
        administrarServicios();
    }  
}
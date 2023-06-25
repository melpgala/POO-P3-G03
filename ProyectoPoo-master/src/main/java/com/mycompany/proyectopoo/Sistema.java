package com.mycompany.proyectopoo;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
     /* se insertan como atributos los inicializadores de las clases tenico, cobranza y admin
    se inserta constructor
    */
    
    public void iniciarSistema(){
        // se inicializan objetos usando sus clases inicializadoras
        // se usa gestionadoir de inicion de seeion
        
    }

  //insertar codigo necesrio para Sistema
  /*
    private static ArrayList<Personal> listaUsuarios = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Servicio> listaServicios = new ArrayList<>();
    private static ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    private static ArrayList<OrdenServicio> listaOrdenes = new ArrayList<>();
    private static ArrayList<ReporteInsumos> listaReportes = new ArrayList<>();
    
    

    
    public void Sistema(){
      //creacion de los objetos personal
      listaUsuarios.add(new Admin("admin1","12345678","Administrador",Cargo.ADMIN));
      listaUsuarios.add(new Tecnico("alopez","al123456","Alvaro Lopez",Cargo.TECNICO));
      listaUsuarios.add(new Cobranza("mcastro","mc123456","Maria Castro",Cargo.COBRANZA));
      listaUsuarios.add(new Tecnico("mbarcos","mb123456","Mario Barcos",Cargo.TECNICO));
      
      //creacion de objetos cliente
      
      //creacion de objetos servicio
      
      //creacion de objetos proveedores
      
      //creacion de objetos ordene de servicio
      
      //creacion de objetos reporte de insumos
      logIn();
    }
    
    
    
    public static void logIn(){ // cambie a void en lugar de boolean
      boolean registrado = false;
      String user;
      String contra;
      Scanner sc = new Scanner(System.in);
      while(!registrado){
        System.out.println("Ingrese usuario: ");
        user = sc.nextLine();
        
        System.out.println("Ingrese contrasena: ");
        contra = sc.nextLine();
      
        registrado = listaUsuarios.contains(new Personal(user, contra, "deprueba",Cargo.ADMIN));
        if (registrado){
            for(Personal persona: listaUsuarios){
                boolean personaCorrecta = persona.equals(new Personal(user,contra,"Deprueba",Cargo.ADMIN));
                if(personaCorrecta){
                    System.out.println("Registrado Con Exito");
                    if (persona instanceof Admin){
                        Admin esAdministrador = (Admin) persona;
                        esAdministrador.mostrarMenu();
                        }
                    else if (persona instanceof Cobranza){
                        Cobranza esCobranza = (Cobranza) persona;
                        esCobranza.mostrarMenu();
                        }
                    else if(persona instanceof Tecnico){
                        Tecnico esTecnico = (Tecnico) persona;
                        esTecnico.mostrarMenu();
                        } 
                     //para que sepa el tecnico deberia conseguir cual es el tecnico en la lista no solo hacer el downcasting ya no creo

            }
            }
            //desea continuar y la regresa al bucle de registro o sale
      }
        else{
            System.out.println("Usuario no encontrado, vuelva a intentarlo.");
            
        }
        
      
      }
      sc.close();
      
      
  }
        
    
        
            

    

    public static ArrayList<Personal> getListaUsuarios() {
        return listaUsuarios;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static void addCliente(Cliente c){
        listaClientes.add(c);
    }

    public static ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }
    
    public static void setPrecioServicio(int indice, double nuevoPrecio){
        Servicio servCamb = listaServicios.get(indice);
        servCamb.setPrecio(nuevoPrecio);
        listaServicios.add(indice,servCamb);
    }

    
   
    public static void addServicio(Servicio s){
        listaServicios.add(s);
    }
    
    public static ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public static void addProveedor(Proveedor p){
        listaProveedores.add(p);
    }
    
    public static ArrayList<OrdenServicio> getListaOrdenes() {
        return listaOrdenes;
    }

    public static void addOrdenServicio(OrdenServicio o){
        listaOrdenes.add(o);
    }
    
    public static ArrayList<ReporteInsumos> getListaReportes() {
        return listaReportes;
    }
    
    public static void addReporte(ReporteInsumos r){
        listaReportes.add(r);
    }
  */
  }
    

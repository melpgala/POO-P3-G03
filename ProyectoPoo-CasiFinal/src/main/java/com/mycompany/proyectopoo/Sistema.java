package com.mycompany.proyectopoo;
import com.mycompany.proyectopoo.Personal.Cargo;
import com.mycompany.proyectopoo.Facturable.ReporteInsumos;
import com.mycompany.proyectopoo.Facturable.OrdenServicio;
import com.mycompany.proyectopoo.Administrable.Proveedor;
import com.mycompany.proyectopoo.Administrable.Servicio;
import com.mycompany.proyectopoo.Administrable.Cliente;
import com.mycompany.proyectopoo.Personal.Cobranza;
import com.mycompany.proyectopoo.Personal.Tecnico;
import com.mycompany.proyectopoo.Personal.Admin;
import com.mycompany.proyectopoo.Personal.Personal;
import java.util.ArrayList;
import java.util.Scanner;

  public class Sistema {
      
      //se crean listas en donde se guardaran los objetos de todo el sistema
    private static ArrayList<Personal> listaUsuarios = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Servicio> listaServicios = new ArrayList<>();
    private static ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    private static ArrayList<OrdenServicio> listaOrdenes = new ArrayList<>();
    private static ArrayList<ReporteInsumos> listaReportes = new ArrayList<>();
    
    

    
    public static void inicioSistema(){
      //creacion de los objetos personal
      
      listaUsuarios.add(new Admin("admin1","12345678","Administrador",Cargo.ADMIN));
      listaUsuarios.add(new Tecnico("alopez","al123456","Alvaro Lopez",Cargo.TECNICO));
      listaUsuarios.add(new Cobranza("mcastro","mc123456","Maria Castro",Cargo.COBRANZA));
      listaUsuarios.add(new Tecnico("mbarcos","mb123456","Mario Barcos",Cargo.TECNICO));
      

      //creacion de objetos cliente
      Cliente c1= new Cliente("Grupo HG S.A","0987654321","Latinoamericana y Puerto Rico",2);
      Cliente c2= new Cliente("Grupo Roldan","0963818884","Isabel y Santa Cruz",2);
      Cliente c3= new Cliente("Tini Sarmiento","0912345678","Ciudadela del Magisterio Mz 933 Villa 1",1);
      Cliente c4= new Cliente("Eliana Azansa","0908237645","Ciudadela Zaruma",1);
      listaClientes.add(c1);
      listaClientes.add(c2);
      listaClientes.add(c3);
      listaClientes.add(c4);
      
      //creacion de objetos servicio
      Servicio s1 = new Servicio(20,"Cambio Filtro Aceite");
      Servicio s2 = new Servicio(50,"Balanceo");
      Servicio s3 = new Servicio(30,"Alineación");
      Servicio s4 = new Servicio(25,"Cambio Aceite Motor");
      Servicio s5 = new Servicio(60,"Cambio de Pastillas de Freno");     
      Servicio s6 = new Servicio(10,"Limpieza de Filtro de Aire");      
              
      listaServicios.add(s1);
      listaServicios.add(s2);
      listaServicios.add(s3);
      listaServicios.add(s4);
      listaServicios.add(s5);
      listaServicios.add(s6) ; 
      
      //creacion de objetos proveedores
      listaProveedores.add(new Proveedor("Grupo Mavesa","0975312468","Juan Tancamarengo 923"));
      listaProveedores.add(new Proveedor("Repuestos Pepito","0986421357","Av. Las Americas frente al Areopuerto"));
      
      
      //creacion de objetos ordene de servicio
      String fecha1= "19/07/2022";
      ArrayList<Servicio> serviciosOrden1 = new ArrayList<>();
      serviciosOrden1.add(s1);
      serviciosOrden1.add(s5);
      
      String fecha2 = "20/03/2021";
      ArrayList<Servicio> serviciosOrden2 = new ArrayList<>();
      serviciosOrden2.add(s2);
      serviciosOrden2.add(s3);
      serviciosOrden2.add(s4);
      
      String fecha3 = "05/12/2022";
      ArrayList<Servicio> serviciosOrden3 = new ArrayList<>();
      serviciosOrden3.add(s1);
      serviciosOrden3.add(s3);
      
      String fecha4 = "06/12/2022";
      ArrayList<Servicio> serviciosOrden4 = new ArrayList<>();
      serviciosOrden4.add(s2);
      serviciosOrden4.add(s4);
      serviciosOrden4.add(s5);
      
      listaOrdenes.add(new OrdenServicio(c1,(Tecnico)listaUsuarios.get(1),fecha1.split("/"),"ABK-7441",1,serviciosOrden1));
      listaOrdenes.add(new OrdenServicio(c2,(Tecnico)listaUsuarios.get(3),fecha2.split("/"),"AGE-445",1,serviciosOrden2));
      listaOrdenes.add(new OrdenServicio(c3,(Tecnico)listaUsuarios.get(1),fecha3.split("/"),"GFH-396",3,serviciosOrden3));
      listaOrdenes.add(new OrdenServicio(c4,(Tecnico)listaUsuarios.get(3),fecha4.split("/"),"JI-3130",2,serviciosOrden4));
    }
    
    
    
    public static void logIn(){ 
      //se verifican las credenciales ingresadas para acceder al menu correspondiente
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
                    
                }
            }
            //informa que las creedenciales no son validas
      }else{
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
        listaServicios.set(indice,servCamb);
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
  }
    
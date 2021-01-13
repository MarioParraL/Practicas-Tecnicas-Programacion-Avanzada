package practica1;
import java.util.Vector; 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class main extends java.util.ListResourceBundle {
	
	Scanner sn = new Scanner(System.in);
 static ArrayList <Hotel> hoteles = new ArrayList<Hotel>();
	static ArrayList <Restaurante> restaurantes = new ArrayList<Restaurante>();
	   ArrayList <ReservaCliente> reservas = new ArrayList<ReservaCliente>();
	
	   
	public static void añadirHotel(ResourceBundle sb) {
		   Scanner sn = new Scanner(System.in);
		System.out.println(sb.getString("Seleccion"));
    	
    	String nombre;
    	System.out.println(sb.getString("NombreHotel")); 
    	nombre = sn.next();
    	
    	String direccion;
    	System.out.println(sb.getString("DireccionHotel"));
    	direccion = sn.next();
    	
    	String fax;
    	System.out.println(sb.getString("FaxHotel"));
    	fax = sn.next();
    	int telefono;
    	
    	System.out.println(sb.getString("TelefonoHotel"));
    	telefono = sn.nextInt();
    	int diaInauguracion;
    	
    	System.out.println(sb.getString("DiaI"));
    	diaInauguracion = sn.nextInt();
    	 int mesInauguracion;
    	 
    	 System.out.println(sb.getString("MesI"));
    	 mesInauguracion = sn.nextInt();
    	 int añoInauguracion;
    	 
    	 System.out.println(sb.getString("AñoI"));
    	 añoInauguracion = sn.nextInt();
    	 int numeroEstrellas;
    	 
    	 System.out.println(sb.getString("Estrellas"));
    	 numeroEstrellas = sn.nextInt();                   	
    	 int numeroHabitaciones;
    	 
    	 System.out.println(sb.getString("Habitaciones"));
    	 numeroHabitaciones = sn.nextInt();
    	 
    	 double precioPorNoche;                   	 
    	 System.out.println(sb.getString("Precio"));
    	 precioPorNoche = sn.nextFloat();
    	
    	 
        
		
	Hotel hotel2 = new Hotel(nombre, direccion, fax, telefono, diaInauguracion, mesInauguracion, añoInauguracion,
				 numeroEstrellas, numeroHabitaciones, precioPorNoche);
		hoteles.add(hotel2);
		
		hotel2.horarioAtencionCliente();
		
		
		System.out.println(sb.getString("HotelRestaurante"));
		int op;
		op = sn.nextInt();
		if(op == 1) {
			int camareros;
			System.out.println(sb.getString("Camareros"));
			camareros = sn.nextInt();
			int cocineros;
			System.out.println(sb.getString("Cocineroa"));
			cocineros = sn.nextInt();
			double precioMenu;
			System.out.println(sb.getString("PrecioMenu"));
			precioMenu = sn.nextInt();
			
			int mesas;
			System.out.println(sb.getString("Mesas"));
			mesas = sn.nextInt();
			int comensales;
			System.out.println(sb.getString("ComensalesUltimaSemana"));
			comensales = sn.nextInt();
			int aforoMaximo;
			System.out.println(sb.getString("AforoMaximo"));
			aforoMaximo = sn.nextInt();
			
			Restaurante restaurante1 = new Restaurante();
			restaurante1 = restaurante1.añadirRestaurante(nombre, direccion, fax, telefono, camareros, cocineros, precioMenu, mesas, comensales, aforoMaximo);
			restaurantes.add(restaurante1);
			
			restaurante1.horarioAtencionCliente();
			
		}else {
			
		}
		
		
	}
	
	public static void imprimeHotel(ResourceBundle sb) {
		for(int i = 0; i<hoteles.size(); i ++) {
        	System.out.println(hoteles.elementAt(i).getDatos());
        }
	}
	
	public static void imprimeRestaurante(ResourceBundle sb) {
		for(int i = 0; i<restaurantes.size(); i++) {
   		 System.out.print(restaurantes.elementAt(i).getDatos());
   	 }
	}
	
	public void reservaCliente(ResourceBundle sb) {
		String nombreCliente = null;
		System.out.println(sb.getString("NombreCliente"));
    	nombreCliente = sn.next();
    	
    	String apellidos = null;
    	System.out.println(sb.getString("ApellidosCliente"));
    	apellidos = sn.next();
    	
    	String nacionalidad = null;
    	System.out.println(sb.getString("NacionalidadCliente"));
    	nacionalidad = sn.next();
    	
    	String DNI = null;
    	System.out.println(sb.getString("DNICliente"));
    	DNI = sn.next();
    	
        int diaNacimiento;
        System.out.println(sb.getString("DiaNac"));
    	diaNacimiento = sn.nextInt();
    	
    	int mesNacimiento;
    	System.out.println(sb.getString("MesNac"));
    	mesNacimiento = sn.nextInt();
    	
    	int añoNacimiento;
    	System.out.println(sb.getString("AñoNac"));
    	añoNacimiento = sn.nextInt();
    	
    	int diasEstancia;
    	System.out.println(sb.getString("DiasEstanciaCliente"));
    	diasEstancia = sn.nextInt();
    	
    	int numeroAdultos;
    	System.out.println(sb.getString("AdultosAlojados"));
    	numeroAdultos = sn.nextInt();
    	
    	int numeroNiños;
    	System.out.println(sb.getString("NiñosAlojados"));
    	numeroNiños = sn.nextInt();
    	
    	
    	
    	
    	
    	
    	
    	
/*ReservaCliente Reserva = new ReservaCliente(nombre,  direccion,  fax,  telefono,  diaInauguracion,
   			 mesInauguracion,  añoInauguracion,
			 numeroEstrellas,  numeroHabitaciones,  precioPorNoche,
			 nombreCliente,  apellidos,  nacionalidad,  DNI,
			 diaNacimiento,  mesNacimiento,  añoNacimiento,  diasEstancia,  numeroAdultos,  numeroNiños); 

    	reservas.add(Reserva);
    	
    	
    	
    	
    	
    	Reserva.horarioAtencionCliente();*/ 	
    		}
	
	public void imprimeRerserva(ResourceBundle sb) {
		 for(int i = 0; i<reservas.size(); i++) {
       		 System.out.print(reservas.get(i).getDatos());
       	 }

	}
	
	
	
	public static void main2(ResourceBundle sb) {
		Scanner sn = new Scanner(System.in);
		
		//Clase Local Date
				LocalDate fechaHoy = LocalDate.now();
				System.out.println(sb.getString("FechaActual")); 
				System.out.println(sb.getString("Año") + fechaHoy.getYear() +
						sb.getString("Mes") + fechaHoy.getMonthValue() +
						" (" + fechaHoy.getMonth() + sb.getString("Dia") + fechaHoy.getDayOfMonth());
				
				
				
				
		   
				 
		        
		        boolean salir = false;
		        
		        int opcion=0; 
		 
		        while (opcion>=0) {
		 
		        	System.out.println(sb.getString("OP1"));
		        	System.out.println(sb.getString("OP2"));
		        	System.out.println(sb.getString("OP3"));
		        	System.out.println(sb.getString("OP4"));
		        	System.out.println(sb.getString("OP5"));
		        	System.out.println(sb.getString("OP6"));
		        
		 
		            
		 
		        	System.out.println(sb.getString("Indica0"));
		                opcion = sn.nextInt();
		 
		                switch (opcion) {
		                case 1: 
		                	
		                	añadirHotel(sb);
				        	System.out.println(sb.getString("Indica1"));
				                opcion = sn.nextInt();
				                break;
		                case 2:
		                	imprimeHotel(sb);
				        	System.out.println(sb.getString("Indica2"));
				                opcion = sn.nextInt();
				                break;
		                case 3:
		                	imprimeRestaurante(sb);
				        	System.out.println(sb.getString("Indica3"));
				                opcion = sn.nextInt();
		                    	break;
		                    case 6:
		                        salir = true;
		                        break;
		                    default:
		                    	
		                    	System.out.println(sb.getString("Indica4"));
		                }
		           
		            }
		        }
		 
		    
		
	
	
	
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		main Programa = new main();
		
		int op = 0;
        ResourceBundle sb = null;
        System.out.println("Elige un idioma(1. Español)  (2.Ingles)");
        op = sn.nextInt();
        if(op==1) {
            sb = ResourceBundle.getBundle("Etiquetas.Etiquetas_es_ES");

        }else {
            sb = ResourceBundle .getBundle("Etiquetas.Etiquetas_en_EN");
        }
       
        main.main2(sb);
       
                    	
                    	
                    	
 
}





	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return null;
	}
}

package practica1;
import java.util.Vector; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		//Clase Local Date
		LocalDate fechaHoy = LocalDate.now();
		System.out.println("La fecha de hoy es " + fechaHoy); 
		System.out.println("El año es " + fechaHoy.getYear() +
				", el mes " + fechaHoy.getMonthValue() +
				" (" + fechaHoy.getMonth() + ") y el día " + fechaHoy.getDayOfMonth());
		
		//Almacenamos hoteles y restaurantes en los vectores
		
		
   Vector <Hotel> hoteles = new Vector<Hotel>();
   Vector <Restaurante> restaurantes = new Vector<Restaurante>();
   Vector <ReservaCliente> reservas = new Vector<ReservaCliente>();
		 
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        
        int opcion; 
 
        while (!salir) {
 
            System.out.println("1. Opcion 1: Añadir un hotel y restaurante");
            System.out.println("2. Opcion 2: Muestra los hoteles por pantalla");
            System.out.println("3. Opcion 3: Imprime un restaurante");
            System.out.println("4. Opcion 4: Añadir reserva de cliente ");
            System.out.println("5. Opcion 5: Imprime Reservas ");
            System.out.println("6. Opcion 6: Salir ");
        
 
            try {
 
                System.out.println("Indica una de las opciones: 1,2,3,4 o 5");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	 System.out.println("Has seleccionado la opcion 1: añadir un hotel y/o restaurante");
                    	
                    	String nombre;
                    	System.out.println("Dime el nombre del hotel");
                    	nombre = sn.next();
                    	
                    	String direccion;
                    	System.out.println("Dime la direccion del hotel");
                    	direccion = sn.next();
                    	
                    	String fax;
                    	System.out.println("Dime el fax del hotel");
                    	fax = sn.next();
                    	int telefono;
                    	
                    	System.out.println("Dime el teléfono del hotel");
                    	telefono = sn.nextInt();
                    	int diaInauguracion;
                    	
                    	System.out.println("Dime el dia de inauguracion del hotel");
                    	diaInauguracion = sn.nextInt();
                    	 int mesInauguracion;
                    	 
                    	 System.out.println("Dime el mes de inauguracion del hotel");
                    	 mesInauguracion = sn.nextInt();
                    	 int añoInauguracion;
                    	 
                    	 System.out.println("Dime el año de inauguracion del hotel");
                    	 añoInauguracion = sn.nextInt();
                    	 int numeroEstrellas;
                    	 
                    	 System.out.println("Dime el nº de estrellas del hotel");
                    	 numeroEstrellas = sn.nextInt();                   	
                    	 int numeroHabitaciones;
                    	 
                    	 System.out.println("Dime el nº de habitaciones del hotel");
                    	 numeroHabitaciones = sn.nextInt();
                    	 
                    	 double precioPorNoche;                   	 
                    	 System.out.println("Dime el precio por noche del hotel");
                    	 precioPorNoche = sn.nextFloat();
                    	
                    	 
                        
                		Hotel hotel2 = new Hotel();
                		hotel2 = hotel2.añadirHotel(nombre, direccion, fax, telefono, diaInauguracion, mesInauguracion, añoInauguracion,
               				 numeroEstrellas, numeroHabitaciones, precioPorNoche);
                		hoteles.add(hotel2);
                		
                		hotel2.horarioAtencionCliente();
                		
                		
                		System.out.println("¿El hotel tiene restaurante? 1:SI. 2:NO");
                		int op;
                		op = sn.nextInt();
                		if(op == 1) {
                			int camareros;
                			System.out.println("Dime el nº de camareros del restaurante");
                			camareros = sn.nextInt();
                			int cocineros;
                			System.out.println("Dime el nº de cocioneros del restaurante");
                			cocineros = sn.nextInt();
                			double precioMenu;
                			System.out.println("Dime el precio del menu ");
                			precioMenu = sn.nextInt();
                			
                			int mesas;
                			System.out.println("Dime el nº de mesas ");
                			mesas = sn.nextInt();
                			int comensales;
                			System.out.println("Dime el nº de comensales  del restaurante de la ultima semana");
                			comensales = sn.nextInt();
                			int aforoMaximo;
                			System.out.println("Dime el nº de aforo maximo ");
                			aforoMaximo = sn.nextInt();
                			
                			Restaurante restaurante1 = new Restaurante();
                			restaurante1 = restaurante1.añadirRestaurante(nombre, direccion, fax, telefono, camareros, cocineros, precioMenu, mesas, comensales, aforoMaximo);
                			restaurantes.add(restaurante1);
                			
                			restaurante1.horarioAtencionCliente();
                			
                		}else {
                			
                		}
                		
                		
                        
                        break;
                   
                    
                    case 2:
                        System.out.println("Has seleccionado la opcion 2: imprimir hoteles");
                        for(int i = 0; i<hoteles.size(); i ++) {
                        	System.out.println(hoteles.elementAt(i).getDatos());
                        }
                        break;
                    
                    
                    
                    
                    case 3:
                    	 System.out.println("Has seleccionado la opcion 3: Imprimir Restaurantes");
                    	 
                    	 for(int i = 0; i<restaurantes.size(); i++) {
                    		 System.out.print(restaurantes.elementAt(i).getDatos());
                    	 }
                    	 
                    	 break;
                       
                    	 
                    	 
                        
                    case 4:
                        
                    	
                    	String nombreCliente = null;
                    	System.out.println("Dime el nombre del cliente");
                    	nombre = sn.next();
                    	
                    	String apellidos = null;
                    	System.out.println("Dime los apellidos del cliente");
                    	nombre = sn.next();
                    	
                    	String nacionalidad = null;
                    	System.out.println("Dime la nacionalidad del cliente");
                    	nombre = sn.next();
                    	
                    	String DNI = null;
                    	System.out.println("Dime el dni del cliente");
                    	nombre = sn.next();
                    	
                        int diaNacimiento;
                    	System.out.println("Dime el dia de nacimiento del cliente");
                    	diaNacimiento = sn.nextInt();
                    	
                    	int mesNacimiento;
                    	System.out.println("Dime el mes de nacimiento del cliente");
                    	mesNacimiento = sn.nextInt();
                    	
                    	int añoNacimiento;
                    	System.out.println("Dime el año de nacimiento del cliente");
                    	añoNacimiento = sn.nextInt();
                    	
                    	int diasEstancia;
                    	System.out.println("Dime los dias de estancia del cliente");
                    	diasEstancia = sn.nextInt();
                    	
                    	int numeroAdultos;
                    	System.out.println("Dime el numero de adultos alojados");
                    	numeroAdultos = sn.nextInt();
                    	
                    	int numeroNiños;
                    	System.out.println("Dime el numero de niños alojaoda");
                    	numeroNiños = sn.nextInt();
                    	
                    	
                    	
                    	
                    	
                    	
                    	
                    	
                    	ReservaCliente Reserva1 = new ReservaCliente();
                    	
                    	//Error al añadir reserva (?)
                    	
                    	/*Reserva1 =  Reserva1.añadirReservaCliente(nombre,  direccion,  fax,  telefono,  diaInauguracion,
                   			 mesInauguracion,  añoInauguracion,
                			 numeroEstrellas,  numeroHabitaciones,  precioPorNoche,
                			 nombreCliente,  apellidos,  nacionalidad,  DNI,
                			 diaNacimiento,  mesNacimiento,  añoNacimiento,  diasEstancia,  numeroAdultos,  numeroNiños); */
                    	reservas.add(Reserva1);
                    	
                    	Reserva1.horarioAtencionCliente(); 
                    	
                        break;
                   
                    case 5:
                    	
                    	System.out.println("Has seleccionado la opcion 3: Imprimir Rservas");
                   	 
                   	 for(int i = 0; i<reservas.size(); i++) {
                   		 System.out.print(reservas.elementAt(i).getDatos());
                   	 }
                    	break;
                        
                        
                    	
                    case 6:
                        salir = true;
                        break;
                    default:
                    	
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
 
}

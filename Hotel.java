package practica1;

import java.util.Vector; 
import java.util.Calendar;

public class Hotel {
	
	private String nombre;
	private String direccion;
	private String fax;
	private int telefono;
	private int diaInauguracion;
	private int mesInauguracion;
	private int añoInauguracion;
	private int numeroEstrellas;
	private int numeroHabitaciones;
	private double precioPorNoche;
	
	
	// El constructor de la clase Hotel está sobrecargado.
	
	public Hotel(String nombre, String direccion, String fax,
			int telefono, int diaInauguracion, int mesInauguracion, int añoInauguracion,
			int numeroEstrellas, int numeroHabitaciones, double precioPorNoche) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.fax = fax;
		this.telefono = telefono;
		this.diaInauguracion = diaInauguracion;
		this.mesInauguracion = mesInauguracion;
		this.añoInauguracion = añoInauguracion;
		this.numeroEstrellas = numeroEstrellas;
		this.numeroHabitaciones = numeroHabitaciones;
		this.precioPorNoche = precioPorNoche;
		
	}
	
	public Hotel(String nombre, String direccion, String fax, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.fax = fax;
		this.telefono = telefono;
	}
	
	public Hotel() { // Constructor no inicializado.
		
	}
	
	
	
	// Métodos Getter and Setter.

	public String getNombre() {
		return nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public int getNumeroEstrellas() {
		return numeroEstrellas;
	}
	
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	

	public int getDiaInauguracion() {
		return this.diaInauguracion;
	}

	
	public int getMesInauguracion() {
		return this.mesInauguracion;
	}

	

	public int getAñoInauguracion() {
		return this.añoInauguracion;
	}

	

	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}

	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}

	public double getPrecioPorNoche() {
		double factor = 0.015 + (this.getAñoInauguracion() >= 2018 ? 0.01 : 0.0); //Se pagará un suplemento por los hoteles mas nuevos.
		return this.precioPorNoche * factor;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}
	
	
	
	//Este método calcula los años que lleva dando servicio el hotel
	
	public static int calculaAntiguedad(int diaInauguracion,
            int mesInauguracion,
            int añoInauguracion) {
		
int diaHoy, mesHoy, añoHoy, antiguedad;

diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH); 
mesHoy = Calendar.getInstance().get(Calendar.MONTH) + 1; 
añoHoy = Calendar.getInstance().get(Calendar.YEAR);

if ((mesHoy > mesInauguracion) ||
((mesHoy == mesInauguracion) && (diaHoy >= diaInauguracion))) 
antiguedad = añoHoy - añoInauguracion;
else
antiguedad = añoHoy - añoInauguracion - 1;
System.out.println(antiguedad);
return antiguedad;

}
	
	public int getAntiguedad() {
		return calculaAntiguedad(this.diaInauguracion,
				this.mesInauguracion, this.añoInauguracion);
		}
	
	
	
	
	public static double calculaPrecioDeportista(double precioPorNoche) {
		
		return Math.round(precioPorNoche / 2 + 10);
				
	}
	
	public double getCalculaPrecioDeportista() {
		return calculaPrecioDeportista(this.precioPorNoche);
	}
	
	
	
	
	public void horarioAtencionCliente() {
		System.out.print("El horario del atencion al cliente del hotel  es L-D de 6:00 a 00:30");
	}
	
	
	
	public String getDatos() {
		return  " El nombre del hotel es: " + this.nombre + " \n La direccion es:  " + this.direccion +
				" \n El fax es: " + this.fax + " \n El telefono es: " + 
	this.telefono + "\n El hotel lleva desde su apertura "  +  this.getAntiguedad() + " años " + "\n Este hotel tiene "
				+ this.numeroEstrellas + " Estrellas(*) " + " \n Cuenta con " +
				this.numeroHabitaciones + " habitaciones " + " \n El precio por noches es de " + this.precioPorNoche +
				"€ " + "\n El precio por noche para una persona con discapacidad es de: " +
				this.getCalculaPrecioDeportista() + "€ ";
	}
		
	
	
	
	public Hotel añadirHotel(String nombre, String direccion, String fax, int telefono, int diaInauguracion, int mesInauguracion,
			int añoInauguracion, int numeroEstrellas, int numeroHabitaciones, double precioNoche) {
		
		
		Hotel hotel2 = new Hotel(nombre, direccion, fax, telefono, diaInauguracion, mesInauguracion, añoInauguracion,
				 numeroEstrellas, numeroHabitaciones, precioNoche);
		return hotel2;
		

		
	}
	
	
	
	
	
	
	

	
	
	
	
	

}

package practica1;

import java.util.Calendar;

public class ReservaCliente extends Hotel{

	private String nombreCliente;
	private String apellidos;
	private String nacionalidad;
	private String DNI;
	private int diaNacimiento;
	private int mesNacimiento;
	private int añoNacimiento;
	private int diasEstancia;
	private int numeroAdultos;
	private int numeroNiños;
	
	  
	public ReservaCliente(String nombre, String direccion, String fax, int telefono, int diaInauguracion,
			int mesInauguracion, int añoInauguracion,
			int numeroEstrellas, int numeroHabitaciones, float precioPorNoche,
			String nombreCliente, String apellidos, String nacionalidad, String DNI,
			int diaNacimiento, int mesNacimiento, int añoNacimiento, int diasEstancia, int numeroAdultos, int numeroNiños) {
		
		super(nombre, direccion, fax, telefono, diaInauguracion, mesInauguracion,
				añoInauguracion, numeroEstrellas, numeroHabitaciones, precioPorNoche);
		
		this.nombreCliente = nombreCliente;
		this.apellidos = apellidos;
		this.nacionalidad = nacionalidad;
		this.DNI = DNI;
		this.diaNacimiento = diaNacimiento;
		this.mesNacimiento = mesNacimiento;
		this.añoNacimiento = añoNacimiento;
		this.diasEstancia = diasEstancia;
		this.numeroAdultos = numeroAdultos;
		this.numeroNiños = numeroNiños;
		
				
	}
	
	
	//Métodos Getter and Setter
	
	public String getNombreCliente() {
		return nombreCliente;
	}


	public String getApellidos() {
		return apellidos;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	
	
	
	
	public String getDNI() {
		return this.DNI;
	}



	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	

	public int getDiaNacimiento() {
		return this.diaNacimiento;
	}


	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}


	public int getMesNacimiento() {
		return this.mesNacimiento;
	}


	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}


	public int getAñoNacimiento() {
		return this.añoNacimiento;
	}


	public void setAñoNacimiento(int añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}


	public int getDiasEstancia() {
		return this.diasEstancia;
	}


	public void setDiasEstancia(int diasEstancia) {
		this.diasEstancia = diasEstancia;
	}



	public int getNumeroAdultos() {
		return this.numeroAdultos;
	}



	public void setNumeroAdultos(int numeroAdultos) {
		this.numeroAdultos = numeroAdultos;
	}


	public int getNumeroNiños() {
		return this.numeroNiños;
	}

	
	
	
	public void setNumeroNiños(int numeroNiños) {
		this.numeroNiños = numeroNiños;
	}

	
	public int getEdad() {
		return calculaEdad(this.diaNacimiento,
				this.mesNacimiento, this.añoNacimiento);
		}
	
	
	
	
	
	public int calculaEdad() {
		return calculaAntiguedad(this.diaNacimiento,
				this.mesNacimiento, this.añoNacimiento);
		}
	
	
	public static int calculaEdad(int diaNacimiento,
            int mesNacimiento,
            int añoNacimiento) {
int diaHoy, mesHoy, añoHoy, edad;
diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH); 
mesHoy = Calendar.getInstance().get(Calendar.MONTH) + 1; 
añoHoy = Calendar.getInstance().get(Calendar.YEAR);

if ((mesHoy > mesNacimiento) ||
((mesHoy == mesNacimiento) && (diaHoy >= diaNacimiento))) 
edad = añoHoy - añoNacimiento;
else
edad = añoHoy - añoNacimiento - 1;
return edad;

}
	
	public String getDatos() {
		return  " El nombre del cliente es: " + this.nombreCliente + " \n Los apellidos son:  " + this.apellidos +
				"la nacionalidad es: " + this.nacionalidad + " el dni es : " + this.DNI + " el dia de nacimiento es : " + 
				this.diaNacimiento + " el mes de nacimiento es: " + this.mesNacimiento + " el año de nacimiento es: " +
				this.añoNacimiento + " los dias de estancia que ha alquilado son" + this.diasEstancia + " el numero de niños es: " + 
				this.numeroNiños + " los adultos es/son: " + this.numeroAdultos;
	}

	
	

}
	
	
	
	
	
	
	




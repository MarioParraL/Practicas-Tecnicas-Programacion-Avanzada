package practica1;

public class Restaurante extends Hotel{
	
	

	private int camareros;
	private int cocineros;
	private double precioMenu;
	private int mesas;
	private int comensales;
	private int aforoMaximo;
	
	
	
	public Restaurante(String nombre, String direccion, String fax, int telefono, int camareros,
			int cocineros, double precioMenu, int mesas, int comensales, int aforoMaximo) {
		
		super(nombre, direccion, fax, telefono);
		
		this.camareros = camareros;
		this.cocineros = cocineros;
		this.precioMenu = precioMenu;
		this.mesas = mesas;
		this.comensales = comensales;
		this.aforoMaximo = aforoMaximo;
		

	}
	
	public Restaurante() { //Constructor no inicializado
		
	}
	
	
	// Métodos get y set.

	public int getCamareros() {
		return this.camareros;
	}

	public void setCamareros(int camareros) {
		this.camareros = camareros;
	}

	public int getCocineros() {
		return this.cocineros;
	}

	public void setCocineros(int cocineros) {
		this.cocineros = cocineros;
	}

	public double getPrecioMenu() {
		return this.precioMenu;
	}

	public void setPrecioMenu(double precioMenu) {
		this.precioMenu = precioMenu;
	}

	public int getMesas() {
		return this.mesas;
	}

	public void setMesas(int mesas) {
		this.mesas = mesas;
	}
	
	

	public int getComensales() {
		return this.comensales;
	}


	public void setComensales(int comensales) {
		this.comensales = comensales;
	}


	public int getAforoMaximo() {
		return this.aforoMaximo;
	}

	public void setAforoMaximo(int aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}
	

public double getCuenta() {
	return calculaCuenta(this.comensales, this.precioMenu);
}

public static double calculaCuenta(int comensales, double precioMenu) {
	
	return comensales * precioMenu;
	
}



public String getDatos() {
	return  "El nombre del hotel al que pertenece el restaurante es: " + super.getNombre() +
			" La direccion es: " + super.getDireccion() + " El Fax es: " + this.getFax() + " El numero de telefono del hotel es: " + 
this.getTelefono() + " "  + " El nº de camareros que trabajan en el restaurante es de  " + this.camareros +
" El nº de cocineros que trabajan en el restaurante es de :  " + this.cocineros + " El precio por persona del menu es de " +
this.precioMenu + "€ " + " El numero de mesas totales es de " +
			this.mesas + "La última semana hubo un total de  " + this.comensales + "comensales " +
"Donde los comensales gastaron un total de " + getCuenta() + "€" + " El aforo máximo de restaunrate se compone de " +
			this.aforoMaximo + " personas ";
}




public Restaurante añadirRestaurante(String nombre, String direccion,
		String fax, int telefono, int camareros, int cocineros, double precioMenu, int mesas, int comensales, int aforoMaximo) {
	
	System.out.println(super.getDatos());
	Restaurante restaurante1 = new Restaurante(nombre, direccion, fax, telefono, camareros, cocineros, precioMenu, mesas, comensales, aforoMaximo);
	return restaurante1;
}












}
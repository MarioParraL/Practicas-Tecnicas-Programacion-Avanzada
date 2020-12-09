package practica1;

import java.util.ResourceBundle;

public class Tipos<G> implements InterfaceTipos<G>{
	private String nombre;
	private int numero;
	private G Añoinauguracion;
	
	public Tipos(String nombre, int numero, G AñoInauguracion) {
		this.nombre = nombre;
		this.numero = numero;
		this.Añoinauguracion = AñoInauguracion;
	}


	public String getNombre() {
		
		return this.nombre;
	}

	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	
	public int getNumero() {
		
		return this.numero;
	}

	
	public void setNumero(int numero) {
		
		this.numero = numero;
	}

	
	public G getAñoInuguracion() {
		
		return this.Añoinauguracion;
	}


	public void setAñoInauguracion(G AñoInauguracion) {
		
		this.Añoinauguracion= AñoInauguracion;
	}

}

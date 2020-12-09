package practica1;

 import java.util.ResourceBundle;
public class Habitacion<G> extends Tipos<G> implements Comparable<Habitacion> {

	
	
	public Habitacion(String nombre, int numero, G AñoInauguracion) {
		super(nombre, numero, AñoInauguracion);
		
	}
	
	public void printHabitacion(ResourceBundle h) {
		System.out.print(h.getString("NombreHabitacion")+ getNombre());
		System.out.print(h.getString("NumeroHabitacion")+ getNumero());
		System.out.print(h.getString("AñoInauguracion")+ getAñoInuguracion());
		
	}
	


	public int compareTo(Habitacion o) {
		
		return 0;
	}

}

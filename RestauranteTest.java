package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practica1.Restaurante;

class RestauranteTest {

	
	Restaurante mirestaurante = new Restaurante("Hola", "Madrid", "12345678", 917777777, 5, 5, 10.50, 20, 50, 90);
	
	@Test
	void test() {
		
		assertEquals(mirestaurante.getNombre(), "Hola");
		assertEquals(mirestaurante.getAntiguedad(), 5);
	}

}

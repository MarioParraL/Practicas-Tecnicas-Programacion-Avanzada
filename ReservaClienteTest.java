package Tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;



import practica1.ReservaCliente;

class ReservaClienteTest {

	ReservaCliente miReserva = new ReservaCliente("VillaMadrid", "Atocha", "12345678", 917777777, 
			15, 6, 2000, 5, 50, 90, "Mario", "Parra,Lopez", "Española", "11111111A", 30, 6, 2000, 3, 2, 2);
	
	
	@Test
	void test() {
		assertEquals(miReserva.getNombreCliente(), "Mario");
		assertEquals(miReserva.getDNI(), "11111111A");
	}

}

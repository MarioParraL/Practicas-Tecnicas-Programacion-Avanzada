package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practica1.Hotel;



class HotelTest {

	
	Hotel miHotel = new Hotel("VillaMadrid", "Atocha", "12345678", 917777777, 15, 6, 2000, 5, 50, 90);
	
	
	@Test
	void test() {
		assertEquals(miHotel.getNombre(), "VillaMadrid");
		assertEquals(miHotel.getAntiguedad(), 100);
	}

}

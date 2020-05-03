package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoHoresExtraTest {
	
	private HorasExtra ingreso1;
	private HorasExtra ingreso2;

	@BeforeEach
	void setUp(){
		ingreso1 = new HorasExtra("Enero", "Pago", 100);
		ingreso2 = new HorasExtra("Febrero", 100);	
	}

	@Test
	void testMontoImponible() {
		assertEquals(0, ingreso1.getMontoImponible());
		assertEquals(0, ingreso2.getMontoImponible());
	}

}

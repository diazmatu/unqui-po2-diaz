package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private Ingreso ingreso3;

	@BeforeEach
	public void setUp(){
		ingreso1 = new Ingreso("Enero", "Pago", 100);
		ingreso2 = new Ingreso("Febrero", 100);	
		ingreso3 = new Ingreso("Marzo", "Pago doble", 200);	
	}

	@Test
	public void testConstructor() {
		assertEquals("Enero", ingreso1.getMes());
		assertEquals("Pago", ingreso1.getConcepto());
		assertEquals(100, ingreso1.getMonto());
		
		assertEquals("Febrero", ingreso2.getMes());
		assertEquals("", ingreso2.getConcepto());
		assertEquals(100, ingreso2.getMonto());
		
		assertEquals("Marzo", ingreso3.getMes());
		assertEquals("Pago doble", ingreso3.getConcepto());
		assertEquals(200, ingreso3.getMonto());
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(100, ingreso1.getMontoImponible());
		assertEquals(100, ingreso2.getMontoImponible());
		assertEquals(200, ingreso3.getMontoImponible());
	}
	
}

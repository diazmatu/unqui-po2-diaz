package ar.edu.unq.po2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {
	
	private Tradicional arroz;
	private Cooperativa vino;
	
	@BeforeEach
	public void setUp() {
		arroz = new Tradicional("Arroz", 18.9f, 100);
		vino = new Cooperativa("Vino", 50, 75);
	}
	
	@Test
	public void testConstructor() {
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9f, arroz.getPrecio());
		assertEquals(99, arroz.getStock());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(45, vino.getPrecio());
		assertEquals(74, vino.getStock());
	}
	
	@Test
	public void testAumentarPrecio() {
		arroz.aumentarPrecio(1.5f);
		assertEquals(20.4f, arroz.getPrecio());
	}
}

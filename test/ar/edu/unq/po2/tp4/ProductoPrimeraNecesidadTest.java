package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 10f, false, 20);
		arroz = new ProductoPrimeraNecesidad("Arroz", 40f, 15.5f);
	}
	
	@Test
	public void testCalcularPrecioArroz() {
		assertEquals(33.8d, arroz.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioLeche() {
		assertEquals(8d, leche.getPrecio());
	}
}

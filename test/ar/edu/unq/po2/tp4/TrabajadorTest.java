package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	private Trabajador trabajador;
	private Ingreso ingreso1;
	private HorasExtra ingreso2;
	private Ingreso ingreso3;

	@BeforeEach
	void setUp(){
		trabajador = new Trabajador();
		ingreso1 = new Ingreso("Enero", "Pago", 100);
		ingreso2 = new HorasExtra("Febrero", 100);	
		ingreso3 = new Ingreso("Marzo", "Pago doble", 200);	
	}

	@Test
	void testAgregarIngreso() {
		assertEquals(0, trabajador.getIngresos().size());
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingreso3);
		assertEquals(3, trabajador.getIngresos().size());
	}

	@Test
	void testGetTotalPrecibido() {
		assertEquals(0, trabajador.getTotalPercibido());
		trabajador.agregarIngreso(ingreso1);
		assertEquals(100, trabajador.getTotalPercibido());
		trabajador.agregarIngreso(ingreso2);
		assertEquals(200, trabajador.getTotalPercibido());
		trabajador.agregarIngreso(ingreso3);
		assertEquals(400, trabajador.getTotalPercibido());
	}
	
	@Test
	void testGetMontoImponible() {
		assertEquals(0, trabajador.getMontoImponible());
		trabajador.agregarIngreso(ingreso1);
		assertEquals(100, trabajador.getMontoImponible());
		trabajador.agregarIngreso(ingreso2);
		assertEquals(100, trabajador.getMontoImponible());
		trabajador.agregarIngreso(ingreso3);
		assertEquals(300, trabajador.getMontoImponible());
	}
	
	@Test
	void testGetImpuestoAPagar() {
		assertEquals(0, trabajador.getImpuestoAPagar());
		trabajador.agregarIngreso(ingreso1);
		assertEquals(2, trabajador.getImpuestoAPagar());
		trabajador.agregarIngreso(ingreso2);
		assertEquals(2, trabajador.getImpuestoAPagar());
		trabajador.agregarIngreso(ingreso3);
		assertEquals(6, trabajador.getImpuestoAPagar());
	}
}

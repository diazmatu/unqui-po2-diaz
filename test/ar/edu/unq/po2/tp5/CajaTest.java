package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;


class CajaTest {
	
	private Caja caja1;
	private Caja caja2;
	private ArrayList<ElementoCobrable> lista;
	private Cooperativa arroz;
	private Tradicional vino;

	@BeforeEach
	void setUp(){
		caja1 = new Caja();
		lista = new ArrayList<ElementoCobrable>();
		caja1 = new Caja(lista);
		arroz = new Cooperativa("Arroz", 10, 100);
		vino = new Tradicional("Vino", 50, 100);
	}

	@Test
	void testConstructor() {
		ArrayList<ElementoCobrable> empty = new ArrayList<ElementoCobrable>();
		assertEquals(empty, caja1.getLista());
		assertEquals(0, caja1.getCuentaTotal());
		
		assertEquals(lista, caja1.getLista());
	}
	
	@Test
	void testRegitrarProducto() {
		lista.add(arroz);
		caja1.registrarProducto(arroz);
		assertEquals(arroz.getPrecio(), caja1.getCuentaTotal(), 10);
		assertEquals(lista, caja1.getLista());
	}
	
	@Test
	void testRegitrarProductos() {
		ArrayList<ElementoCobrable> lista2 = new ArrayList<ElementoCobrable>();
		lista2.add(arroz);
		lista2.add(vino);
		float precioTotal = vino.getPrecio()+arroz.getPrecio();
		caja2.registrarProductos(lista2);
		assertEquals(lista2, caja2.getLista());
		assertEquals(precioTotal, caja1.getCuentaTotal(), 55);
	}
}

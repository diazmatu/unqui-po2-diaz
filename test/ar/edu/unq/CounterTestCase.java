package ar.edu.unq;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	private Counter counter;
	private ArrayList<Integer> list;	
	
	@BeforeEach
	public void setUp() throws Exception {
		counter=new Counter();
		list= new ArrayList<Integer>();
		
		counter.addNumber(4);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(6);
		counter.addNumber(1);
		counter.addNumber(8);
		counter.addNumber(1);
		counter.addNumber(1);
		
		
	}

	@Test
	public void testConstructor() {
		counter= new Counter();
		ArrayList<Integer> emptyList = new ArrayList<Integer>();
		assertEquals(emptyList,counter.getList());
	}
	
	@Test
	public void testAddNumber( ) {
		counter= new Counter();
		list = new ArrayList<Integer>();
		list.add(1);
		counter.addNumber(1);
		assertEquals(list,counter.getList());		
	}
	
	@Test
	public void testNumerosImpares() {
		int amount = counter.getOcurrenciasImpares();
		assertEquals(6, amount);
	}

	@Test
	public void testNumerosPares() {
		int amount = counter.getOcurrenciasPares();
		assertEquals(3, amount);
	}

	@Test
	public void testMultiplosNum() {
		int amount = counter.getMultiplosDe(4);
		assertEquals(2, amount);
	}
}

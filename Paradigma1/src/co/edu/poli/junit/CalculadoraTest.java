package co.edu.poli.junit;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {//version 3
	
	private Calculadora calc; 
	
	public CalculadoraTest() {
		//calc = new Calculadora();
	}
	
	public void setUp() {
		calc = new Calculadora();
		System.out.println("SetUp del Objeto calculadora");
	}
	
	public void testSuma() {
		assertEquals("La suma es incorrecta",12,calc.suma(3, 9));
	}
	
	public void testResta() {
		assertEquals("La resta NO está bien",-7,calc.suma(3, 9));
	}
	
	public void testAc() {
		calc.ac();
		assertEquals("AC debería estar en 0",0,calc.getAns());
	}
	
}

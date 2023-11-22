package co.edu.poli.junit;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {
	
	private Calculadora calc;
	
	public void setUp() {
		calc = new Calculadora();
		System.out.println("SetUp");
	}
	
	public void testSuma() {
		assertEquals("La suma no es correcta, parce",13,calc.suma(7, 8));
	}
	
	public void testResta() {
		assertEquals("La resta es chimba, loco",-1,calc.resta(7, 8));
	}
	
	public void testAc() {
		calc.ac();
		assertEquals("AC NO es cero!!",11,calc.getAns());
	}

}

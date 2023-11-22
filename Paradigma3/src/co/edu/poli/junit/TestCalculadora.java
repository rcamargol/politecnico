package co.edu.poli.junit;

import junit.framework.TestCase;

public class TestCalculadora extends TestCase {

	private Calculadora calc;
	
	public void setUp() {
		calc = new Calculadora();
		System.out.println("Setup para prueba");
	}
	
	public void testSuma() {
		assertEquals("Los valores de suma no son iguales",14,calc.suma(7, 7));
	}
	
	public void testResta() {
		assertEquals("Los valores de RESTA no son iguales",0,calc.resta(7, 7));
	}
	
	public void testAC() {
		calc.ac();
		assertEquals("AC no se pueso en 0",0,calc.getAns());
	}

}

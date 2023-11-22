package co.edu.poli.junit;

public class Calculadora {

	private static int ans;
	
	public Calculadora() {
		ans = 0;
	}
	
	public int suma(int a, int b) {
		ans = a+b;
		return ans;
	}
	
	public int resta(int a, int b) {
		ans = a-b;
		return ans;
	}
	
	public void ac() {
		ans = 0;
	}
	
	public double multiplicacion(int a, int b) {
		ans = a*b;  
		return ans;
	}

	public static int getAns() {
		return ans;
	}

	public static void setAns(int ans) {
		Calculadora.ans = ans;
	}
	
	
}
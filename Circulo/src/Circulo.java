import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radio;
		radio = pedirRadio();
		calcularArea2(radio);
		calcularPerimetro2(radio);
	}
	
	static double pedirRadio() {
		double ra;
		Scanner entrada = new Scanner(System.in);
		System.out.println("(*) Digite el radio:");
		ra = entrada.nextDouble();
		return ra;
	}

	static void calcularArea2(double r) {
		double ar;
		ar = Math.PI * r * r;
		System.out.println("(*) El area es:"+ar);
	}
	
	static void calcularPerimetro2(double r) {
		double pe;
		pe = Math.PI * 2 * r;
		System.out.println("(*) El perimetro es:"+pe);
	}
	
	static void elevarRadioalcuadrado(double r) {
		double cuad;
		cuad = r * r;
		System.out.println("El cuadrado es:"+cuad);
	}
}

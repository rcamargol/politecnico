import java.util.Scanner;

public class Principal {
	
	private static Circulo circulo;
	private static Cuadrado cuadrado;
	private static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circulo = new Circulo(5);
		cuadrado = new Cuadrado(5);
		entrada = new Scanner(System.in);
		
		System.out.println("Digite Area Circulo:");
		circulo.setRadio(entrada.nextDouble());
		
		circulo.calcularArea();
		circulo.calcularPerimetro();
		System.out.println("El area del circulo es:"+circulo.getAreaCirculo());
		System.out.println("El perimetro del circulo es:"+circulo.getPeriCirculo());
		
		//encapsulamento total
		cuadrado.pedirLado();
		cuadrado.calcularArea();
		cuadrado.calcularPerimetro();
		cuadrado.imprimirResultados();
		
		
	}
	
	public Cuadrado hacerAlgo(Circulo c) {
		return null;
	}

}

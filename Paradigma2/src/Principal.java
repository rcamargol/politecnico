import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo = new Circulo(5);
		Cuadrado cuadrado = new Cuadrado(5);
		Scanner entrada = new Scanner(System.in);
		
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

}

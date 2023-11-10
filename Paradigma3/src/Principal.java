import java.util.Scanner;

public class Principal {
	
	private static Circulo circulo = new Circulo(); //definición de objeto.
	private static Cuadrado cuadrado = new Cuadrado();//definición de objeto.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		circulo.pedirRadio();
		circulo.calcularArea();
		circulo.calcularPerimetro();
		circulo.mostrarResultados();
		
		cuadrado.pedirLado();
		cuadrado.calcularArea();
		cuadrado.calcularPerimetro();
		cuadrado.imprimirResultados();
	}
	
	public Cuadrado hacerAlgo(Circulo circulo) {
		return null;
	}

}


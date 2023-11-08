import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Circulo circulo = new Circulo(); //definición de objeto.
		circulo.pedirRadio();
		circulo.calcularArea();
		circulo.calcularPerimetro();
		circulo.mostrarResultados();
		
		Cuadrado cuadrado = new Cuadrado();//definición de objeto.
		cuadrado.pedirLado();
		cuadrado.calcularArea();
		cuadrado.calcularPerimetro();
		cuadrado.imprimirResultados();
	}

}


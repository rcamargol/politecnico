import java.util.Scanner;

public class Estructurada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double lado=0, radio=0;
		
		double areaCirculo=0,areaCuadrado=0;
		double periCirculo=0,periCuadrado=0;
		System.out.println("Digita Lado del cuadrado:");
		lado = entrada.nextDouble();
		System.out.println("Digita Radio del círculo:");
		radio = entrada.nextDouble();
		
		areaCirculo = Math.PI * radio * radio;
		periCirculo = Math.PI * 2 * radio;
		areaCuadrado = lado * lado;
		periCuadrado = 4 * lado;
		
		System.out.println("El area del circulo es:"+areaCirculo);
		System.out.println("El perimetro del circulo es: "+periCirculo);
		System.out.println("El area del cuadrado es:"+areaCuadrado);
		System.out.println("El perimetro del cuadraro es: "+periCuadrado);
	}
}

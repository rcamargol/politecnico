import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// Este es un comentario sobre mi primer programa
		int edad = 45;
		double salario, iva, total;
		salario = 1310000;
		int numero;	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite un numero:");

		numero = entrada.nextInt();
		numero = numero + 15;

		iva = salario * 0.19;
		total = salario + iva;
		System.out.println("El valor de iva es:" + iva);
		System.out.println("El valor Total es:" + total);
		System.out.println("El resultado del numero es:"+numero);
		System.out.println("Este es mi primer programa en Java");
		System.out.println("Usted tiene " + edad + " años");
		System.out.println("Su salario es de: " + salario);
		
	}
}

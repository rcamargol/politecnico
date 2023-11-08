import java.util.Scanner;

public class Ejercicio222 {

	public static void main(String[] args) {
		/*
		 * SUBGRUPO 22 Brayan Dario Ochoa Suescun Julian Daniel Garzón Figueroa Nicolas
		 * Felipe Quevedo Montaño Nury Marlot Fino Suarez Steven de Jesus Londoño
		 * Cantillo
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int numero = sc.nextInt();
		sc.close();
		System.out.println("Los números primos menores o iguales que " + numero + " son:");
		otros_primos(numero);
	}

	static boolean calcular_primos(int numero) {
		int contador = 0;
		for (int i = 1; i < numero + 1; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			return true;
		} else {
			return false;
		}
	}

	static void otros_primos(int numero) {
		for (int j = 1; j <= numero; j++) {
			boolean valor = calcular_primos(j);
			if (valor == true) {
				System.out.print("" + j + " ");
			}
		}
	}
}

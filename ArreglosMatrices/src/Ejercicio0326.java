import java.util.Scanner;

public class Ejercicio0326 {
	public static void main(String[] args) {
		/*
		 * se dice que un numero N es primo si los unicos enteros positivos que lo
		 * dividen son exactamente 1 y N. Construye un programa que lea un numero entero
		 * n positivo N y escriba todos los numeros primos menores a dicho numero. Si el
		 * usuario escribe un numero incorrecto, el programa no se ejecuta. en cambio,
		 * pregunta de nuevo por la informacion hasta que el dato ingresado sea
		 * correcto.
		 */
		Scanner lector = new Scanner(System.in);
		float n;
		while (true) {
			System.out.println("ingresa numero entero positivo: ");
			n = lector.nextInt();
			for (float i = n; i >= 1; i--) {
				esPrimo(i);
			}
		}
	}

	private static void esPrimo(float n) {
		if (n > 3) {
			boolean esPrimo = true;
			for (float i = 2; n > i; i++) {
				float division = (n / i);
				int numeroAuxiliar = (int) division;
				float esPrimoNumero = ((division / numeroAuxiliar) - 1);
				if (0 == esPrimoNumero) {
//System.out.println(" El numero "+n+" no es primo ");
					esPrimo = false;
					break;
				}
			}
			if (esPrimo) {
				System.out.println(n);
			}
		} else if (n > 0) {
			System.out.println(n);
		} else {
			System.out.println("El numero ingresado no es correcto. intentelo nuevamente. ");
		}
	}
}

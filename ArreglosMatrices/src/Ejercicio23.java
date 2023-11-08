import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (true) {
			int num;
			System.out.println("programa para buscar todos los numeros primos menores");
			System.out.println("escribe un numero");
			num = teclado.nextInt();
			if (num > 0) {
				for (int i = 2; i <= num; i++) {
					int creciente = 2;
					boolean nPrimo = true;
					while (nPrimo && creciente < i) {
						if (i % creciente == 0) {
							nPrimo = false;
						} else {
							creciente++;
						}
					}
					if (nPrimo) {
						System.out.println(i + "es numero primo de" + num);
					}
				}
			}
			{
				break;
			}
		}
	}
}
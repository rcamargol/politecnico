import java.util.Scanner;

public class Ejercicio0323 {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("Ingrese un Numero Entero:");
			n = Entrada.nextInt();
			if (n > 0) {
				for (int i = 2; i <= n; i++) {
					int aumenta = 2;
					boolean Primo = true;
					while (Primo && aumenta < i) {
						if (i % aumenta == 0) {
							Primo = false;
						} else {
							aumenta++;
						}
					}
					if (Primo) {
						System.out.println("son los numero primos menores:" + i);
					}
				}
			}
		}
	}
}

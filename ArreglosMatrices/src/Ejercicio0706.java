import java.util.Scanner;

public class Ejercicio0706 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("ingresa un numero");
		numero = entrada.nextInt();
		for (int i = 1; i < numero; i++) {
			int count = 0;
			for (int h = 1; h <= i; h++) {
				if (i % h == 0)
					count++;
			}
			if (count == 2)
				System.out.println(i);
		}
	}
}
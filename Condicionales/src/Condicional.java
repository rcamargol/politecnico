
public class Condicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
		num1 = 7;
		num2 = 7;
		imprimirMayor(num1, num2);
	}

	static int mayorDosNumeros(int a, int b) {
		// a y b son numeros enteros mayores que 0
		// n = 1, el mayor de los numeros es a
		// n = 2, el mayor de los numeros es b
		// n = 0, ambos son iguales
		// n = -1 algun numero es menor que 0.

		int n = -1;
		if (a > 0 && b > 0) {
			if (a > b) {
				n = 1;
			} else if (a < b) {
				n = 2;
			} else if (a == b) {
				n = 0;
			}
		}
		return n;
	}

	static void imprimirMayor(int a, int b) {
		int n = mayorDosNumeros(a, b);
		String numero = "";
		if (n == 1)
			numero = "EL PRIMERO";
		if (n == 2)
			numero = "EL SEGUNDO";
		if (n == 0)
			numero = "SON IGUALES";
		if (n == -1)
			numero = "ERROR ALGUN NUMERO ES < 0";
		System.out.println("El mayor de los dos numeros es:" + numero);
	}

}

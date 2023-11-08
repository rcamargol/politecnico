
public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a; // declaración
		a = new int[5]; // inicialización en las posiciones del arreglo
		int i;
		a[0] = 3;
		a[1] = 4;
		a[2] = 2;
		a[3] = 1;
		a[4] = 5;

		for (i = 0; i < 5; i++) {// recorrido
			System.out.println("a[" + i + "] = " + a[i]);
		}

		int b[] = new int[10];

		for (i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 2;
			}
			System.out.println("Valor:" + b[i]);
		}
		int j = 4;
		if (b[j] < 2) {
			System.out.println("Numero chiquito");
		}
	}
}
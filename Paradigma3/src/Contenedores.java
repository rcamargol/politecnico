import java.util.ArrayList;
import java.util.TreeSet;

public class Contenedores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, aleatorio;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (i = 0 ; i < 7 ; i++) {
			aleatorio = (int)(Math.random()*10);
			numeros.add(aleatorio);
		}
		System.out.println("Imprimir con println del contenedor ..");
		System.out.println(numeros);

		System.out.println("Imprimir cada elemento usando get() ..");
		for (i = 0 ; i < numeros.size() ; i++) {
			System.out.println("Posición:"+i+" - Valor:"+numeros.get(i));
		}
		
		//foreach
		System.out.println("Imprimir utilizando foreach ..");
		for (int numero : numeros) {
			System.out.print(numero+" ");
		}
		System.out.println("\nUtilizando TreeSet ...");
		
		TreeSet<Integer> lista = new TreeSet<Integer>();
		for (int numero : numeros) {
			lista.add(numero);
		}
		
		System.out.println("Imprimr el TreeSet Completo ...");
		System.out.println(lista);

		if (lista.contains(5)) {
			System.out.println("El núm. 5 está en la lista");
		}
		
		for (int item : lista) {
		}
		
	}

}

import java.util.ArrayList;
import java.util.TreeSet;

public class Contenedores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,aleatorio;
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (i = 0 ; i < 7 ; i++) {
			aleatorio = (int)(Math.random()*10);
			numeros.add(aleatorio);
		}
		
		System.out.println("Imprimendo con solo println");
		System.out.println(numeros);
		
		System.out.println("Imprimir accediendo a c/elemento con get()");
		for (i = 0 ; i < numeros.size() ; i++) {
			System.out.println("Pos:"+i+" Valor:"+numeros.get(i));
		}
		System.out.println("Imprimr utilizando foreach ..");
		for(int numero : numeros) {
			System.out.print(numero+"-");
		}

		
		TreeSet<Integer> lista = new TreeSet<Integer>();
		for(i = 0 ; i < numeros.size() ; i++) {
			lista.add(numeros.get(i));
		}
		System.out.println("IMprimir la lista de TreeSet");
		System.out.println(lista);
		
		System.out.println("El número 6 está en lista? "+lista.contains(6));
		
	}
}

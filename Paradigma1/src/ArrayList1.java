import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int i;
		int aleatorio;
		for (i = 0 ; i < 10 ; i++) {
			aleatorio = (int)(Math.random()*10);
			numeros.add(aleatorio);
		}
		//System.out.println("Elementos dentro de arreglo...");
		//System.out.println(numeros);
		// recorrido utilizando foreach
		for(int numero : numeros) {
			System.out.print(numero+" ");
		}
		System.out.println("");
		TreeSet<Integer> lista = new TreeSet<Integer>();
		for(i = 0 ; i < 10 ; i++) {
			lista.add(numeros.get(i));
		}
		
		for (int item : lista) {
			System.out.println("Valor de TreeSet:"+item);
		}
		
		boolean esta;
		
		esta = lista.contains(7);
		
		if(esta) {
			lista.remove(7);
			System.out.println("Eliminando el item 7...");
			System.out.println(lista);
		}else {
			System.out.println("El 7 no esta en la lista");
		}
		
	}
	
}

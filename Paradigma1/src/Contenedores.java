import java.util.ArrayList;
import java.util.TreeSet;

public class Contenedores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (i = 0 ; i<10 ; i++) {
			numeros.add(i);
		}
		System.out.println("con println ..");
		System.out.println(numeros);
		
		System.out.println("Usando foreach ..");
		for(int numero : numeros) {
			System.out.print(numero+" ");
		}
		System.out.println("");
		TreeSet<Integer> lista = new TreeSet<Integer>();
		int num;
		for (i = 0 ; i < 10 ; i++) {
			num = (int)(Math.random()*100);
			System.out.println("Valor de num:"+num);
			lista.add(num);
			//System.out.println(i+"--"+lista.last());
		}
		for(int item : lista) {
			System.out.println("Valor:"+item);
		}
		
		System.out.println("Valor 7 esta? "+lista.contains(7));
	}

}

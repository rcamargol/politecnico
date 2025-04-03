import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> tablaHash = new HashMap<>(); 
		
		tablaHash.put(5, "Manzana");
		tablaHash.put(3, "Banano");
		tablaHash.put(8, "Naranja");
		
		String valor = tablaHash.get(3);
		System.out.println("Valor de Key 3:"+valor);
		boolean clave = tablaHash.containsValue("Naranja");
		System.out.println("Clave para el valor Naranja:"+clave);
		System.out.println("Tamaño de la tabla Hash:"+tablaHash.size());
		System.out.println(tablaHash);
		tablaHash.remove(3);
		System.out.println(tablaHash);
		
	}

}

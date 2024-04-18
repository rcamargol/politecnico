import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear una tabla hash
        HashMap<String, Integer> tablaHash = new HashMap<>();

        // Insertar elementos
        tablaHash.put("Manzana", 5);
        tablaHash.put("Plátano", 3);

        // Recuperar un valor
        int cantidadManzanas = tablaHash.get("Manzana");
        System.out.println("Cantidad de manzanas: " + cantidadManzanas);
        System.out.println("Tamaño de la tabla:"+tablaHash.size());

	}

}

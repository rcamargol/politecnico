import java.util.HashMap;

/*
 * 	put(Object key, Object value): Inserta un elemento en la tabla.
	get(Object key): Recupera un elemento dado su clave.
	remove(Object key): Elimina un elemento por su clave.
	containsKey(Object key): Verifica si una clave existe.
	size(): Devuelve el tamaño de la tabla.
 */

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear una tabla hash
        HashMap<String, Integer> tablaHash = new HashMap<>();

        // Insertar elementos
        tablaHash.put("Manzana", 5);
        tablaHash.put("Plátano", 3);
        tablaHash.put("Naranja", 8);

        // Recuperar un valor
        int cantidadManzanas = tablaHash.get("Manzana");
        System.out.println("Cantidad de manzanas: " + cantidadManzanas);
        System.out.println("Tamaño de la tabla: "+tablaHash.size());
        System.out.println("Contenido "+tablaHash);
        if (tablaHash.containsKey("Naranja"))
        	System.out.println("Contiene naranja");
        // Eliminar la clave "Plátano" y su valor
        	tablaHash.remove("Plátano");
        	
	}
	
	

}

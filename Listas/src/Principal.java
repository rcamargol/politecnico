import Listas.ListaD;
import Pilas.Pila;
import colas.Cola;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//trabajarListasD();
		trabajarPilas();
		trabajarColas();
	}
	
	static void trabajarListasD() {
		ListaD lista = new ListaD();
		lista.insertarNodoFinal(3);
		lista.insertarNodoFinal(4);
		lista.insertarNodoFinal(2);
		lista.imprimirLista();
		lista.eliminarNodo(4);
		lista.imprimirLista();
		lista.insertarNodoEntreNodos(3, 2, 88);
		lista.imprimirLista();
	}
	
	static void trabajarPilas() {
		System.out.println("\nTrabajando con Pilas");
		Pila pila = new Pila();
		pila.crearLista(1);
		pila.hacerPUSH(2);
		pila.hacerPUSH(3);
		pila.hacerPUSH(4);
		pila.imprimirLista(pila.getCabeza());
		System.out.println("Elemento Peek:"+pila.hacerPEEK());
		pila.hacerPOP();
		pila.imprimirLista(pila.getCabeza());
		System.out.println("Elemento Peek:"+pila.hacerPEEK());
	}

	static void trabajarColas() {
		System.out.println("\nTrabajando con Colas");
		Cola cola = new Cola();
		cola.crearLista(4);
		cola.encolar(3);
		cola.encolar(2);
		cola.encolar(1);
		cola.imprimirLista(cola.getCabeza());
	}
}

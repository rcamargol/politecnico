import Listas.Lista;
import Listas.ListaD;
import Listas.NodoL;
import Pilas.Pila;
import colas.Cola;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodoL cabeza,nodo1, nodo2, nodo3, p;
		nodo1 = nodo2 = nodo3 = cabeza = p = new NodoL();
		
		Lista lista = new Lista();
		/*	
		lista.crearLista(3);
		lista.insertarNodoFinal(4);
		lista.insertarNodoFinal(5);
		lista.imprimirLista(lista.getCabeza());
		lista.insertarNodoInicio(2300);
		lista.imprimirLista(lista.getCabeza());
		lista.insertarNodoEntreNodos(50, 4, 5);
		lista.imprimirLista(lista.getCabeza());
	

		nodo1.setSiguiente(null);
		nodo2.setSiguiente(null);
		
		nodo1.setVal(3);
		nodo2.setVal(4);
		nodo3.setVal(5);
		nodo1.setSiguiente(nodo2);
		nodo2.setSiguiente(nodo3);
		nodo3.setSiguiente(null);
		
		cabeza = p = nodo1;
		
		
		while (nodo1.getSiguiente() != null) {
			System.out.println("Elemento:"+nodo1.getVal());
			nodo1 = nodo1.getSiguiente();
		}*/
				
		//trabajarListasD();
		//trabajarPilas();
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

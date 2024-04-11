package colas;
import Listas.Lista;
import Listas.NodoL;

public class Cola extends Lista {

	public void encolar(Object info) {
		super.insertarNodoInicio(info);
	}
	
	public void decolar() {
		super.removerNodo((NodoL) getElementoFrente());
	}
	
	public Object getElementoFrente() {
		NodoL p = super.cabeza;
		while (p.getSiguiente() != null)
			p = p.getSiguiente();
		return p.getVal();
	}
	
	public int numElementosCola() {
		int i = 0;
		NodoL p = super.cabeza;
		while (p != null) {
			p = p.getSiguiente();
			++i;
		}
		return i;
	}
	
	public boolean colaVacia() {
		return super.listaVacia();
	}
}


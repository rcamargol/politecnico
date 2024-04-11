package Listas;
public class ListaD {

	private NodoD cabeza;

	public ListaD() {
		cabeza = null;
	}

	public boolean listaVacia() {
		if (cabeza == null)
			return true;
		else
			return false;
	}

	public NodoD irAlFinal() {
		if (!listaVacia()) {
			NodoD NodoD = cabeza;
			while (NodoD.sig != null)
				NodoD = NodoD.sig;
			return NodoD;
		} else {
			return null;
		}
	}

	public NodoD buscarNodoD(Object val) {
		NodoD p = cabeza;
		NodoD NodoD = null;
		boolean encontro = false;
		while (p != null && !encontro) {
			if (p.val == val) {
				encontro = true;
				NodoD = p;
			}
			p = p.sig;
		}
		return NodoD;
	}
	
	public void insertarNodoEntreNodos(Object a, Object b, Object elemento) {
		NodoD p = buscarNodoD(a);
		NodoD q = buscarNodoD(b);
		NodoD nuevo = new NodoD(elemento);
		if (p != null && q!= null) {
			System.out.println("Insertando Nodo "+elemento+ " entre :"+p.val +" y "+q.val);
			p.sig = nuevo;
			nuevo.ant = p;
			nuevo.sig = q;
			q.ant = nuevo;
		} else {
			System.out.println(p+" "+q);
			System.out.println("No se puede insertar entre Nodos");
			}
	}

	public void insertarNodoFinal(Object elemento) {
		NodoD NodoD = new NodoD(elemento);
		NodoD ultimo;
		System.out.println("Insertando Nodo al final:"+elemento);
		if (!listaVacia()) {
			ultimo = irAlFinal();
			ultimo.sig = NodoD;
			NodoD.ant = ultimo;
		} else {
			cabeza = NodoD;
		}
	}
	
	public void eliminarNodo(Object elemento) {
		NodoD q = buscarNodoD(elemento);
		if (q != null) {
			System.out.println("Eliminando Nodo:"+elemento);
			NodoD p = q.ant;
			NodoD r = q.sig;
			p.sig = r;
			r.ant = p;
		}
	}

	public void imprimirLista() {
		NodoD nodo = cabeza;
		while (nodo != null) {
			System.out.print("[ " + nodo.val+" ]->");
			nodo = nodo.sig;
		}
		System.out.println();
	}

}

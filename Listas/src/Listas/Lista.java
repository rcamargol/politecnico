package Listas;

public class Lista {

	protected NodoL NodoL;
	protected NodoL cabeza;

	public boolean listaVacia() {
		if (cabeza == null)
			return true;
		else
			return false;
	}
	
	public void crearNodo(Object val) {
		this.NodoL = new NodoL();
		this.NodoL.setVal(val);
		this.NodoL.setSiguiente(null);
	}
	
	public void crearLista(Object val) {
		crearNodo(val);
		this.cabeza = this.NodoL;
	}
	
	public void insertarNodoFinal(Object val) {
		if (listaVacia()) {
			crearLista(val);
		} else {
			NodoL p = this.cabeza;
			crearNodo(val);
			while (p.getSiguiente() != null)
				p = p.getSiguiente();
			p.setSiguiente(NodoL);
		}
	}
	
	public void insertarNodoInicio(Object val) {
		if (listaVacia()) {
			crearLista(val);
		} else {
			crearNodo(val);
			this.NodoL.setSiguiente(cabeza);
			this.cabeza = this.NodoL;
		}
	}
	
	public NodoL buscarvalLista(Object val) {
		NodoL p = null;
		if (!listaVacia())
			p = this.cabeza;
		while (p != null && p.getVal() != val) {
			p = p.getSiguiente();
		}
		return p;
	}
	
	public void insertarNodoEntreNodos(Object val, Object n1, Object n2) {
		NodoL p, q = this.cabeza;
		p = buscarvalLista(n1);
		q = buscarvalLista(n2);
		crearNodo(val);
		if (p != null && q != null) {
			p.setSiguiente(this.NodoL);
			this.NodoL.setSiguiente(q);
		}
	}
	
	public int removerNodo(Object val) {
		NodoL p, q;
		if (!listaVacia()) { // lista no es vacia
			p = buscarvalLista(val);
			if (p != null) { // el nodo est� en la lista
				if (p == this.cabeza) {// el nodo est� en la cabeza
					this.cabeza = p.getSiguiente();
				} else {
					q = this.cabeza;
					while (q.getSiguiente() != p) {
						q = q.getSiguiente();
					}
					q.setSiguiente(p.getSiguiente());
				}
			} else
				return -1;
		}
		return 1;
	}
	
	public void insertarListaOrdenada(Object val) {
		NodoL p, q;
		boolean encontro = false;
		if (listaVacia()) {// lista est� vacia?
			crearLista(val);
		} else {
			if (this.cabeza.getSiguiente() == null) {// un solo nodo?
				if ((int)this.cabeza.getVal() < (int)val) {
					insertarNodoFinal(val);
				} else {
					insertarNodoInicio(val);
				}
			} else { // dos o m�s nodos en la lista
				p = null;
				q = this.cabeza;
				while (q != null && !encontro) {
					if ((int)val > (int)q.getVal()) {
						p = q;
						q = q.getSiguiente();
					} else
						encontro = true;
				}
				if (encontro) { // val es menor que un numero de la lista
					if (p == null) { // el menor esta al inicio
						insertarNodoInicio(val);
					} else {
						insertarNodoEntreNodos(val, p.getVal(), q.getVal());
					}
				} else {// el menor est� al final
					insertarNodoFinal(val);
				}
			}
		}
	}
	
	public void insertarListaOrdenada(int val, int modo) {
		NodoL p, q;
		boolean comparacion1, comparacion2, encontro;
		comparacion1 = comparacion2 = encontro = false;

		if (listaVacia()) {// lista est� vacia?
			crearLista(val);
		} else {
			if (this.cabeza.getSiguiente() == null) {// un solo nodo?

				if (modo == 1)
					comparacion1 = (int)this.cabeza.getVal() < val;
				else
					comparacion1 = (int)this.cabeza.getVal() > val;

				if (comparacion1) {// comparacion1
					insertarNodoFinal(val);
				} else {
					insertarNodoInicio(val);
				}
			} else { // dos o m�s nodos en la lista
				p = null;
				q = this.cabeza;

				while (q != null && !encontro) {
					if (modo == 1)
						comparacion2 = val > (int)q.getVal();
					else
						comparacion2 = val < (int)q.getVal();

					if (comparacion2) {// comparacion2
						p = q;
						q = q.getSiguiente();
					} else
						encontro = true;
				}
				if (encontro) { // val es menor que un numero de la lista
					if (p == null) { // el menor esta al inicio
						insertarNodoInicio(val);
					} else {
						insertarNodoEntreNodos(val, p.getVal(), q.getVal());
					}
				} else {// el menor est� al final
					insertarNodoFinal(val);
				}
			}
		}
	}
	
	public void imprimirLista(NodoL nodo) {
		int i = 0;
		NodoL nodoa = null;
		if (nodo == null)
			System.out.println("Lista vacia");
		else
			while (nodo != null) {
				//nodoa = (NodoL)nodo.getVal();
				System.out.print("(" + nodo.getVal()+")-->");
				nodo = nodo.getSiguiente();
			}
			System.out.println();
	}
	

	// getters y setters
	public NodoL getNodo() {
		return NodoL;
	}
	public void setNodo(NodoL nodo) {
		this.NodoL = nodo;
	}
	public NodoL getCabeza() {
		return cabeza;
	}
	public void setCabeza(NodoL cabeza) {
		this.cabeza = cabeza;
	}
}

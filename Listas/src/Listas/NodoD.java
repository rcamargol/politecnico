package Listas;

public class NodoD {

	Object val;
	NodoD ant = null;
	NodoD sig = null;
	
	public NodoD(Object val) {
		this.val = val;
		this.ant = this.sig = null;
	}
	
	public Object getVal() {
		return val;
	}
	public void setVal(Object val) {
		this.val = val;
	}
	public NodoD getAnt() {
		return ant;
	}
	public void setAnt(NodoD ant) {
		this.ant = ant;
	}
	public NodoD getSig() {
		return sig;
	}
	public void setSig(NodoD sig) {
		this.sig = sig;
	}
	

}



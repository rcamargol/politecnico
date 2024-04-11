package Pilas;
import Listas.Lista;

public class Pila extends Lista{
	
	public void hacerPUSH(Object info) {
		super.insertarNodoInicio(info);
	}
	public void hacerPOP() {
		super.removerNodo(super.cabeza.getVal());
	}
	public Object hacerPEEK() {
		if(super.cabeza!=null) {
			return(super.cabeza.getVal());
			//fin del metodo que esta complto
		}
		return null;
	}
	
}


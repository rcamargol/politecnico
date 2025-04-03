import Arboles.ArbolBinario;
import Listas.NodoA;

public class PpalArboles {
	
	private static ArbolBinario ab = new ArbolBinario();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crearABB();
		ab.mostrarPreorden(ab.getRaiz());
		//ab.mostrarInorden(ab.getRaiz());
		//ab.mostrarPosorden(ab.getRaiz());		
	}

	public static NodoA crearABB() {
		//int[] valores = { 10, 5, 1, 8, 20, 15, 30};
		int[] valores = { 8, 3, 10, 1, 6, 14, 4, 7, 13};
		ab = new ArbolBinario();
		for (int i = 0; i < valores.length; i++) {
			ab.insertarArbolABB(valores[i]);
		}
		return ab.getRaiz();
	}

}

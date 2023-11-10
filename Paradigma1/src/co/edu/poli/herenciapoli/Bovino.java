package co.edu.poli.herenciapoli;

public class Bovino extends Mamifero{
	
	private int numCuernos;
	
	public void criar() {
		super.numVertebras = 42;
		this.numCuernos = 2;
		String comer = super.amamantar();
	}

}

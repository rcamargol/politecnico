package co.edu.poli.herenciapoli;

public class Polimorfismo {
	private Mamifero m;
	private Canino canino;
	private Bovino bovino;
	
	public void hacerPolimorfismo() {
		this.canino = new Canino();
		this.bovino = new Bovino();
		this.canino.crecer();
		this.canino.crecer("Son 49 colmillos");
		this.canino.crecer("Son 150", 4);
		
		Mamifero[] mamifero = new Mamifero[2];
		mamifero[0] = canino;
		mamifero[1] = bovino;
		
	}
}

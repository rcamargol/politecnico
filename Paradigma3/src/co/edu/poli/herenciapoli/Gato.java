package co.edu.poli.herenciapoli;

public class Gato extends Mamifero{
	
	public void maullar() {
		super.numDientes = 60;
		System.out.println("Yo Maullo y de comida "+super.amamantar());
	}

}

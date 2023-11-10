package co.edu.poli.herenciapoli;

public class Perro extends Mamifero {
	
	private String collar;
	
	public void serSano() {
		super.numHuesos = 47; //atributo heredado
		int i; //variable local al método serSano
		System.out.println(super.tomarLeche());
		this.collar = "Collar de colorcitos variados"; //atributo de la clase
	}
	
}

package co.edu.poli.herenciapoli;

public class Animales {
	
	private String tipoAnimal;
	private int numPatas;
	
	public Animales() {
		this.tipoAnimal = "";
		this.numPatas = 0;
	}
	
	public Animales(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
		this.numPatas = 4;
	}
	
	public Animales(String tipoAnimal, int numPatas) {
		this.tipoAnimal = tipoAnimal;
		this.numPatas = numPatas;		
	}
	
	
	public void hacerPolimorfismo() {
		
		Mamifero [] animales = new Mamifero[2];
		
		Perro perro1 = new Perro();
		Gato gato1 = new Gato();
		
		animales[0] = perro1;
		animales[1] = gato1;
		
	}

}

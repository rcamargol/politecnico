package co.edu.poli.herenciapoli;

public class Animales {
	
	public void mostrarAnimales() {
		
		Mamifero[] animales = new Mamifero[2];
		
		Perro p = new Perro();
		Perro p1 = new Perro("collar de riata");
		Perro p2 = new Perro("Collar de pepitas", true);
		
		Gato g = new Gato();
		
		animales[0] = p;
		animales[1] = g;
		
	}

}

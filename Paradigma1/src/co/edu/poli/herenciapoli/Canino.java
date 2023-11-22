package co.edu.poli.herenciapoli;

public class Canino extends Mamifero{
	
	private String numColmillos;
	private int numPatas;
	
	public void crecer() {
		super.numVertebras = 53;
		this.numColmillos ="6";
		String comer = super.amamantar();
		System.out.println("Soy un perro y me alimento "+comer);
		System.out.println("Mis colmillos son:"+mostrarColmillos());
	}
	
	public void crecer(String numColmillos) {
		this.numColmillos = numColmillos;
		this.numPatas = 4;
	}
	
	public void crecer(String numColmillos, int numPatas) {
		this.numColmillos = numColmillos;
		this.numPatas = numPatas;		
	}
	
	public String mostrarColmillos() {
		return this.numColmillos;
	}
	
	public int mostrarPatas() {
		return this.numPatas;
	}
	
}

package co.edu.poli.herenciapoli;

public class Perro extends Mamifero{
	
	private String tipoCollar;
	private boolean parque;
	
	public Perro() {
		
	}
	
	public Perro(String tipoCollar) {
		this.tipoCollar = tipoCollar;
		this.parque = true;
	}
	
	public Perro (String tipoCollar, boolean parque) {
		this.tipoCollar = tipoCollar;
		this.parque = parque;
	}
	
	
	
	public String ladrar() {
		this.tipoCollar = "de castigo";
		super.numDientes = 34;
		String mensaje = "Yo ladro, porque "+super.amamantar();
		return mensaje;
	}
	
}

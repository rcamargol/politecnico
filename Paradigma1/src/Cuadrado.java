import java.util.Scanner;

public class Cuadrado {
	
	//declaración de atributos
	private double lado;
	private double areaCuadrado;
	private double periCuadrado;
	private Scanner entrada = new Scanner(System.in);

	//declaración de métodos
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public void pedirLado() {
		System.out.println("Digite lado:");
		this.lado = entrada.nextDouble();		
	}
	
	public void calcularArea() {
		this.areaCuadrado = this.lado * this.lado;
	}
	
	public void calcularPerimetro() {
		this.periCuadrado = this.lado * 4;
	}
	
	public void mostrarResultados() {
		System.out.println("El area es:"+ this.areaCuadrado);
		System.out.println("El perimetro es:"+ this.periCuadrado);
	}
	
	//getters y setters
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAreaCuadrado() {
		return areaCuadrado;
	}
	public void setAreaCuadrado(double areaCuadrado) {
		this.areaCuadrado = areaCuadrado;
	}
	public double getPeriCuadrado() {
		return periCuadrado;
	}
	public void setPeriCuadrado(double periCuadrado) {
		this.periCuadrado = periCuadrado;
	}
	
}

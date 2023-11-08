import java.util.Scanner;

public class Cuadrado {
	
	//atributos

	private double lado;
	private double areaCuadrado;
	private double periCuadrado;

	//métodos
	
	public void pedirLado() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite Lado:");
		this.lado = entrada.nextDouble();
	}
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public void calcularArea() {
		this.areaCuadrado = this.lado * this.lado;
	}
	
	public void calcularPerimetro() {
		this.periCuadrado = this.lado * 4;
	}
	
	public void imprimirResultados() {
		System.out.println("Area:"+this.areaCuadrado);
		System.out.println("Perimetro: "+this.periCuadrado);
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

import java.util.Scanner;

public class Cuadrado {
	
	private double lado;
	private double areaCuadrado;
	private double periCuadrado;

	//metodos
	public Cuadrado() {
		
	}
	
	public void calcularArea() {
		this.areaCuadrado = this.lado * this.lado;
	}
	
	public void calcularPerimetro() {
		this.periCuadrado = this.lado * 4;
	}
	
	public void pedirLado(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite el lado:");
		this.lado = (entrada.nextDouble());
	}
	
	public void imprimirResultados() {
		System.out.println("El area del cuadrado es:"+this.areaCuadrado);
		System.out.println("El perimetro del cuadrado es:"+this.periCuadrado);
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

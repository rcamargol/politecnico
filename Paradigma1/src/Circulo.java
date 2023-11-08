import java.util.Scanner;

public class Circulo {
	
	//declaración de atributos
	
	private double radio;
	private double areaCirculo;
	private double periCirculo;
	private Scanner entrada = new Scanner(System.in);
	//declaración de métodos
	
	public void pedirRadio() {
		System.out.println("Digite radio:");
		this.radio = entrada.nextDouble(); 
	}
	
	public void calcularArea() {
		this.areaCirculo = this.radio * this.radio * Math.PI;
	}
	
	public void calcularPerimetro() {
		this.periCirculo = 2 * Math.PI * this.radio;
	}
	
	public void mostrarResultados() {
		System.out.println("El area es:"+ this.areaCirculo);
		System.out.println("El perimetro es:"+ this.periCirculo);
	}
	
	//getters y setters
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	public double getAreaCirculo() {
		return areaCirculo;
	}
	public void setAreaCirculo(double areaCirculo) {
		this.areaCirculo = areaCirculo;
	}
	public double getPeriCirculo() {
		return periCirculo;
	}
	public void setPeriCirculo(double periCirculo) {
		this.periCirculo = periCirculo;
	}
	
}

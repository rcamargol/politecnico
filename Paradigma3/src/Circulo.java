import java.util.Scanner;

public class Circulo {
	
	private double radio;
	private double areaCirculo;
	private double periCirculo;
	
	// métodos
	
	public void pedirRadio(){
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite el radio:");
		this.radio = (entrada.nextDouble());
	}
	
	public void calcularArea() {

		this.areaCirculo = Math.PI * this.radio * this.radio;
	}
	
	public void calcularPerimetro() {
		this.periCirculo = Math.PI * 2 * radio;

	}
	
	public void mostrarResultados() {
		System.out.println("Area del circulo es:"+this.areaCirculo);
		System.out.println("Perímetro del circulo es:"+this.periCirculo);
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

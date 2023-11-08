
public class Circulo {
	
	//declaración de atributos
	
	private double radio;
	private double areaCirculo;
	private double periCirculo;
	
	//declaración de métodos
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public void calcularArea() {
		this.areaCirculo = this.radio * this.radio * Math.PI;
	}
	
	public void calcularPerimetro() {
		this.periCirculo = 2 * Math.PI * this.radio;
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

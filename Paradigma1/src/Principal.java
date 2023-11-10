
public class Principal {
	
	 //Instanciar o materializar dos clases en objetos 
	static Circulo circulo = new Circulo();
	static Cuadrado cuadrado = new Cuadrado(10);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		circulo.setRadio(10);
		//circulo.pedirRadio();
		circulo.calcularArea();
		circulo.calcularPerimetro();
		System.out.println("El perimietro es:"+circulo.getPeriCirculo());
		circulo.mostrarResultados();
		
		//cuadrado.pedirLado();
		cuadrado.calcularArea();
		cuadrado.calcularPerimetro();
		cuadrado.mostrarResultados();
	}

}

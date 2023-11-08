
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar o materializar dos clases en objetos 
		Circulo circulo = new Circulo();
		Cuadrado cuadrado = new Cuadrado(10);
		
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

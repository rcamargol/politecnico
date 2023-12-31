package co.edu.poli.modelo;

public class Juego {
	
	private int[] adivina;
	private int[] magico;
	private int picas;
	private int fijas;
	private String txpicas;
	private String txfijas;
	
	public final int MAX_INTENTOS = 10;
	public final int ERRORDIGITOS = -2;
	public final int ENTRADAINVALIDA = -3;
	
	public Juego() {
		this.adivina = new int[4];
		this.magico = new int[4];
	}
	
	public void generarMagico() {
		int[] digitos = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int numero;
		double num;
		int total = 0;
		while (total < 4) {
			num = Math.random() * 10;
			numero = (int) num;
			if (digitos[numero] != -1) {
				this.magico[total] = numero;
				digitos[numero] = -1;
				total++;
				System.out.print(numero+" ");
			}
		}
	}

	public int validarEntrada(String txtNumeros) {
		int numero = -1;
		if (txtNumeros.length() != 4) {
			numero = ERRORDIGITOS;//cuatro digitos
		} else {
			try {
				numero = Integer.parseInt(txtNumeros);
			} catch (NumberFormatException e) {
				numero = ENTRADAINVALIDA;//entrada invalida
			}

		}
		return numero;
	}

	public boolean validarRepetido(int numero) {
		int[] digitos = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int i = 0, num = numero, j = 3;
		while (num > 0) {
			this.adivina[j] = num % 10;
			//System.out.println(this.adivina[j]);
			num = num / 10;
			j--;
		}
		for (i = 0; i < 4; i++) {
			if (digitos[this.adivina[i]] != -1)
				digitos[this.adivina[i]] = -1;
			else {
				return false;
			}
		}
		return true;
	}

	public boolean adivinaste() {
		boolean adivino = false;
		int i,j;
		this.picas = this.fijas = 0;
		for(i = 0 ; i < 4 ; i++ ) {
			if (this.adivina[i] == this.magico[i])
				this.fijas++;
		}
		for(i = 0 ; i < 4 ; i++) {
			for (j = 0 ; j < 4 ; j++) {
				if (i != j && this.adivina[i] == this.magico[j])
					this.picas++;
			}
		}
		if (this.fijas == 4)
			adivino = true;
		this.txpicas = this.picas+"";
		this.txfijas = this.fijas+"";
		return adivino;
	}

	//getters y setters
	
	public int[] getAdivina() {
		return adivina;
	}

	public void setAdivina(int[] adivina) {
		this.adivina = adivina;
	}

	public int[] getMagico() {
		return magico;
	}

	public void setMagico(int[] magico) {
		this.magico = magico;
	}

	public int getPicas() {
		return picas;
	}

	public void setPicas(int picas) {
		this.picas = picas;
	}

	public int getFijas() {
		return fijas;
	}

	public void setFijas(int fijas) {
		this.fijas = fijas;
	}

	public String getTxpicas() {
		return txpicas;
	}

	public void setTxpicas(String txpicas) {
		this.txpicas = txpicas;
	}

	public String getTxfijas() {
		return txfijas;
	}

	public void setTxfijas(String txfijas) {
		this.txfijas = txfijas;
	}
	
	public String getMagicoTxt() {
		String valor = String.valueOf(
				this.magico[0]*1000+this.magico[1]*100+this.magico[2]*10+this.magico[3]);
		return valor;
	}
}

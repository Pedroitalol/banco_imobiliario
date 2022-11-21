package dado;

import java.util.Random;

public class DadoModel {
	private int ultimoValor;

	public DadoModel() {
		this.ultimoValor = -1;
	}
	
	public int jogarDado() {
		Random gerador = new Random();
		this.ultimoValor = gerador.nextInt(6) + 1;
		return this.ultimoValor;
	}
	
	public int retornaUltimoValor() {
		return this.ultimoValor;
	}
}

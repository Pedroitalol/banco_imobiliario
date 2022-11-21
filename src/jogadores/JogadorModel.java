package jogadores;

public class JogadorModel {
	private int quantidadeDinheiro;
	private int localNoTabuleiro;
	
	public JogadorModel(int quantidadeInicial) {
		this.quantidadeDinheiro = quantidadeInicial;
		this.localNoTabuleiro = 0;
	}
	
	public int retornaQuantidadeDinheiroJogador() {
		return this.quantidadeDinheiro;
	}
	
	public int retornaLocalNoTabuleiro() {
		return this.localNoTabuleiro;
	}
	
	public void andarCasas(int numCasas) {
		int falta = 40 - this.localNoTabuleiro;
		if(falta < numCasas) {
			this.localNoTabuleiro = numCasas - falta;
		}else {
			this.localNoTabuleiro = this.localNoTabuleiro + numCasas;
		}
	}
}

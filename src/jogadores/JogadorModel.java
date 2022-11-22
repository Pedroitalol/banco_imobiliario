package jogadores;

public class JogadorModel {
	private int quantidadeDinheiro;
	private int localNoTabuleiro;
	private String pecaDoJogo;
	
	public JogadorModel(int quantidadeInicial, String peca) {
		this.quantidadeDinheiro = quantidadeInicial;
		this.localNoTabuleiro = 0;
		this.pecaDoJogo = peca;
	}
	
	public int retornaQuantidadeDinheiroJogador() {
		return this.quantidadeDinheiro;
	}
	
	public int retornaLocalNoTabuleiro() {
		return this.localNoTabuleiro;
	}
	
	public String retornaPecaDoJogador() {
		return this.pecaDoJogo;
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

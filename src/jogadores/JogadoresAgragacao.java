package jogadores;

import java.util.ArrayList;

public class JogadoresAgragacao implements IAgregadorJogadores{
	public IIteradorJogadores interadorJogadores;
	ArrayList<JogadorModel> listaJogadores;
	int quantidadeJogadores;
	int jogadorInicial;
	
	public JogadoresAgragacao(int quantidadeJogadores, ArrayList<JogadorModel> listaJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
		this.listaJogadores = listaJogadores;
		this.jogadorInicial = -1;
	}

	public void criarInterador() {
		if(this.jogadorInicial != -1) {
			this.interadorJogadores = new IteradorJogadores(this.quantidadeJogadores, this.listaJogadores, this.jogadorInicial);
		}else {
			throw new ArithmeticException("O jogador inicial não foi escolhido");
		}
	}
	
	// tem que ser de 0 até numero de jogadores
	public void definirJogadorInicial(int jogadorInicial) {
		this.jogadorInicial = jogadorInicial;
	}
}

package jogadores;

import java.util.ArrayList;

public class IteradorJogadores implements IIteradorJogadores{
	int quantidadeJogadores;
	ArrayList<JogadorModel> listaJogadores;
	int jogadorInicial;
	int interador;

	public IteradorJogadores(int quantidadeJogadores, ArrayList<JogadorModel> listaJogadores, int jogadorInicial) {
		this.quantidadeJogadores = quantidadeJogadores;
		this.listaJogadores = listaJogadores;
		this.jogadorInicial = jogadorInicial;
		this.interador = jogadorInicial;
	}
	
	public JogadorModel primeiroJogador() {
		JogadorModel temp = this.listaJogadores.get(jogadorInicial);
		return temp;
	}

	public JogadorModel proximoJogador() {
		if(this.interador == this.quantidadeJogadores - 1) {
			this.interador = 0;
		}else {
			this.interador++;
		}
		JogadorModel ret = this.listaJogadores.get(this.interador);
		return ret;
	}

	public boolean existeProximoJogador() {
		return true;
	}
	
	public JogadorModel jogadorAtual() {
		JogadorModel ret = this.listaJogadores.get(this.interador);
		return ret;
	}
}

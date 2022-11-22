package jogadores;

import java.util.ArrayList;
import java.util.Iterator;

public class JogadoresAgragacao implements IAgregadorJogadores{
	public IIteradorJogadores interadorJogadores;
	ArrayList<JogadorModel> listaJogadores;
	int quantidadeJogadores;
	int jogadorInicial;
	
	public JogadoresAgragacao(int quantidadeJogadores, ArrayList<JogadorModel> listaJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
		this.listaJogadores = listaJogadores;
		this.jogadorInicial = -1;
		this.interadorJogadores = null;
	}

	public void criarInterador() {
		if(this.jogadorInicial != -1) {
			this.interadorJogadores = new IteradorJogadores(this.quantidadeJogadores, this.listaJogadores, this.jogadorInicial);
		}else {
			throw new IllegalArgumentException("O jogador inicial não foi escolhido");
		}
	}
	
	// tem que ser de 0 até numero de jogadores
	public void definirJogadorInicial(int jogadorInicial) {
		this.jogadorInicial = jogadorInicial;
	}
	
	public void adicionarJogador(int quantidadeInicial, String peca) {
		// se interador já criado, não pode mudar os jogadores
		if(this.interadorJogadores != null) {
			throw new IllegalArgumentException("Jogo já iniciado, se quiser adicionar novo jogador, reinicie o jogo!");
		}
		if(this.quantidadeJogadores < 6) {
			for (JogadorModel jogadorModel : this.listaJogadores) {
				if(jogadorModel.retornaPecaDoJogador().equals(peca)) {
					throw new IllegalArgumentException("Algum jogador já escolheu essa peça!");
				}
			}
			this.listaJogadores.add(new JogadorModel(quantidadeInicial, peca));
			this.quantidadeJogadores++;
		}else {
			throw new IllegalArgumentException("Quantidade máxima de jogadores atingida!");
		}
	}
	
	public boolean removerJogador(String peca) {
		// se interador já criado, não pode mudar os jogadores
		if(this.interadorJogadores != null) {
			throw new IllegalArgumentException("Jogo já iniciado, se quiser remover um jogador, reinicie o jogo!");
		}
		
		if(this.quantidadeJogadores > 1) {
			Iterator<JogadorModel> itr = this.listaJogadores.iterator();
			
	        while (itr.hasNext()){
	            JogadorModel x = itr.next();
	            if (x.retornaPecaDoJogador().equals(peca)) {
	            	itr.remove();
	            	return true;
	            }
	        }
	        throw new IllegalArgumentException("Jogador não encontrado!");
		}else {
			throw new IllegalArgumentException("Sem jogadores no jogo atual!");
		}
	}
	
	public String verJogadores() {
		if(this.quantidadeJogadores <= 0) {
			throw new IllegalArgumentException("Sem jogadores no jogo atual!");
		}
		String temp = "";
		for (JogadorModel jogadorModel : this.listaJogadores) {
			temp += "Jogador de peça " + jogadorModel.retornaPecaDoJogador() + "\n";
		}
		return temp;
	}
	
	// TODO: 
	public String verJogadoresDuranteJogo() {
		if(this.quantidadeJogadores <= 0) {
			throw new IllegalArgumentException("Sem jogadores no jogo atual!");
		}
		String temp = "";
		for(int i = 0; i < this.quantidadeJogadores; i++) {
			
		}
		for (JogadorModel jogadorModel : this.listaJogadores) {
			temp += "Jogador de peça " + jogadorModel.retornaPecaDoJogador() + "\n";
		}
		return temp;
	}
}

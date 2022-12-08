package br.ufc.trabalhofinalpds.jogadores;

import java.util.ArrayList;

public class JogadoresAgregacaoController implements IJogadoresAgregacaoController{
	private IJogadoresAgragacao jogadores;
	
	public JogadoresAgregacaoController() {
		this.jogadores = new JogadoresAgragacao(0, new ArrayList<JogadorModel>());
	}
	
	public void adicionarJogador(String peca) {
		this.jogadores.adicionarJogador(2000, peca);
	}
	
	public boolean removerJogador(String peca) {
		return this.jogadores.removerJogador(peca);
	}
	
	public String verJogadores() {
		return this.jogadores.verJogadores();
	}

	public JogadorModel retornaJogador(String peca) {
		return this.jogadores.retornaJogadro(peca);
	}

	public String[] retornaNomesPecas(){
		String[] ret = jogadores.retornaNomesPecas();
		return ret;
	}

	
}

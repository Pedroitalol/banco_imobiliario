package br.ufc.trabalhofinalpds.casa;

import br.ufc.trabalhofinalpds.jogadores.IJogadoresAgregacaoController;

public class CasaLucros implements ICasa{
	private int valorAdicional;
	
	public CasaLucros(int valorAdicional){
		this.valorAdicional = valorAdicional;
	}

	public void executaAcao(IJogadoresAgregacaoController jogadores, String pecaJogadorAtual) {
		jogadores.retornaJogador(pecaJogadorAtual).adicionarDinheiro(this.valorAdicional);
	}
}

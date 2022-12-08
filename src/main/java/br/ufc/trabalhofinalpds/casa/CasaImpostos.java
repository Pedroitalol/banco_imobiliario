package br.ufc.trabalhofinalpds.casa;

import br.ufc.trabalhofinalpds.jogadores.IJogadoresAgregacaoController;

public class CasaImpostos implements ICasa{
	private int valorImposto;
	public CasaImpostos(int valorImposto){
		this.valorImposto = valorImposto;
	}
	public void executaAcao(IJogadoresAgregacaoController jogadores, String pecaJogadorAtual) {
		jogadores.retornaJogador(pecaJogadorAtual).debitarDinheiro(this.valorImposto);
	}
}

package br.ufc.trabalhofinalpds.casa;

import br.ufc.trabalhofinalpds.jogadores.IJogadoresAgregacaoController;

public interface ICasa {
	public void executaAcao(IJogadoresAgregacaoController jogadores, String pecaJogadorAtual);
}
package casa;

import jogadores.IJogadoresAgregacaoController;

public interface ICasa {
	public void executaAcao(IJogadoresAgregacaoController jogadores, String pecaJogadorAtual);
}
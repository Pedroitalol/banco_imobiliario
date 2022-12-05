package casa;

import jogadores.IJogadoresAgregacaoController;

public class CasaImpostos implements ICasa{
	int valorImposto;
	public CasaImpostos(int valorImposto){
		this.valorImposto = valorImposto;
	}
	public void executaAcao(IJogadoresAgregacaoController jogadores, String pecaJogadorAtual) {
		jogadores.retornaJogador(pecaJogadorAtual).debitarDinheiro(this.valorImposto);
	}
}

package casa;

import jogadores.IJogadoresAgregacaoController;

public class CasaLucros implements ICasa{
	int valorAdicional;
	
	public CasaLucros(int valorAdicional){
		this.valorAdicional = valorAdicional;
	}

	public void executaAcao(IJogadoresAgregacaoController jogadores, String pecaJogadorAtual) {
		jogadores.retornaJogador(pecaJogadorAtual).adicionarDinheiro(this.valorAdicional);
	}
}

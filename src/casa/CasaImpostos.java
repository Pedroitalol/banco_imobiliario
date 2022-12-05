package casa;

import jogadores.JogadorModel;

public class CasaImpostos implements ICasa{
	public void executaAcao(JogadorModel jogadorAtual) {
		jogadorAtual.debitarDinheiro(200);
	}
}

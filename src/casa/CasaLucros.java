package casa;

import jogadores.JogadorModel;

public class CasaLucros implements ICasa{

	public void executaAcao(JogadorModel jogadorAtual) {
		jogadorAtual.adicionarDinheiro(200);
	}
}

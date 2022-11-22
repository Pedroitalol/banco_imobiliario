package jogadores;

import java.util.ArrayList;

public class JogadoresAgregacaoController {
	private JogadoresAgragacao jogadores;
	
	public JogadoresAgregacaoController() {
		this.jogadores = new JogadoresAgragacao(0, new ArrayList<JogadorModel>());
	}
	
	public void adicionarJogador(String peca) {
		this.jogadores.adicionarJogador(2000, peca);
	}
	
	public void removerJogador(String peca) {
		this.jogadores.removerJogador(peca);
	}
	
	public String verJogadores() {
		return this.jogadores.verJogadores();
	}
	
}

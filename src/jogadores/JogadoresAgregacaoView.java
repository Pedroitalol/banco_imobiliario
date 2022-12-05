package jogadores;

import java.util.Scanner;

public class JogadoresAgregacaoView {
	IJogadoresAgregacaoController jogadorController;
	Scanner terminal;
	
	public JogadoresAgregacaoView() {
		this.terminal = new Scanner(System.in);
	}
	public void prepararJogo() {
		this.jogadorController = new JogadoresAgregacaoController();
		System.out.println("Prepara��o de novo jogo iniciada com sucesso");
	}
	
	public void adicionarJogador() {
		System.out.println("Por favor, adicionar nome da pe�a do jogador");
		String peca = terminal.nextLine();
		try {
			this.jogadorController.adicionarJogador(peca);
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel adicionar jogador, pois: " + e.getMessage());
		}
	}
	
	public void removerJogador() {
		System.out.println("Por favor, digite o nome da pe�a do jogador que deseja remover");
		String peca = terminal.nextLine();
		try {
			boolean ret = this.jogadorController.removerJogador(peca);
			if(ret == true) System.out.println("jogador de pe�a " + peca + " foi removido com sucesso!");
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel remover jogador, pois: " + e.getMessage());
		}
	}
	
	public void verJogadores() {
		try {
			System.out.println(this.jogadorController.verJogadores());
		} catch (Exception e) {
			System.out.println("N�o foi poss�vel visualizar jogadores, pois: " + e.getMessage());
		}
	}

	public JogadorModel retornaJogador(String peca){
		return this.jogadorController.retornaJogadro(peca);
	}
	
	
}

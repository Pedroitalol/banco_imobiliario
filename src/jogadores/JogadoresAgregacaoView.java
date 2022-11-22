package jogadores;

import java.util.Scanner;

public class JogadoresAgregacaoView {
	JogadoresAgregacaoController jogadorController;
	Scanner terminal;
	
	public JogadoresAgregacaoView() {
		this.terminal = new Scanner(System.in);
	}
	public void prepararJogo() {
		this.jogadorController = new JogadoresAgregacaoController();
		System.out.println("Preparação de novo jogo iniciada com sucesso");
	}
	
	public void adicionarJogador() {
		System.out.println("Por favor, adicionar nome da peça do jogador");
		String peca = terminal.nextLine();
		try {
			this.jogadorController.adicionarJogador(peca);
		} catch (Exception e) {
			System.out.println("Não foi possível adicionar jogador, pois: " + e.getMessage());
		}
	}
	
	public void removerJogador() {
		System.out.println("Por favor, digite o nome da peça do jogador que deseja remover");
		String peca = terminal.nextLine();
		try {
			this.jogadorController.removerJogador(peca);
		} catch (Exception e) {
			System.out.println("Não foi possível remover jogador, pois: " + e.getMessage());
		}
	}
	
	public void verJogadores() {
		try {
			System.out.println(this.jogadorController.verJogadores());
		} catch (Exception e) {
			System.out.println("Não foi possível visualizar jogadores, pois: " + e.getMessage());
		}
	}
	
	
}

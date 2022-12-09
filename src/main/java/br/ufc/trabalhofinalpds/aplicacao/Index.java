package br.ufc.trabalhofinalpds.aplicacao;

import br.ufc.trabalhofinalpds.dado.DadoView;
import br.ufc.trabalhofinalpds.jogadores.JogadoresAgregacaoView;
// import br.ufc.trabalhofinalpds.casa.*;

public class Index {
	public static void main(String[] args) {
		DadoView dadoView = new DadoView();

		dadoView.jogaDados();

		try {
			JogadoresAgregacaoView teste = new JogadoresAgregacaoView();
			// CasaAgregacao casas = new CasaAgregacao();

			// para fazer dar certo, precisa ser assim:
			teste.prepararJogo();
			teste.adicionarJogador();
			teste.adicionarJogador();
			teste.adicionarJogador();
			teste.adicionarJogador();
			teste.iniciaJogo();

			// casas.addCasa(new CasaLucros(200));
			// casas.addCasa(new CasaImpostos(200));
			// casas.addCasa(new CasaPropriedade("Casa da mãe joana", 200, 20));

			// casas.executaAcao(2, teste.retornaJogadorAtual());
			// casas.executaAcao(2, teste.retornaJogadorAtual());
			teste.imprimeDadosJogadorAtual();
			for(int i = 0; i < 10; i++){
				teste.avancaJogadores();
				teste.imprimeDadosJogadorAtual();
			}
			teste.verJogadores();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

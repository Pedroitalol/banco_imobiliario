package trabalho_PDS_v1;

import dado.DadoView;
import jogadores.JogadoresAgregacaoView;
import casa.CasaAgregacao;
import casa.CasaImpostos;
import casa.CasaLucros;
import casa.CasaPropriedade;

public class Index {
	public static void main(String[] args) {
		DadoView dadoView = new DadoView();

		dadoView.jogaDados();

		try {
			JogadoresAgregacaoView teste = new JogadoresAgregacaoView();
			CasaAgregacao casas = new CasaAgregacao();

			teste.prepararJogo();
			teste.adicionarJogador();
			teste.adicionarJogador();
			casas.addCasa(new CasaLucros(200));
			casas.addCasa(new CasaImpostos(200));
			casas.addCasa(new CasaPropriedade("Casa da mãe joana", 200, 20));

			casas.executaAcao(2, teste.retronaControllerJogador(), "1");
			casas.executaAcao(2, teste.retronaControllerJogador(), "2");

			teste.verJogadores();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

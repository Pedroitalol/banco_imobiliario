package casa;

import jogadores.IJogadoresAgregacaoController;
import jogadores.JogadorModel;
import java.util.Scanner;

public class CasaPropriedade implements ICasa{
	String nomePropriedade;
	int valorPropriedade;
	int valorAluguel;
	JogadorModel donoDaPropriedade;
	Scanner terminal;

	public CasaPropriedade(String nome, int valorPropriedade, int valorAluguel) {
		this.nomePropriedade = nome;
		this.valorPropriedade = valorPropriedade;
		this.valorAluguel = valorAluguel;
		this.donoDaPropriedade = null;
		this.terminal = new Scanner(System.in);
	}

	public void executaAcao(IJogadoresAgregacaoController jogadores, String pecaJogadorAtual) {
		// ou paga aluguel para o dono, ou pode comprar essa propriedade
		JogadorModel jogadorAtual = jogadores.retornaJogador(pecaJogadorAtual);
		if(this.donoDaPropriedade == null){
			// pergunta se quer comprar
			System.out.println("Deseja comprar essa propriedade? s/n");
			String peca = this.terminal.nextLine();
			if(peca.equals("s")){
				jogadorAtual.debitarDinheiro(valorPropriedade);
				this.donoDaPropriedade = jogadorAtual;
			}else if(peca.equals("n")){
				// passa a vez sem fazer nada
			}else{
				// dá erro:
				throw new IllegalArgumentException("Entrada invalida!");
			}
		}else{
			// paga aluguel
			jogadorAtual.debitarDinheiro(valorAluguel);
			this.donoDaPropriedade.adicionarDinheiro(valorAluguel);
		}
	}
}

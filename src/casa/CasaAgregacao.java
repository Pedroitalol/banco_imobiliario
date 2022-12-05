package casa;

import java.util.ArrayList;
import jogadores.IJogadoresAgregacaoController;

public class CasaAgregacao {
	private ArrayList<ICasa> casas;

	public CasaAgregacao(){
		this.casas = new ArrayList<ICasa>();
	}

	public void executaAcao(int numeroDaCasa, IJogadoresAgregacaoController jogadores, String pecaJogadorAtual){
		this.casas.get(numeroDaCasa).executaAcao(jogadores, pecaJogadorAtual);
	}

	public void addCasa(ICasa casa){
		this.casas.add(casa);
	}
}

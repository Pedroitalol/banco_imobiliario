package trabalho_PDS_v1;


import dado.DadoView;
import jogadores.JogadoresAgregacaoView;

public class Index {
	public static void main(String[] args) {
		DadoView dadoView = new DadoView();
		
		dadoView.jogaDados();
		
		
		try {
			JogadoresAgregacaoView teste = new JogadoresAgregacaoView();
			teste.prepararJogo();
			teste.adicionarJogador();
			teste.verJogadores();
			teste.adicionarJogador();
			teste.verJogadores();
			teste.adicionarJogador();
			teste.verJogadores();
			teste.removerJogador();
			teste.verJogadores();
			
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
		
	}
}

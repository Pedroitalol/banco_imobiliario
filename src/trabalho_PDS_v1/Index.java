package trabalho_PDS_v1;


import dado.DadoView;
import jogadores.JogadoresAgregacaoView;
import casa.CasaAgregacao;
import casa.CasaImpostos;
import casa.CasaLucros;

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
			casas.addCasa(new CasaLucros());
			casas.addCasa(new CasaImpostos());
			
			casas.executaAcao(0, teste.retornaJogador("1"));
			casas.executaAcao(1, teste.retornaJogador("2"));
			
			teste.verJogadores();
	    } catch (Exception e) {
	      	System.out.println(e.getMessage());
	    }
	}
}

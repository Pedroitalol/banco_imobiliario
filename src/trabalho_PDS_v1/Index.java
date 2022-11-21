package trabalho_PDS_v1;

import java.util.ArrayList;

import dado.DadoView;
import jogadores.JogadorModel;
import jogadores.JogadoresAgragacao;

public class Index {
	public static void main(String[] args) {
		DadoView dadoView = new DadoView();
		
		dadoView.jogaDados();
		
		ArrayList<JogadorModel> jogadoresAtuais = new ArrayList<JogadorModel>();
		jogadoresAtuais.add(new JogadorModel(1000));
		jogadoresAtuais.add(new JogadorModel(2000));
		jogadoresAtuais.add(new JogadorModel(3000));
		jogadoresAtuais.add(new JogadorModel(4000));
		
		
		try {
			JogadoresAgragacao coisa = new JogadoresAgragacao(4, jogadoresAtuais);
			coisa.definirJogadorInicial(1);
			coisa.criarInterador();
			
			
			coisa.interadorJogadores.jogadorAtual();
			coisa.interadorJogadores.proximoJogador();
			coisa.interadorJogadores.proximoJogador();
			coisa.interadorJogadores.proximoJogador();
			coisa.interadorJogadores.proximoJogador();
			coisa.interadorJogadores.proximoJogador();
			coisa.interadorJogadores.proximoJogador();
			coisa.interadorJogadores.proximoJogador();
			coisa.interadorJogadores.proximoJogador();
	    } catch (Exception e) {
	      System.out.println(e.getMessage());
	    }
		
	}
}

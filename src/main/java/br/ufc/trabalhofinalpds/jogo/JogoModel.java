package br.ufc.trabalhofinalpds.jogo;

import br.ufc.trabalhofinalpds.jogadores.JogadorModel;
import br.ufc.trabalhofinalpds.jogadores.JogadoresAgregacaoController;

import java.util.Map;

import br.ufc.trabalhofinalpds.factoryBancoIM.*;

public class JogoModel {
    private JogadoresAgregacaoController jogadorController;
    private  IFactoryBI fabrica;
    private ITabuleiroType tabuleiro;
    private int quantidadeJogadores;
    private Map<Integer, JogadorModel> relacao;

    public JogoModel (){
        this.jogadorController = new JogadoresAgregacaoController();

        this.tabuleiro = this.fabrica.createBI(1, jogadorController.retornaDado());
    }

    // pre condições: precisar já estar com os jogadores definidos
    public String iniciaJogo() {
		this.jogadorController.definirJogadorInicial();
		if(this.jogadorController.retornaSePodeIniciarJogo()){
			this.jogadorController.criarIterador();
            JogadorModel jogadorAtual = this.jogadorController.retornaJogadorAtual();
            
			return jogadorAtual.retornaPecaDoJogador();
		}else{
			return "Algo impediu a criação do jogo, numero de jogadores invalido!";
		}
	}

    public void defineQuantidadeJogadores(int quantidade){
        this.quantidadeJogadores = quantidade;
    }

    public void adicionaJogadores() {
        String[] pecas = {"Verde", "Vermelho", "Amarelo", "Azul", "Roxo", "Laranja"};
        for (int i = 0; i < this.quantidadeJogadores; i++) {
            this.jogadorController.adicionarJogador(pecas[i]);
        }
    }

    // 
    public void avancarRodada(){

        JogadorModel jogadorAtual =  this.jogadorController.retornaJogadorAtual();

        

    }



    
}

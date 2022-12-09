package br.ufc.trabalhofinalpds.jogo;

import br.ufc.trabalhofinalpds.jogadores.JogadoresAgregacaoView;
import br.ufc.trabalhofinalpds.factoryBancoIM.*;
public class JogoModel {
    private JogadoresAgregacaoView jogadores;
    private  IFactoryBI fabrica;
    private ITabuleiroType tabuleiro;

    public JogoModel (){
        this.jogadores = new JogadoresAgregacaoView();

        jogadores.prepararJogo();

        this.tabuleiro = this.fabrica.createBI(1, jogadores.retornaDado());
    }

    public void adicionaJogador(){
        this.jogadores.adicionarJogador();
    }

    
}

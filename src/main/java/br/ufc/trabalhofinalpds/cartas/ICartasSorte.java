package br.ufc.trabalhofinalpds.cartas;

import br.ufc.trabalhofinalpds.jogadores.IIteradorJogadores;
import br.ufc.trabalhofinalpds.jogadores.IJogadoresAgregacaoController;

public interface ICartasSorte {
    public void efeitoEspecial(IJogadoresAgregacaoController jogador, String pecaJogadorAtual);
}

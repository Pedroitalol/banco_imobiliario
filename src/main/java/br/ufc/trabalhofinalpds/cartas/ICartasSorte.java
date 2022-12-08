package br.ufc.trabalhofinalpds.cartas;

import br.ufc.trabalhofinalpds.jogadores.IIteradorJogadores;
import br.ufc.trabalhofinalpds.jogadores.IJogadoresAgregacaoController;
import br.ufc.trabalhofinalpds.jogadores.JogadorModel;

public interface ICartasSorte {
    public void efeitoEspecial(JogadorModel jogadorAtual);
}

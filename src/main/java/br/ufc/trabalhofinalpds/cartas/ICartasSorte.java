package br.ufc.trabalhofinalpds.cartas;

import br.ufc.trabalhofinalpds.jogadores.JogadorModel;

public interface ICartasSorte {
    public void sorte(JogadorModel jm, int dinheiroMais);

    public void azar(JogadorModel jm, int dinheiroMenos);
}

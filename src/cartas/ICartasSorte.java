package cartas;

import jogadores.JogadorModel;

public interface ICartasSorte {
    public void sorte(JogadorModel jm, int dinheiroMais);

    public void azar(JogadorModel jm, int dinheiroMenos);
}

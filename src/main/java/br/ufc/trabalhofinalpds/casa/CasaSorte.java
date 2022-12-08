package br.ufc.trabalhofinalpds.casa;

import br.ufc.trabalhofinalpds.cartas.CartasSorte;
import br.ufc.trabalhofinalpds.cartas.ICartasSorte;
import br.ufc.trabalhofinalpds.jogadores.IJogadoresAgregacaoController;

import java.util.Random;
import br.ufc.trabalhofinalpds.jogadores.JogadorModel;

public class CasaSorte implements ICasa{
	ICartasSorte cartaSortReves = new CartasSorte();

	public void executaAcao(IJogadoresAgregacaoController jogadores, String pecaJogadorAtual) {
		cartaSortReves.efeitoEspecial(jogadores, pecaJogadorAtual);

	}
}

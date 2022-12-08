package br.ufc.trabalhofinalpds.cartas;

import br.ufc.trabalhofinalpds.jogadores.IIteradorJogadores;

public class CartasSorte implements ICartasSorte {
    IIteradorJogadores iJogador;

    GenerateRandomMoney GRM = new GenerateRandomMoney(); // seleciona um valor aleatório dentre os especificados na
                                                         // classe. Falta capturar esse valor para mostrar na tela.
    int randomMoney = GRM.returnMoneyRandomly();

    public void receba() {
        iJogador.jogadorAtual().adicionarDinheiro(randomMoney); // falta testar

    }

    public void pague() {
        iJogador.jogadorAtual().debitarDinheiro(randomMoney); // falta testar
    }
}
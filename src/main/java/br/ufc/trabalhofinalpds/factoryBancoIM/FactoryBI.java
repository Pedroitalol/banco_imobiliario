package br.ufc.trabalhofinalpds.factoryBancoIM;

import br.ufc.trabalhofinalpds.Tabuleiro.TabuleiroPadrao;

public class FactoryBI implements IFactoryBI{
    //para futuras implementações de novos tipos de tabuleiros.

    public ITabuleiroType createBI(int type){
        ITabuleiroType tabuleiro;
        if(type == 1){
            tabuleiro = new TabuleiroPadrao();
        }
        else {
            return null;
        }
        return tabuleiro;
    }
}

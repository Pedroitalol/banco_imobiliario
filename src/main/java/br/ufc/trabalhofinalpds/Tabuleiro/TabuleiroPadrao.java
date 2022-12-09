package br.ufc.trabalhofinalpds.Tabuleiro;

import br.ufc.trabalhofinalpds.factoryBancoIM.ITabuleiroType;

public class TabuleiroPadrao implements ITabuleiroType {
    //para futuras implementações de novos tipos de tabuleiros.
    @Override
    public int umTabuleiroQualquer() {
        return 1;
    }
}

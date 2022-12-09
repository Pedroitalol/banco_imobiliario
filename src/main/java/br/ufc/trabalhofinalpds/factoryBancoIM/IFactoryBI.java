package br.ufc.trabalhofinalpds.factoryBancoIM;

public interface IFactoryBI {
    //para futuras implementações de novos tipos de tabuleiros.
    public ITabuleiroType createBI(int type);
}

package br.ufc.trabalhofinalpds.Tabuleiro;

import java.util.ArrayList;

import br.ufc.trabalhofinalpds.casa.*;
import br.ufc.trabalhofinalpds.dado.DadoController;
import br.ufc.trabalhofinalpds.factoryBancoIM.ITabuleiroType;

public class TabuleiroPadrao implements ITabuleiroType {
    //para futuras implementações de novos tipos de tabuleiros.
    private ArrayList<ICasa> casas;
    private DadoController dado;

    public TabuleiroPadrao(DadoController dado){
        //aqui cria as casas:
        this.casas = new ArrayList<ICasa>();

        casas.add(new CasaPropriedade("Leblon", 100, 6));
        casas.add(new CasaSorte());
        casas.add(new CasaPropriedade("Av. Presidente Vargas", 60, 2));
        casas.add(new CasaPropriedade("Av. Nossa Sr. de Copacabana", 60, 4));
        casas.add(new CasaCompanhia(dado, 150));
        casas.add(new CasaSorte());
        casas.add(new CasaPropriedade("Av. Nossa Sr. de Copacabana", 60, 4));
        
    }

    public int umTabuleiroQualquer() {
        return 1;
    }
}

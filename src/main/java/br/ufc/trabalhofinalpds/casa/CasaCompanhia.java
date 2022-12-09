package br.ufc.trabalhofinalpds.casa;
import br.ufc.trabalhofinalpds.dado.DadoController;
import br.ufc.trabalhofinalpds.jogadores.JogadorModel;

public class CasaCompanhia implements ICasa {
    private DadoController dados;
    private int valorMultiplicado;

    public CasaCompanhia(DadoController dados, int valorMultiplicado){
        this.dados = dados;
        this.valorMultiplicado = valorMultiplicado;
    }
    public void executaAcao(JogadorModel jogadorAtual){
        int valorDados = dados.retornaValorSomado();
        jogadorAtual.debitarDinheiro(valorDados * this.valorMultiplicado);
    }
}

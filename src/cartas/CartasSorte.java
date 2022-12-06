package cartas;
package jogadores.IIteradorJogadores;

public class CartasSorte implements ICartasSorte {
    IIteradorJogadores iJogador;
    GenerateRandomMoney GRM; //seleciona um valor aleatório dentre os especificados na classe. Falta capturar esse valor para mostrar na tela.
    int randomMoney = GRM.returnMoneyRandomly();

    public int receba(){
        System.out.println("(teste) Recebeu: " + randomMoney);
        return iJogador.jogadorAtual().adicionarDinheiro(randomMoney);
        System.out.println("(teste) Recebeu: " + randomMoney);

    }

    public int pague(){
        return iJogador.jogadorAtual().debitarDinheiro(randomMoney);
    }
}
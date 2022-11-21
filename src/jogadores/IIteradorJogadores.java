package jogadores;

public interface IIteradorJogadores {
	public JogadorModel primeiroJogador();
	public JogadorModel proximoJogador();
	public boolean existeProximoJogador();
	public JogadorModel jogadorAtual();
}

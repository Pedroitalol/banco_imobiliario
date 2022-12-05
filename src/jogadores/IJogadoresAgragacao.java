package jogadores;

public interface IJogadoresAgragacao {
	public boolean adicionarJogador(int quantidadeInicial, String peca);
	public boolean removerJogador(String peca);
	public String verJogadores();
	public JogadorModel retornaJogadro(String peca);
}

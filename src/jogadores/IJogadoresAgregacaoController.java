package jogadores;

public interface IJogadoresAgregacaoController {
	public void adicionarJogador(String peca);
	public boolean removerJogador(String peca);
	public String verJogadores();
	public JogadorModel retornaJogador(String peca);
	public String[] retornaNomesPecas();
}

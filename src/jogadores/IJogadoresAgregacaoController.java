package jogadores;

public interface IJogadoresAgregacaoController {
	public void adicionarJogador(String peca);
	public boolean removerJogador(String peca);
	public String verJogadores();
	public JogadorModel retornaJogadro(String peca);
}

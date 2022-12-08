package br.ufc.trabalhofinalpds.jogadores;

public interface IJogadoresAgregacao extends IAgregadorJogadores{
	public boolean adicionarJogador(int quantidadeInicial, String peca);
	public boolean removerJogador(String peca);
	public String verJogadores();
	public JogadorModel retornaJogador(String peca);
	public String[] retornaNomesPecas();
	public JogadorModel retornaJogadorAtual();
	public boolean retornaSePodeIniciarJogo();
	public void definirJogadorInicial(JogadorModel jogador);
}

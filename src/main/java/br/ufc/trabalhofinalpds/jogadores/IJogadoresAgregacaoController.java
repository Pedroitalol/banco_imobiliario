package br.ufc.trabalhofinalpds.jogadores;

public interface IJogadoresAgregacaoController {
	public void adicionarJogador(String peca);
	public boolean removerJogador(String peca);
	public String verJogadores();
	public JogadorModel retornaJogador(String peca);
	public String[] retornaNomesPecas();
	public JogadorModel retornaJogadorAtual();
	public JogadorModel avancaJogadores();
	public boolean retornaSePodeIniciarJogo();
	public void criarIterador();
	public void definirJogadorInicial(JogadorModel jogador);
}

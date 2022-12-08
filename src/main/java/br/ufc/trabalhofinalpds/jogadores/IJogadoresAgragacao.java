package br.ufc.trabalhofinalpds.jogadores;

public interface IJogadoresAgragacao {
	public boolean adicionarJogador(int quantidadeInicial, String peca);
	public boolean removerJogador(String peca);
	public String verJogadores();
	public JogadorModel retornaJogador(String peca);
	public String[] retornaNomesPecas();
}

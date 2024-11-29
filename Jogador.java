public class Jogador{
	// Atributos
	public static int totalJogadores;
	public String nome;
	
	// Construtor
	public Jogador(){
		Jogador.totalJogadores++;
	}
	
	// Métodos
	public static int obterTotalJogadores(){
		return Jogador.totalJogadores;
	}
}
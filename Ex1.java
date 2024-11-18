class Livro{
	// Atributos
	String titulo;
	String autor;
	String editora;
	int anoPublicacao;
	
	// Métodos
	void mudarEditora(String editora){
		this.editora = editora;
	}
	int calcularIdade(int anoAtual){
		return anoAtual - anoPublicacao;
	}
	void imprimeInformacoes(){
		System.out.println("Titulo = " + this.titulo);
		System.out.println("Autor = " + this.autor);
		System.out.println("Editora = " + this.editora);
		System.out.println("Ano publicação = " + this.anoPublicacao);
	}
	
	// Construtor
	Livro(String titulo , String autor , int anoPublicacao){
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	Livro(){
		this.titulo = "Não disponível";
		this.autor = "Não disponível";
		this.anoPublicacao = 0000;
	}
	
}
public class Ex1{
	public static void main(String args[]){
		Livro l1 = new Livro();
		Livro l2 = new Livro("A casa amarela." , "Ana Castilho" , 2013);
		l1.imprimeInformacoes();
		l2.imprimeInformacoes();
	}
}

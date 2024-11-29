public class Livro{
	// atributos
	public String titulo;
	public String autor;
	public boolean emprestado;
	public static int totalLivros;
	public static int totalEmprestados;
	
	// métodos
	public Livro(String titulo , String autor){
		this.titulo = titulo;
		this.autor = autor;
		Livro.totalLivros++;
	}
	public void emprestar(){
		this.emprestado = true;
		Livro.totalEmprestados++;
	}
	public void devolver(){
		this.emprestado = false;
		Livro.totalEmprestados--;
	}
	public static void exibirRelatorio(){
		System.out.println("Total livros = " + Livro.totalLivros);
		System.out.println("Total emprestados = " + Livro.totalEmprestados);
	}
}
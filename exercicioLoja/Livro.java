
public class Livro extends Produto{
	private String autor;
	private String genero;
	private int numeroPaginas;

	public Livro(int id , String nome , double precoBase , String autor , String genero , int numeroPaginas){
		super(id , nome , precoBase);
		this.autor = autor;
		this.genero = genero;
		this.numeroPaginas = numeroPaginas;
	}

	public int getNumeroPaginas(){
		return this.numeroPaginas;
	}
	public String getAutor(){
		return this.autor;
	}
	public String getGenero(){
		return this.genero;
	}
	public void setNumeroPaginas(int numeroPaginas){
		this.numeroPaginas = numeroPaginas;
	}
	public String setAutor(String autor){
		return this.autor;
	}
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public double calcularPreco(){
		if(this.getNumeroPaginas()>300){
			this.setPrecoBase((this.getPrecoBase()*0.1) + this.getPrecoBase());
			return this.getPrecoBase();
		}
		else{
			return this.getPrecoBase();
		}
	}
	public void exibirDetalhes(){
		System.out.println(super(this.getNome()));
		System.out.println(super(this.getId()));
		System.out.println(super(this.getPrecoBase()));
		System.out.println(super(this.getAutor()));
		System.out.println(super(this.getGenero()));
		System.out.println(super(this.getNumeroPaginas()));
	}
}


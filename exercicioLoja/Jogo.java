public class Jogo extends Produto{
	private String categoria;
	private int idadeRecomendada;

	public Livro(int id , String nome , double precoBase , String categoria , int idadeRecomendada){
		super(id , nome , precoBase);
		this.categoria = categoria;
		this.idadeRecomendada = idadeRecomendada;
	}		

	public int getIdadeRecomendada(){
		return this.idadeRecomendada;
	}
	public String getCategoria(){
		return this.getCategoria();
	}
	public void setIdadeRecomendada(int idadeRecomendada){
		this.idadeRecomendada = idadeRecomendada;
	}
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}

	public double calcularPreco(){
		if(this.getCategoria().equals("Eletrônico")){
			this.setPrecoBase((this.getPrecoBase()*0.2) + this.getPrecoBase());
			return this.getPrecoBase();
		}
		else if(this.getCategoria().equals("Tabuleiro")){
			this.setPrecoBase((this.getPrecoBase()*0.05) + this.getPrecoBase());
			return this.getPrecoBase();
		}
		
	}


	public void exibirDetalhes(){
		System.out.println(super(this.getNome()));
		System.out.println(super(this.getId()));
		System.out.println(super(this.getPrecoBase()));
		System.out.println(super(this.getCategoria()));
		System.out.println(super(this.getIdadeRecomendada()));
	}

}

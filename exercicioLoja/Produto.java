public abstract class Produto{
	protected int id;
	protected String nome;
	protected double precoBase;
	
	public Produto(int id , String nome , double precoBase){
		this.id = id;
		this.nome = nome;
		this.precoBase = precoBase;
	}
	
	public int getId(){
		return this.id;
	}
	public String getNome(){
		return this.nome;
	}
	public double getPrecoBase(){
		return this.precoBase;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setPrecoBase(double precoBase){
		this.precoBase = precoBase;
	}

	public abstract double calcularPreco();
	public abstract void exibirDetalhes();
}

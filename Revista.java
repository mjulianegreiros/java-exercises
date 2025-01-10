public class Revista extends Produto{
	private int edicao;
	private int periodicidade;
	
	public Revista(int id , String nome , double precoBase , int edicao , int periodicidade){
		super(id , nome , precoBase);
		this.edicao = edicao;
		this.periodicidade = periodicidade;
	}	

	public int getEdicao(){
		return this.edicao;
	}
	public int getPeriodicidade(){
		return this.periodicidade;
	}
	public void setEdicao(int edicao){
		this.edicao = edicao;
	}
	public void setPeriodicidade(int periodicidade){
		this.periodicidade = periodicidade;
	}

	public double calcularPreco(){
		if(this.getPeriodicidade()==30){
			this.setPrecoBase((this.getPrecoBase()*0.15) + this.getPrecoBase());
			return this.getPrecoBase();
		}
		else if(this.getEdicao()==1){
			this.setPrecoBase((this.getPrecoBase()*0.25) + this.getPrecoBase());
			return this.getPrecoBase();
		}
	}
	
	public void exibirDetalhes(){
		System.out.println(super(this.getNome()));
		System.out.println(super(this.getId()));
		System.out.println(super(this.getPrecoBase()));
		System.out.println(super(this.getEdicao()));
		System.out.println(super(this.getPeriodicidade()));
	}
}

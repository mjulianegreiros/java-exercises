public class Vendedor extends Funcionario{
	private double comissao;

	public Vendedor(String nome, int idade, double salarioBase , double comissao){
		super(nome, idade, salarioBase);
		this.comissao = comissao;
	}
	

	public double getComissao(){
		return this.comissao;
	}
	public void setComissao(double comissao){
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario(){
		this.setSalarioBase(this.getSalarioBase() + this.getComissao());
		return getSalarioBase();
	}
	public void exibirDetalhes(){
		super.exibirDetalhes();
		System.out.println(this.getComissao());
	}
}

public class Funcionario{
	protected String nome;
	protected int idade;
	protected double salarioBase;

	public String getNome(){
		return this.nome;
	}
	public int getIdade(){
		return this.idade;
	}
	public double getSalarioBase(){
		return this.salarioBase;
	}
	public void setSalarioBase(double salarioBase){
		this.salarioBase = salaraioBase;
	}
	
	public double calcularSalario(){
		return this.salarioBase;
	}
	public void exibirDetalhes(){
		System.out.println(this.getNome());
		System.out.println(this.getIdade());
		System.out.println(this.getSalarioBase());
	}
}
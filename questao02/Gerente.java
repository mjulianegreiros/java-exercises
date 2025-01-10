public class Gerente extends Funcionario{
	protected String departamento;
	
	public Gerente(String nome, int idade, double salarioBase, String departamento){
		super(nome, idade, salarioBase);
		this.departamento = departamento;
	}

	public String getDepartamento(){
		return this.departamento;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}

	@Override
	public double calcularSalario(){
		this.setSalarioBase(this.getSalarioBase()*0.2 + this.getSalarioBase());
		return getSalarioBase();
	}
	public void exibirDetalhes(){
		super.exibirDetalhes();
		System.out.println(this.getDepartamento());
	}
}

class Cliente{
	// Atributos
	String nome;
	int cpf;
	String endereco;
	
	// Setters e getters
	void setNome(String nome){
		this.nome = nome;
	}
	void setCpf(int cpf){
		this.cpf = cpf;
	}
	void setEndereco(String endereco){
		this.endereco = endereco;
	}
	String getNome(){
		return this.nome;
	}
	int getCpf(){
		return this.cpf;
	}
	String getEndereco(){
		return this.endereco;
	}
	
	// Métodos
	void atualizarEndereco(String endereco){
		this.setEndereco(endereco);
	}
	
}

public class Ex2{
	public static void main(String args[]){
		Cliente c1 = new Cliente();
		c1.setNome("Joãozinho da Pizza");
		c1.setCpf(76543211);
		c1.setEndereco("Rua das Salcichas, 221, Centro");
		System.out.println("Nome = " + c1.getNome());
		System.out.println("Cpf = " + c1.getCpf());
		System.out.println("Endereço = " + c1.getEndereco());
		c1.atualizarEndereco("Rua da águas, 332 , Queiroz Dantas");
		System.out.println("Endereço = " + c1.getEndereco());
	}
}

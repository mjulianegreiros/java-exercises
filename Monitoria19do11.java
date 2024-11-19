class ContaBancaria{
	// atributos
	private String numeroConta;
	private String titular;
	private double saldo;
	// getters e setters
	public String getNumeroConta(){
		return numeroConta;
	}
	public String getTitular(){
		return titular;
	}
	public void setNumeroConta(String numeroConta){
		this.numeroConta = numeroConta;
	}
	public void setTitular(String titular){
		this.titular = titular;
	}
	// metodos
	public void deposito(double valor){
		this.saldo += valor; 
	}
	public void sacar(double valor){
		this.saldo -= valor; 
	}
	public void exibirInfo(){
		System.out.printf("Titular = %s\nN° Conta = %s\nSaldo = %f" , this.getTitular() , this.getNumeroConta() , this.saldo);
	}
	// Construtor
	public ContaBancaria(String numeroConta, double saldo, String titular){
		this.setNumeroConta(numeroConta);
		this.setTitular(titular);
		this.saldo = saldo;
		
	}
	
}
public class Monitoria19do11{
	public static void main(String args[]){
		// Coding Dojo
		// Questão 1
		ContaBancaria c1 = new ContaBancaria("221987" , 200 , "Ana Clara Anjos Pereira");
		c1.exibirInfo();
		
		
		
		
		
		
		
	}
}


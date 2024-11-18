class ContaBancaria{
	// Atributos
	private String titular;
	private double saldo;
	
	// Getters e setters
	String getTitular(){
		return this.titular;
	}
	double getSaldo(){
		return this.saldo;
	}
	void setTitular(String titular){
		this.titular = titular;
	}
	void setSaldo(double saldo){
		this.saldo = saldo;
	}
	// Construtor
	ContaBancaria(String titular , double saldo){
		setTitular(titular);
		setSaldo(saldo);
	}
	// Métodos
	void printInf(){
		System.out.println("Titular: " + getTitular());
		System.out.println("Saldo: " + getSaldo());
	}
	void deposito(double valor){
		setSaldo(getSaldo() + valor);
	}
	void saque(double valor){
		setSaldo(getSaldo() - valor);
	}
	
}
class Triangulo{
	// Atributos
	float l1 , l2 , l3;
	boolean equilatero , escaleno , isosceles;
	// Construtor
	Triangulo(float l1 , float l2 , float l3){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.equilatero = false;
		this.escaleno = false;
		this.isosceles = false;
	}
	// Método
	void tipoTri{
		if(this.l1==this.l2&&this.l2==this.l3){
			this.equilatero = true;
		}
		else if()
	}
}

public class Ex3{
	public static void main(String args[]){
		/*ContaBancaria c = new ContaBancaria("Ana" , 123);
		c.deposito(300);
		c.saque(150);
		c.printInf();*/
		
	}
}

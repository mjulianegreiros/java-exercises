public class Q3{
	public static void main(String args[]){
		ContaBancaria c1 = new ContaBancaria();
		c1.depositar(50);

		try{
			if(!(c1.sacar(10))){
				throw new InsufficientFundsException("Saldo insuficiente para saque.");
			}
		}catch(InsufficientFundsException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
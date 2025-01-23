public class ContaBancaria{
	private double valor;

	public void depositar(double vlr){
		this.valor += vlr;
	}
	public boolean sacar(double vlr){
		if(this.valor<vlr){
			return false;
		}
		this.valor-=vlr;
		return true;
	}
}
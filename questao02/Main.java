public class Main{
	public static void main(String[] args){
		Gerente gerente = new Gerente("George", 50, 6000);
		Vendedor vendedor = new Vendedor("Valeria", 20, 1400);
		
		System.out.println("Dados do gerente:\n");
		//Gerente
		gerente.calcularSalario();
		gerente.exibirDetalhes();
	
		System.out.println("Dados do vendedor:\n");
		//Vendedor
		vendedor.calcularSalario();
		vendedor.exibirDetalhes();
		
			
	}
}

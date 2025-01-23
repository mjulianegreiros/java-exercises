import java.util.Scanner;

public class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu email: ");
		String email = sc.nextLine();
		ReceberEmail email1 = new ReceberEmail(email);
		
		/*
		QUESTÃO 1
		boolean temArroba = email.contains("@");
		boolean temDotCom = email.endsWith(".com");
		*/
		
		
		try{
			if(!(email1.validarEmail())){
				throw new InvalidEmailFormatException("O email nao contem os elementos necessarios.");
			}
		}catch(InvalidEmailFormatException e){
			System.out.print("Email invalido:" + e.getMessage());
		}
		
		
	}
}
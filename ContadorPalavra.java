package Q12;
public class ContadorPalavra{
	public static int contaPalavra(String palavra){
		int cont=0;
		char letra;	
		for(int i = 0;i<palavra.length();i++){
			letra = palavra.charAt(i);
			if(letra == ' '){
				cont++;
			}	
		}
		return cont+1;
	}	
}


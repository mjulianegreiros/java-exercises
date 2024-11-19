import java.util.Scanner;
public class Aula07do11{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		// Questão 1
		/*int matriz1[][] = {{1 , 2} , {3 , 4}};
		int matriz2[][] = new int[2][2];
		
		int i;
		int j;
		
		for(i=0;i<matriz2.length;i++){
			for(j=0;j<matriz2[i].length;j++){
				System.out.print("Digite um valor: ");
				matriz2[i][j] = scanner.nextInt();
			}
		}	
		System.out.println("Matriz 1: ");
		for(i=0;i<matriz2.length;i++){
			for(j=0;j<matriz2[i].length;j++){
				System.out.printf("%d " , matriz1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Matriz 2: ");
		for(i=0;i<matriz2.length;i++){
			for(j=0;j<matriz2[i].length;j++){
				System.out.printf("%d " , matriz2[i][j]);
			}
			System.out.println();
		}

		int soma[][] = new int[2][2];
		for(i=0;i<matriz2.length;i++){
			for(j=0;j<matriz2[i].length;j++){
				soma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		System.out.println("Soma das matrizes: ");
		for(i=0;i<matriz2.length;i++){
			for(j=0;j<matriz2[i].length;j++){
				System.out.printf("%d " , soma[i][j]);
			}
			System.out.println();
		}*/

		// Questão 2
		/*int m , n;
		System.out.print("Digite a quantidade de linhas: ");
		m = scanner.nextInt();
		
		System.out.print("\nDigite a quantidade de colunas:");
		n = scanner.nextInt();
		
		int matriz[][] = new int[m][n];
		int i , j;

		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print("Digite um valor: ");
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		int vetor[] = new int[m*n];
		int c=0;
		for(i=0;i<matriz.length;i++){
			for(j=0;j<matriz[i].length;j++){
				vetor[c] = matriz[i][j];
				c++;
			}
			
		}

		for(i=0;i<(m*n);i++){
			System.out.printf("%d " , vetor[i]);
		}
		scanner.close();*/

		// Questão 3
		// sem looping infinito
		/*String text = new String();
		String dgt = new String();
		while(!text.equals("exit")){
			text = scanner.next();
			dgt += text + "\n";
		}	
		System.out.println(dgt);
		// com looping infinito
		/*String text = new String();
		String dgt = new String();
		while(text.equals("exit")){
			text = scanner.next();
			dgt += text + "\n";
		}	
		System.out.println(dgt);*/

		// Questão 4
		System.out.print("Digite um dia de 1 a 7: ");
		int day = scanner.nextInt();
		
		switch(day){
			case 2:
				System.out.println("Segunda-feira.");
				break;
			case 3:
				System.out.println("Terça-feira.");
				break;
			case 4:
				System.out.println("Quarta-feira.");
				break;
			case 5:
				System.out.println("Quinta-feira.");
				break;
			case 6:
				System.out.println("Sexta-feira.");
				break;	
			case 7:
				System.out.println("Sábado.");
				break;
			case 1:
				System.out.println("Domingo.");
				break;
			default:
				System.out.println("Número inválido.");

		}
		

		
		
		
		scanner.close();
	}
}

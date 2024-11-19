import java.util.Scanner;
public class Aula06do11{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);		

		// Descobrir se um número é palíndromo
		/*
		int x = scanner.nextInt();
		int xDeNovo = x;
		int r = 0;
		int inverso = 0;

		while(xDeNovo!=0){
			r = xDeNovo%10;
			inverso = inverso*10 + r;
			xDeNovo = xDeNovo/10;
		}

		if(inverso==x){
			System.out.println("É palíndromo.");
		}
		else{
			System.out.println("Não é palíndromo.");
		}*/

		/*// Questão 1
		int[] vet = new int[5];
		for(int i=0;i<4;i++){
			System.out.print("Digite um número: ");
			vet[i] = scanner.nextInt();
			System.out.println();
		}

		for(int i=0;i<4;i++){
			vet[4] += vet[i];
		}

		System.out.println("Vetor final: ");
		for(int i=0;i<5;i++){
			System.out.printf("%d " , vet[i]);
		}*/

		// Questão 2
		/*int vet[] = {99 , -10 , 100123 , 18 , -978 , 5623 , 463 , -9 , 287 , 49};
		int max=vet[0] , min=vet[0];
		
		for(int i =0;i<10;i++){
			if(vet[i]>max){
				max = vet[i];
			}
			else if(vet[i]<min){
				min = vet[i];
			}
		}

		System.out.printf("Máximo = %d\nMínimo = %d" , max , min);*/
		
		//Questão 3

		int matriz1[][] = {{1 , 2} {3 , 4}};
		int matriz2[][] = new int[2][2];
		
		int i , j;
		
		for(i=0;i<matriz2.length;i++){
			for(j=0;j<matriz2[i].length;j++){
				System.out.print("Digite um valor: ");
				matriz2[i][j] = scanner.nextInt();
			}
		}
		
		
	}	
}

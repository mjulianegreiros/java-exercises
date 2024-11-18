import java.util.Scanner;
import java.util.Random;

public class Teste{
	public static void main(String args[]){
		Scanner scanner = new Scanner("System.in");
		Random rand = new Random();
		
		int mat[][] = new int[2][3];
		int soma=0;
		
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				mat[i][j] = rand.nextInt(10) + 1;
				soma = soma + mat[i][j];
			}
		}
		System.out.println("Matriz: ");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[i].length;j++){
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Soma dos elmentos da matriz: " + soma);
	}
}

import java.util.Scanner;
import java.util.Random;

public class Monitoria1{
	public static void main(String args[]){
	// Lista 1.2
	// Questão 5
	Random rand = new Random();
	Scanner scanner = new Scanner(System.in);
	/*int[][] mat = new int[2][3];
	int s=0;
	// preenchando a matriz
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[i].length;j++){
			mat[i][j] = rand.nextInt(10) + 1;
			s = s + mat[i][j];
		}
	}
	// exibindo a matriz
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[i].length;j++){
			System.out.print(mat[i][i]+ " ");
		}
		System.out.println();
	}
	System.out.println("Soma dos elementos: = " + s); // mostrando a soma dos elementos*/
	
	// Questão 6
	/*int mat[][] = new int[3][3];
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[i].length;j++){
			if(i==j){
				mat[i][j] = 1;
			}
			else{
				mat[i][j] = 0;
			}
		}
	}
	// exibindo a matriz
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[i].length;j++){
			System.out.print(mat[i][j] + " ");
		}
		System.out.println();
	}*/
	
	// Questão 7
	/*int mat[][] = {{1 , 1 , 1} , {1 , 1 , 1} , {1 , 1, 1}};
	boolean eh = true;
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[i].length;j++){
			if(!(mat[i][j] == mat[j][i])){
				System.out.println("A matriz não é simétrica.");
				eh = false;
				break;
			}
		}
		if(eh==false){
			break;
		}
	}
	if(eh==true){
		System.out.println("A matriz é simétrica.");
	}*/
	
	// Questão 8
	int mat[][] = new int[3][3];
	int mat2[][] = new int[3][3];
	int dif[][] = new int[3][3];
	
	System.out.println("Preenchndo a matriz 1:");
	for(int i=0;i<mat.length;i++){
		for(int j=0;j<mat[i].length;j++){
			System.out.printf("Digite um valor para a posição [%d][%d]" , i , j);
			mat[i][j] = scanner.nextInt();
		}
	}
	System.out.println("Preenchndo a matriz 2:");
	for(int i=0;i<mat2.length;i++){
		for(int j=0;j<mat2[i].length;j++){
			System.out.printf("Digite um valor para a posição [%d][%d]" , i , j);
			mat2[i][j] = scanner.nextInt();
		}
	}
	
	// terminar dps
	
	}
}

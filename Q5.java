import java.util.Scanner;
public class Q5{
	public static void main(String args[]){
		Livro l[] = new Livro[3];
		Scanner s = new Scanner(System.in);			
		String a , t;

		for(int i=0;i<3;i++){
			System.out.println("Digite o nome do livro: ");
			t = s.nextLine();
			System.out.println("Digite o nome do autor: ");
			a = s.nextLine();

			l[i] = new Livro(t , a);
		}
		for(int i=0;i<3;i++){
			l[i].emprestar();
		}
		Livro.exibirRelatorio();
		l[0].devolver();
		l[2].devolver();
		for(int i=0;i<3;i++){
			l[i].exibirRelatorio();
			System.out.print("-----------------------------");
		}
		
	}
}
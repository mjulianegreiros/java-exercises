public class Q3{
	public static void main(String args[]){
		Jogador[] j = new Jogador[5];
		int q = Jogador.obterTotalJogadores();
		System.out.println(q);
		for(int i=0;i<5;i++){
			j[i] = new Jogador();
		}
		q = Jogador.obterTotalJogadores();
		System.out.println(q);
	}
}
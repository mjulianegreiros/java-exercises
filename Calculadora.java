package Q13;
public class Calculadora{
	public static int totOp;
	
	public static double adicao(double n1 , double n2){
		totOp++;
		return n1+n2;
	}
	public static double subtracao(double n1 , double n2){
		totOp++;
		return n1-n2;
	}
	public static double multiplicacao(double n1 , double n2){
		totOp++;
		return n1*n2;
	}
	public static double divisao(double n1 , double n2){
		totOp++;
		return n1/n2;
	}
}

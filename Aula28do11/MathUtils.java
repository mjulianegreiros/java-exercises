public class MathUtils{
	public static int sumCounter;
	public static int multiplyCounter;
	
	public static int sum(int a , int b){
		sumCounter++;
		return a + b;
	}
	public static int multiply(int a , int b){
		multiplyCounter++;
		return a * b;
	}
	
	public void exibirSum(){
		System.out.println("Sum Counter = " + sumCounter);
	}
	public void exibirMultiply(){
		System.out.println("Multiply Counter = " + multiplyCounter);
	}
}

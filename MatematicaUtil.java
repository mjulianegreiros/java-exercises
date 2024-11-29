public class MatematicaUtil{
	// métodos
	public static int encontrarMaximo(int[] numeros){
		int maior = numeros[0];
		for(int i=0;i<numeros.length;i++){
			if(numeros[i]>maior){
				maior = numeros[i];
			}
		}
		return maior;
	}
	public static int encontrarMinimo(int[] numeros){
		int menor = numeros[0];
		for(int i=0;i<numeros.length;i++){
			if(numeros[i]<menor){
				menor = numeros[i];
			}
		}
		return menor;
	}
}
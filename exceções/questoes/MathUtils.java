public static class MathUtils{
	public int[] findMaxInEachColumn(int[][] matriz){
		int i , j , k=0;
		int maior;
		int[] vet = new int[matriz.length];

		for(i=0;i<matriz.length;i++){
			maior = null;
			for(j=i;j<matriz[i].length;j++){
				if(matriz[i][j]>maior){
					maior = matriz[i][j];
					vet[k] = maior;
					k++;
				}
			}
		}
		
		return vet;
	}
}
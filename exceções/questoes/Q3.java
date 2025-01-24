
public class Q3{
	public static void main(String args[]){
		int[][] m = new int[2][3];
				

		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				m[i][j] = i+j;
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		
	
		int[] v = MathUtils.findMaxInEachColumn(m);
		   
		for(int i=0;i<v.length;i++){
		    System.out.print(v[i] + " ");
		}
		
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
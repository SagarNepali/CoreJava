package other;

public class MatrixAddition2D {

	public static void main(String... args){
		int [][] first = new int[3][3];
		int [][] second = new int[3][3];
		int [][] total = new int[3][3];
		/*int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};   */ 
		
		
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				first[i][j] = i+j+1;
				second[i][j] = (i+1*2)+4;
			}
		}
		
		
		printMatrix(first);
		System.out.println("=========");
		printMatrix(second);
		System.out.println("=========");
		printMatrix(addMatrix(first,second));
	}

	private static int[][] addMatrix(int[][] first, int[][] second) {
		
		int [][] ret = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				
				ret[i][j] = first[i][j] + second[i][j]; 
			}
		}
		return ret;
	}

	private static void printMatrix(int[][] first) {
		for(int i=0;i<3;i++){
			
			for(int j=0;j<3;j++){
				
				System.out.print(first[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

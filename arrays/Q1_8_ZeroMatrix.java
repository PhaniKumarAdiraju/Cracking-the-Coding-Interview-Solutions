package arrays;

public class Q1_8_ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[ ][ ] = { {0, 1, 1, 1},
				{1, 1, 0, 1},
				{1, 1, 1, 1},};
			
		System.out.println("Matrix Intially");
		printMatrix(mat, 3, 4);
	
		zeroMatrix(mat, 3, 4);
		System.out.println("zero matrix: ");
		printMatrix(mat, 3, 4);

	}
	
	public static void zeroMatrix(int mat[][], int R, int C){
		int row[] = new int[R];
		int col[] = new int[C];
		
		for(int i=0;i<R;i++){
			row[i]=1;
		}
		
		for(int i=0;i<C;i++){
			col[i]=1;
		}
		
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				if(mat[i][j]==0){
					row[i]=0;
					col[j]=0;
				}
			}
		}
		
		for(int i=0;i<R;i++){
			for(int j=0;j<C;j++){
				if(row[i]==0 || col[j]==0){
					mat[i][j]=0;
				}
			}
		}
		
		
		
	}

	public static void printMatrix(int mat[ ][ ], int R, int C)
	{
		int i, j;
		for (i = 0; i < R; i++)
		{
			for (j = 0; j < C; j++)
			{
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	
}

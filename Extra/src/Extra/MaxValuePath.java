package Extra;

public class MaxValuePath 
{
	public static void main(String args[])
	{
		int matrix[][]={{1,12,3,10},{4,15,6,3},{17,8,9,10},{11,12,23,4}};
		findMaxValuePath(matrix);
	}
	
	public static void findMaxValuePath(int[][] matrix)
	{
		int path[][] = new int[matrix.length][matrix.length];
		path[0][0]=0;
		
		for(int row=1; row<path.length; row++)
			for(int i=0; i<row; i++)
				path[row][0]+=matrix[i][0];
		
		for(int col=1; col<path.length; col++)
			for(int i=0; i<col; i++)
				path[0][col]+=matrix[0][i];
		
		for(int row=1; row<path.length; row++)
			for(int col=1; col<path.length; col++)
			{
				int a=path[row][col-1]+matrix[row][col-1];
				int b=path[row-1][col]+matrix[row-1][col];
				path[row][col] = maximum(a,b);
			}
								
		for(int row=0; row<path.length; row++)
		{
			for(int i=0; i<path.length; i++)
				System.out.print(path[row][i]+" ");
			System.out.println();
		}	
	}
	
	public static int maximum(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
}

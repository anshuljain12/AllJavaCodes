package Extra;

public class PrintSpiral 
{
	public static void main(String args[])
	{
		char[][] matrix = new char[][]{{'c','i','p','e'}, {'r', 'n', 'k', 'u'},{'u', 'o', 'w', 'o'}, {'l','e','s', 'y'}};
		printSpiral(matrix);
	}
	
	public static void printSpiral(char[][] mat)
	{
		int rows = mat.length;
		int cols = mat[0].length;
		
		int i,row=0, col=0;
		
		while(row<rows && cols>col)
		{
			for(i=cols-1;i>=col;i--)
				System.out.print(mat[row][i]);
			row++;
			
			for(i=row;i<rows;i++)
				System.out.print(mat[i][col]);
			col++;
			
			if(row<rows)
			{
				for(i=col;i<cols;i++)
					System.out.print(mat[rows-1][i]);
				rows--;
			}
			
			if(cols>col)
			{
				for(i=rows-1;i>=row;i--)
					System.out.print(mat[i][cols-1]);
				cols--;
			}
		}
	}
}

package Extra;

public class RotateImage 
{
	public static void main(String args[])
	{
		int matrix[][]={{1,2,3,0},{4,5,6,0},{7,8,9,10},{11,12,13,14}};
		rotateImage(matrix);
	}
	
	public static void rotateImage(int matrix[][])
	{
		int n = matrix.length;
		
		for(int row=0; row<n/2; row++)
		{
			for(int col=row; col<n-row-1; col++)
			{
				int offset = col - row;
				int top = matrix[row][col]; // save top
				 // left -> top
				matrix[row][col] = matrix[n-row-1-offset][row];
				 // bottom -> left
				matrix[n-row-1-offset][row] = matrix[n-row-1][n-row-1 - offset];
				// right -> bottom
				 matrix[n-row-1][n-row-1 - offset] = matrix[col][n-row-1];
				 // top -> right
				matrix[col][n-row-1] = top; // right <- saved top
			}
		}
		
		for(int row=0; row<n; row++)
		{
			System.out.println();
			for(int col=0; col<n; col++)
			{
				System.out.print(matrix[row][col]+" ");
			}
		}
	}
}

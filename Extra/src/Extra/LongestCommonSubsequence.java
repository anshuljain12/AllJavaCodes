package Extra;

public class LongestCommonSubsequence 
{
	public static void main(String args[])
	{
		char[] ch1 = "AGGTAB".toCharArray();
		char[] ch2 = "GXTXAYB".toCharArray();
		System.out.println(longestCommonSubsequence(ch1, ch1.length, ch2, ch2.length));
	}
	
	public static int longestCommonSubsequence(char[] s1, int m, char[] s2, int n)
	{
		int count[][] = new int[m][n];
		if(s1[0]==s2[0])
			count[0][0]=1;
		
		for(int i=1; i<m;i++)
			for(int j=1; j<n;j++)
			{			
				if(s1[i]==s2[j])
					count[i][j]=1+count[i-1][j-1];
				else
					count[i][j]= findMax(count[i-1][j], count[i][j-1]);
			}

		return count[m-1][n-1];
	}
	
	public static int findMax(int a, int b)
	{
		return (a>b)?a:b;
	}
}

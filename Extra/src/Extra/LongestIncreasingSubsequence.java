package Extra;

public class LongestIncreasingSubsequence 
{
	public static void main(String args[])
	{
		int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
		System.out.println(longestIncreasingSubsequence(arr));
		System.out.println(longestIncreasingSubsequenceRecursive(arr, arr.length));
	}
	
	public static int longestIncreasingSubsequence(int arr[])
	{
		if(arr.length==1)
			return 1;
		
		int lis[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++ )
		      lis[i] = 1;
		
		for(int i = 1; i < lis.length; i++)
		    for(int j = 0; j < i; j++ )
		    {
		        if( arr[i] > arr[j] && lis[i] < lis[j] + 1)
		            lis[i] = lis[j] + 1;
		    }
		
		int max=0;
		for(int i = 0; i < lis.length; i++ )
		   if (max < lis[i] )
		       max = lis[i];
		
		return max;
	}
	
	public static int longestIncreasingSubsequenceRecursive(int[] arr, int index)
	{
		if(index==0)
			return 0;
		if(index==1)
			return 1;
		
		int max=0;
		for(int i=index-2;i>=0;i--)
		{
			if(arr[i]<arr[index-1])
			{
				int lis = longestIncreasingSubsequenceRecursive(arr, i+1) +1;
				if(lis>max)
					max=lis;
			}
		}
		
		return max;
	}
}

package Extra;

public class RemoveMin 
{
	public static void main(String[] args)
	{
		int arr[] = new int[]{};
		int copy[] = new int[arr.length];
		int j=0, count=0;	
		
		if(arr.length != 0)
		{	
			int min = removeMin(arr);
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]!=min)
					copy[j++] = arr[i];
				else 
					count++;
			}
		
			for(int i=0; i<copy.length - count; i++)
				System.out.print(copy[i]+ " ");
		}	
	}
	
	public static int removeMin(int arr[])
	{	
		int min=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
}

package Extra;

public class SwapK 
{
	public static void main(String args[])
	{
		int num = 132;
		int digit = 3;
		int k = 2;
		
		int[] arr = convertToArray(num, digit);
		int[] max = getMaxNumber(arr,k);
		for(int i=0; i<max.length; i++)
			System.out.print(max[i]+ " ");
	}
	
	public static int[] convertToArray(int num, int digit)
	{
		int i=0;
		int arr[] = new int[digit];
		while(num>0)
		{
			arr[i++]=num%10;
			num=num/10;
		}
		return reverse(arr);
	}
	
	public static int[] reverse(int[] arr)
	{
		for(int i=0; i<arr.length/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return arr;
	}
	
	public static int[] getMaxNumber(int[] arr, int k)
	{
		for(int i=0; i<k; i++)
			arr = swapMinMax(arr);
		return arr;
	}
	
	public static int[] swapMinMax(int arr[])
	{
		int start=1, end=arr.length-2;
		int min_index=0, max_index=arr.length-1;
		
		while(start<=end)
		{
			if(arr[start] < arr[min_index])
				min_index = start;	
		
			if(arr[end] > arr[max_index])
				max_index = end;
			
			start++;
			end--;
		}
		
		int temp = arr[min_index];
		arr[min_index] = arr[max_index];
		arr[max_index] = temp;
		
		return arr;
	}
}

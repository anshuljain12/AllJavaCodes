package Extra;
public class SearchRotatedArray 
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{ 6, 8, 1, 2, 4, 5};
		int element = 1;
			
		int index = search(arr, element, 0, arr.length-1);
		if(index<0)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "+ index);
	}
	
	public static int searchRotatedArray(int[] arr, int ele, int start, int end)
	{
		if(arr.length == 0)
			return -1;
		
		while (start <= end) 
		{
			int mid = start + (end-start)/2;
			if (ele == arr[mid])
				return mid;
			else if (arr[start] <= arr[mid]) 
			{
				if (ele > arr[mid]) 
					start = mid+1;
				else if (ele >=arr[start]) 
					end = mid-1;
				else 
					start = mid+1;
			}
			else if(ele < arr[mid]) 
				end = mid-1;
			else if(ele <= arr[end]) 
				start = mid+1;
			else 
				end = mid - 1;
		}
		return -1;
	}
	
	public static int search(int[] arr, int ele, int start, int end)
	{
		int mid = start + (end-start)/2;
		if(end<start)
			return -1;
		
		if (ele == arr[mid])
			return mid;
		
		if(arr[start] < arr[mid])
		{
			if(ele >= arr[start] && ele <= arr[mid])
				return search(arr, ele, start, mid-1);
			else
				return search(arr, ele, mid+1, end);
		}
		else if(arr[start] > arr[mid])
		{
			if(ele >= arr[mid] && ele <= arr[end])
				return search(arr, ele, mid+1, end);
			else
				return search(arr, ele, start, mid-1);
		}
		else if(arr[start] == arr[mid])
		{
			if(arr[mid] != arr[end])
				return search(arr, ele, mid+1, end);
			else
			{
				int result = search(arr, ele, start, mid-1);
				if(result == -1)
					return search(arr, ele, mid+1, end);
				else
					return result;
			}
		}
		return -1;
	}
}

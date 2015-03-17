package Extra;

public class BinarySearch 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7,80};
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		int element = 23;
		int index = binarySearch(arr, element);
		
		if(index>=0)
			System.out.println(index);
		else
			System.out.println("Not Found");
	}
	
	public static int binarySearch(int[] arr, int ele)
	{
		int index=-1;
		if(ele>arr[arr.length-1])
			return index;
		
		if(ele<arr[0])
			return index;
		
		int mid = arr.length/2;
		if(arr[mid]==ele)
			index=mid;
		else if(arr[mid]>ele)
		{
			int left[] = new int[mid];
			for(int i=0;i<mid;i++)
				left[i]=arr[i];
			
			int search = binarySearch(left, ele);
			index = (search>=0) ? search : -1;
		}
		else
		{
			int right[] = new int[arr.length-mid];
			for(int i=mid+1;i<arr.length;i++)
				right[i-mid]=arr[i];
			
			int search = binarySearch(right, ele);
			index = (search>=0) ? mid + search : -1;
		}	
		return index;
	}
}

package Extra;

public class MergeSort 
{
	public static void main(String args[])
	{
		int arr[]= {42,23,63,344,65,78,61,79};
		int sorted[] = mergeSort(arr);
		
		for(int i=0;i<sorted.length;i++)
		{
			System.out.println(sorted[i]);
		}
	}
	
	public static int[] mergeSort(int[] arr)
	{
		if(arr.length == 1)
			return arr;
		
		int i=0, j=0, k=0;
		int mid = arr.length/2;
		
		int[] left = new int[mid];
		int[] right = new int[arr.length-mid];
				
		for(i=0;i<arr.length;i++)
		{
			if(i<mid)
				left[j++]=arr[i];
			else
				right[k++]=arr[i];
		}
		
		int[] leftSorted = mergeSort(left);
		int[] rightSorted = mergeSort(right);
		return merge(leftSorted,rightSorted);
	}
	
	public static int[] merge(int[] left, int[] right)
	{
		int i=0, j=0, k=0;
		int[] merged = new int[left.length + right.length];
		while(i<left.length && j<right.length)
		{
			if(left[i] <= right[j])
			{
				merged[k++] = left[i++];
			}
			else
			{
				merged[k++] = right[j++];
			}				
		}
		
		while(i<left.length)
		{
			merged[k++] = left[i++];
		}
		
		while(j<right.length)
		{
			merged[k++] = right[j++];
		}
		return merged;
	}
}

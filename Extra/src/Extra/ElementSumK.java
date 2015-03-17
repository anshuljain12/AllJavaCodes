package Extra;

import java.util.ArrayList;

class Pair
{
	int x;
	int y;
	
	public Pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

public class ElementSumK 
{
	public static void main(String args[])
	{
		int arr[]= {4,2,6,3,5,8,1,9,7,4};
		int sum = 12;
		int sorted[] = MergeSort.mergeSort(arr);
		/*
		ArrayList<Pair> list = findPairs(sorted, sum);		
		for(Pair p : list)
		{
			System.out.println("(" + p.x + "," + p.y + ")");
		}
		*/
		
		ArrayList<ArrayList<Integer>> list = findTriples(sorted, sum);		
		for(ArrayList<Integer> al : list)
		{	
			for(Integer i : al)
				System.out.print(i + " ");
			System.out.println();
		}
	}
	
	public static ArrayList<Pair> findPairs(int[] arr, int sum)
	{
		ArrayList<Pair> list = new ArrayList<Pair>();
		int start=0, end=arr.length-1;
		
		while(start<end)
		{
			if(arr[start]+arr[end] == sum)
			{
				Pair pair = new Pair(arr[start], arr[end]);
				list.add(pair);
				start++;
				end--;
			}
			else if(arr[start]+arr[end] > sum && start<end)
				end--;
			else if(start<end)
				start++;
		}
		return list;
	}
	
	public static ArrayList<ArrayList<Integer>> findTriples(int[] arr, int sum)
	{
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<arr.length-2; i++)
		{
			int start = i+1;
			int end = arr.length-1;
			
			while(start<end)
			{
				ArrayList<Integer> al = new ArrayList<Integer>();
				if(arr[i]+arr[start]+arr[end] == sum)
				{
					al.add(arr[i]);
					al.add(arr[start]);
					al.add(arr[end]);
					start++;
					end--;
				}
				else if(arr[i]+arr[start]+arr[end] > sum && start<end)
					end--;
				else if(start<end)
					start++;
				
				if(!al.isEmpty())
				list.add(al);
			}	
		}
		return list;
	}
}

package Extra;

import java.util.ArrayList;
import java.util.List;

public class AllSubsets 
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3};
		getSubsets(arr);
	}
	
	public static void getSubsets(int arr[])
	{
		List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		
		for(int i=0; i<Math.pow(2,arr.length);i++)
		{
			ArrayList<String> subset = new ArrayList<String>();
			if(i==0)
				subset.add("");
			else
			{
				for(int j=0;j<arr.length;j++)
				{
					if(((i>>j)&1)==1)
						subset.add(""+arr[j]);
				}
			}
			list.add(subset);
		}
		
		for(ArrayList<String> al : list)
		{	
			for(String str : al)
				System.out.print(str+" ");
			System.out.println();
		}
	}
}

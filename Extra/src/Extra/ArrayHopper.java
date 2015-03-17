package Extra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayHopper 
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		List<String> values = new ArrayList<String>();
		String value="";
		
		try
		{
			while((value=scanner.nextLine()).length()>0)
			{
				if(value.startsWith("-"))
				{
					System.out.println("Negative values not allowed.");
					System.exit(0);
				}
	            values.add(value);
	        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		int arr[] = toIntArray(values);
	    System.out.println(minHopsPath(arr));
	}
	
	public static int[] toIntArray(List<String> list)
	{
		  int[] arr = new int[list.size()];
		  for(int i = 0;i < arr.length;i++)
			  arr[i] = Integer.parseInt(list.get(i).toString());
		  return arr;
	}
	
	public static String minHopsPath(int arr[])
	{
		int idx = 0;
	    String path="0, ";
	    
	    while (true)
	    {
	        int maxReach = -1;
	        int maxIdx = idx;
	            
            for (int i = 0; i <= arr[idx]; i++)
            {
                int curIdx = idx + i;
                int reach = curIdx + arr[curIdx];
                if (reach > maxReach)
                {
                    maxReach = reach;
                    maxIdx = curIdx;
                }   
            }
            
            if (idx == maxIdx) 
            	return "failure";
            
            idx = maxIdx;
            path=path+idx+", ";
            
            if (idx >= arr.length-1) 
            	break; 
        }
    
        path=path+"out";
        return path;
	}
	
	public static int min(int x, int y) 
	{ 
		return (x < y)? x: y; 
	}
}

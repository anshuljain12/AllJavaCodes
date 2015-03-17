package Extra;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CombinationsOfString 
{
	public static void main(String args[])
	{
		String str = "abc";
		combinations(str);	
	}
	
	public static void combinations(String str)
	{
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("");
		
		if(str.length()==0)
		{
			System.out.println("");
			return;
		}
		
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch = str.charAt(i);		
			for(String s : list)
			{
				list.add(ch+s);
				System.out.println(ch+s);
			}
		}
	}
}

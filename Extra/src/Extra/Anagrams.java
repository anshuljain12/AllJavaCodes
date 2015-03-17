package Extra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class Anagrams 
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.next();
		System.out.println("Enter Second String");
		String str2 = sc.next();
		
		if(isAnagram(str1, str2))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		
		sc.close();
	}
	
	public static boolean isAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int i=0, j=0;		
		while(i<s1.length())
		{
			char ch = s1.charAt(i);
			if(!map.containsKey(ch))
				map.put(ch, Integer.valueOf(1));
			else
				map.put(ch, map.get(ch)+1);
						
			i++;				
		}
		
		while(j<s2.length())
		{
			char ch = s2.charAt(j);
			if(!map.containsKey(ch))
				return false;
			else
				map.put(ch, map.get(ch)-1);
						
			j++;				
		}
		
		Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
	    while (it.hasNext()) 
	    {
	        Map.Entry<Character, Integer> entry = it.next();
	        if(entry.getValue()!= Integer.valueOf(0))
	        	return false;
	    }
		return true;	
	}
}

package Extra;
import java.util.ArrayList;

public class PermutationsOfString 
{
	public static void main(String args[])
	{
		String str = "abcd";
		ArrayList<String> al = permute(str);
		for(String s: al)
		{
			System.out.println(s);
		}
	}
	
	public static ArrayList<String> permute(String s) 
	{
		ArrayList<String> list = new ArrayList<String>();
		if(s==null)
			return null;
		else if(s.length()==0)
		{
			list.add("");
			return list;
		}
		
		char ch = s.charAt(0);
		String remainder = s.substring(1);
		ArrayList<String> words = permute(remainder);
		for(String str: words)
		{
			for(int i=0; i<=str.length();i++)
			{
				list.add(insertCharAt(str,ch,i));
			}
		}
		return list;
	}
	
	public static String insertCharAt(String str, char ch, int i)
	{
		String prefix = str.substring(0,i);
		String suffix = str.substring(i);
		
		return prefix+ch+suffix;
	}
}

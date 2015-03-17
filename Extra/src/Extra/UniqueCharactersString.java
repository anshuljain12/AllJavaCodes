package Extra;
import java.util.Scanner;


public class UniqueCharactersString 
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		if(isUniqueCharachterString(str))
			System.out.println("Unique");
		else
			System.out.println("Not Unique");
		
		sc.close();
	}
	
	public static boolean isUniqueCharachterString(String str)
	{
		boolean[] array = new boolean[256];
		int i=0;
		
		while(i<str.length())
		{
			int ch = str.charAt(i);
			if(array[ch])
				return false;
			else
				array[ch]=true;
						
			i++;				
		}
		return true;
	}
}

package Extra;

public class ReverseWords 
{
	public static void main(String args[])
	{
		String input = "Reverse the words in the string";
		String output = reverseWords(input.toCharArray());
		System.out.println(output);
	}
	
	public static String reverseWords(char string[])
	{
		char[] str = reverse(string, 0, string.length);		
		System.out.println(str);
		int read=0, write=0;
		String out = "";
		
		while(read<str.length)
		{
			while(str[read]!=' ' && read<str.length)
			{
				if((read+1)!=str.length)
					read++;
				else
				{
					read++;
					break;
				}
			}
			
			for(int i=read-1; i>=write; i--)
				out+=str[i];
				
			out+=" ";
			write = read+1; 
			read++;
		}
		
		return out;	
	}
	
	public static char[] reverse(char str[], int start, int end)
	{
		for(int i=start; i<end/2; i++)
		{
			char temp = str[i];
			str[i] = str[end-i-1];
			str[end-i-1] = temp;
		}		
		return str;
	}
}

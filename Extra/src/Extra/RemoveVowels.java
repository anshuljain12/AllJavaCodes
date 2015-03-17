package Extra;
public class RemoveVowels 
{
	public static void main(String[] args)
	{
		String input = "";
		String output = removeVowels(input);
		System.out.println(output);
	}
	
	public static String removeVowels(String in)
	{
		if(in == null)
			return null;
		
		if(in.isEmpty())
			return in;
		
		String vowels = "AaEeIiOoUu";
	    StringBuilder builder = new StringBuilder();
	    for(char ch : in.toCharArray())
	    {
	        if(vowels.indexOf(ch) == -1)
	            builder.append(ch);
	    }
	    return builder.toString();
	}
}

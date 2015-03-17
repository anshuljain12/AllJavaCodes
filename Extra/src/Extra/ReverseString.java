package Extra;

public class ReverseString 
{
	public static void main(String args[])
	{
		String str = "Madam, I'm Adam";
		System.out.println(reverse(str));
		System.out.println(formatRGB(255, 0, 128));
	}
	
	public static String reverse(String str)
	{
		if(str==null || str.length()==0)
			return null;
		
		if(str.length()==1)
			return str;
		
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length/2;i++)
		{
			char temp = ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=temp;
		}
		return (new String(ch));
	}
	
	 public static String formatRGB ( int r, int g, int b ) {
	        return (toHex(r) + toHex(g) + toHex(b)).toUpperCase();
	    }

	    public static String toHex ( int c ) {
	        String s = Integer.toHexString ( c );
	        return ( s.length() == 1 ) ? "0" + s : s;
	    }
}

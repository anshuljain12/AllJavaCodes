package Extra;

public class Conversions 
{
	public static void main(String args[])
	{
		int num = 16;
		char[] bin = toBinary(num);
		System.out.println(bin);
		
		char[] hex = toHex(num);
		System.out.println(hex);
		
		System.out.println(toInt(bin));
	}

	public static char[] toBinary(int num)
	{
		String str = "";
		while(num > 0)
		{
			str+=num % 2;
			num=num/2;
		}
		return reverse(str);
	}
	
	public static char[] toHex(int num)
	{
		String str = "";
		while(num > 0)
		{
			int rem = num % 16;
			if(rem>=10)
				str+=(char)(64+rem-10);
			else
				str+=rem;
			num=num/16;
		}
		return reverse(str);
	}
	
	public static char[] reverse(String str)
	{
		int length = str.length();
		char ch[] = str.toCharArray();
		for(int i=0; i<length/2; i++)
		{
			char temp = ch[i];
			ch[i] = ch[length-i-1];
			ch[length-i-1] = temp;
		}
		return ch;
	}
	
	public static int toInt(char[] bin)
	{
		int num=0;	
	    for(int i=bin.length-1;i>=0;i--)
	    {
	         int digit = (bin[i]-'0');
	         num+=(int)Math.pow(2, bin.length-i-1)*digit;
	    }
	   	return num;
	}
}

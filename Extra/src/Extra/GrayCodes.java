package Extra;

public class GrayCodes 
{
	public static void main(String[] args)
	{
		int a=128;
		int b=-1;
		
		System.out.println(Integer.toBinaryString(a) + "\t");
		System.out.println(Integer.toBinaryString(b) + "\t");
		
		if(isGrayCode(a,b))
			System.out.println("Gray Codes");
		else
			System.out.println("Not gray Codes");
	}
	
	public static boolean isGrayCode(int a, int b)
	{
		if(a==b)
			return false;
		
		int xor;
		boolean flag = false;
		
		for(xor=a^b; xor!=0; xor=xor>>1)
		{
			if((xor&1) == 1)
			{
				if(flag)
					return false;
				else
					flag=true;
			}				
		}
		return true;
	}
}
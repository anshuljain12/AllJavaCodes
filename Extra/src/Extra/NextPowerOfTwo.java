package Extra;

public class NextPowerOfTwo 
{
	public static void main(String[] args)
	{
	  int num = 127;
	  int result = findNextPowerOfTwo(num);
	  System.out.println(result);
	}
	
	public static int findNextPowerOfTwo(int num)
	{
		int count=0;
		int index=0;
		for(int i=num; i>0; i=i>>1)
		{
			if((i & 1) == 1)
			{
				index=count;
			}
			count++;
		}
		
		int next = (int)Math.pow(2,index+1);
		return next;
	}
}

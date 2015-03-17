package Extra;

public class ParanthesisCombination 
{
	public static void main(String args[])
	{
		int count=3;
		char[] str = new char[count*2];
		countParanthesis(3,3,str,0);
	}
	
	public static void countParanthesis(int left, int right, char[] str, int index)
	{
		if(left<0 || left>right)
			return;
		
		if(left==0 && right==0)
			System.out.println(str);
		else
		{
			if(left>0)
			{
				str[index]='(';
				countParanthesis(left-1, right, str, index+1);
			}
			
			if(left<right && right>0)
			{
				str[index]=')';
				countParanthesis(left, right-1, str, index+1);
			}
		}
	}	
}

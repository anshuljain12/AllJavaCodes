package Extra;

public class Fibonacci 
{
	public static void main(String args[])
	{
		int n=5;
		int fibIterative = fibonacciIterative(n);
		System.out.println(fibIterative);
		
		int fibRecursive = fibonacciRecursive(n);
		System.out.println(fibRecursive);
		
		int fibDP = fibonacciDP(n);
		System.out.println(fibDP);
	}
	
	public static int fibonacciIterative(int num)
	{
		int i=2, fib=0;
		if(num==0)
			fib=0;
		if(num==1)
			fib=1;
		
		int first=0;
		int second=1;
		while(i<=num)
		{
			fib=first+second;
			
			first = second;
			second=fib;
			i++;
		}
		return fib;
	}
	
	public static int fibonacciRecursive(int num)
	{
		if(num==0)
			return 0;
		if(num==1)
			return 1;
		
		return (fibonacciRecursive(num-1) + fibonacciRecursive(num-2));
	}
	
	public static int fibonacciDP(int num)
	{
		int fib[]=new int[num+1];
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<=num;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		return fib[num];
	}
}

package Extra;
import java.util.Stack;


public class MyQueue 
{
	public static Stack<Integer> s1 = new Stack<Integer>();
	public static Stack<Integer> s2 = new Stack<Integer>();
		
	public static void main(String args[])
	{	
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		enqueue(5);
		enqueue(6);
		print();
		dequeue();
		dequeue();
		print(); 
	}
	
	public static void enqueue(int ele)
	{
		s1.push(Integer.valueOf(ele));
	}
	
	public static int dequeue()
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		return s2.pop();
	}
	
	public static void print()
	{
		while(!s2.isEmpty())
		{
			System.out.println(s2.pop());
		}
	}
}

package Extra;
import java.util.Stack;


public class SortStack 
{
	public static void main(String args[])
	{
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(5);
		s1.push(1);
		s1.push(3);
		s1.push(4);
		s1.push(2);
		
		s1=sort(s1);
		while(!s1.empty())
		{
			System.out.println(s1.pop());
		}
	}
	
	public static Stack<Integer> sort(Stack<Integer> s1)
	{
		Stack<Integer> s2 = new Stack<Integer>();
		
		int ele = (Integer)s1.pop();
		s2.push(ele);
		
		while(!s1.empty())
		{
			ele = (Integer)s1.pop();
			if(ele<s2.peek())
			{
				while(ele<s2.peek() && !s2.empty())
				{
					s1.push(s2.pop());	
				}
			}
			s2.push(ele);
		}
		return s2;
	}
}

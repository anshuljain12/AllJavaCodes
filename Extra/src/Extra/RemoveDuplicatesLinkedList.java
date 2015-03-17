package Extra;
import java.util.HashSet;

public class RemoveDuplicatesLinkedList 
{
	public static void main(String args[])
	{
		int[] arr = new int[]{11, 11, 10, 11, 11};
		int i=1;
			
		Node head = new Node(arr[0]);
		Node start = new Node(0);
		start=head;
		
		while(i<arr.length)
		{
			Node node = new Node(arr[i]);
			start.next = node;
			start=start.next;
			i++;
		}
		start=head;
		
		head = removeDuplicateElements(start);
		while(head != null)
		{
			System.out.println(head.value);
			head=head.next;
		}
		/*
		int count = countOccurrences(start,11);
		System.out.println("Count: "+ count);
		*/
	}
	
	public static Node removeDuplicateElements(Node start)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		if (start==null)
			return null;
		
		Node temp = start;
		Node head = temp;
		
		set.add(start.value);
		while(start.next.next!=null)
		{
			if(set.contains(start.next.value))
			{
				start=start.next;
			}
			else
			{
				temp.next = start.next;
				temp=temp.next;
				set.add(start.next.value);
				start=start.next;
			}
			
		}
		
		if(start.next!=null)
		{
			if(set.contains(start.next.value))
				temp.next=null;
			else
				temp.next = start.next;
		}
		
		return head;
	}
	
	public static int countOccurrences(Node head, int ele)
	{
		int count =0;
		if(head==null)
			return count;
		
		while(head!=null)
		{
			if(head.value == ele)
				count++;
			head=head.next;
		}
		
		return count;
	}
}

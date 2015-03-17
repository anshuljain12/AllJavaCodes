package Extra;

public class SplitLinkedList 
{
	public static void main(String args[])
	{
		int arr[] = new int[]{1,2,3,4,5,6};
		Node head = new Node(arr[0]);
		Node start = head;
		
		for(int i=1; i<arr.length; i++)
		{
			Node temp = new Node(arr[i]);
			start.next = temp;
			start=start.next;
		}
		
		//split(head);
		alternatingSplit(head);
	}
	
	public static void split(Node head)
	{
		if(head==null)
			return;
		
		Node slow = head;
		Node fast = head;
		Node first = slow;
		
		while(fast!=null && fast.next!=null)
		{		
			if(fast.next.next==null)
			{
				break;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		
		Node last = slow.next;
		slow.next=null;
		
		while(first!=null)
		{
			System.out.print(first.value+" ");
			first=first.next;
		}
		System.out.println();
		while(last!=null)
		{
			System.out.print(last.value+" ");
			last=last.next;
		}
	}
	
	public static void alternatingSplit(Node head)
	{
		int i=3;
		if(head==null)
			return;
		
		Node odd = new Node(head.value);
		Node oddStart = odd;
		Node even = new Node();
		Node evenStart = even;
		
		if(head.next!=null)
		{
			even.value = head.next.value;
			even.next=null;
			head=head.next;
		}
		
		while(head.next!=null)
		{
			Node temp = new Node(head.next.value);
			if(i%2==1)
			{
				odd.next = temp;
				odd=odd.next;
			}
			else
			{
				even.next = temp;
				even=even.next;
			}
			head=head.next;
			i++;
		}
			
		while(oddStart!=null)
		{
			System.out.print(oddStart.value+" ");
			oddStart=oddStart.next;
		}
		System.out.println();
		while(evenStart!=null)
		{
			System.out.print(evenStart.value+" ");
			evenStart=evenStart.next;
		}		
	}	
}

package Extra;
public class RemoveOddElements 
{
	public static void main(String args[])
	{
		int[] arr = new int[]{1, 12, 13, 45, 60, 45};
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
		
		head = removeOddElements(start);
		while(head != null)
		{
			System.out.println(head.value);
			head=head.next;
		}
	}
	
	public static Node removeOddElements(Node head)
	{
		if(head==null)
			return null;
		
		Node start = new Node();
		
		while(head.value%2==1)
		{
			head=head.next;
		}
		start = head;
		
		while(start.next.next!=null)
		{
			if(start.next.value%2==1)
			{
				Node temp = new Node();
				temp = start.next;
				
				while(temp.value%2==1)
				{
					temp=temp.next;
				}
				start.next = temp;
			}
			start=start.next;
			if(start.next==null)
				break;
		}
		
		if(start.next!=null && start.next.value%2==1)
			start.next=null;
		return head;
	}
}


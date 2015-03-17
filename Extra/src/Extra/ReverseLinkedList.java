package Extra;

public class ReverseLinkedList 
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
		
		head = reverse(head);
		while(head!=null)
		{
			System.out.print(head.value+" ");
			head=head.next;
		}
	}
	
	public static Node reverse(Node head)
	{
		if(head==null)
			return null;
		
		if(head.next == null)
			return head;
		
		Node last = new Node(head.value);
		head=head.next;
		
		Node start = reverse(head);
		Node rev = start;
		while(start.next!=null)
		{
			start=start.next;
		}
		start.next = last;
		last.next = null;
	
		return rev;
	}
}

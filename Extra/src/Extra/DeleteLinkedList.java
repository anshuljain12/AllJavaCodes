package Extra;

public class DeleteLinkedList 
{
	public static Node head;
	
	public static void main(String args[])
	{
		int arr[] = new int[]{1,2,3,4,5,6};
		head = new Node(arr[0]);
		Node start = head;
		
		for(int i=1; i<arr.length; i++)
		{
			Node temp = new Node(arr[i]);
			start.next = temp;
			start=start.next;
		}
		
		int element = 6; 
		head = delete(head, element);
		while(head!=null)
		{
			System.out.println(head.value);
			head = head.next;
		}
	}
	
	public static Node delete(Node head, int ele)
	{
		if(head==null)
			return null;
		
		if(head.value == ele)
			return head.next;
		
		Node start = head;
		while(head.next.next!=null)
		{
			if(head.next.value == ele)
			{
				head.next = head.next.next;
			}
			head = head.next;
		}
		
		if(head.next.value == ele)
			head.next = null;
		
		return start;
	}
}

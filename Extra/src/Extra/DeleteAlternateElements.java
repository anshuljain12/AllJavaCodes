package Extra;

public class DeleteAlternateElements 
{
	public static void main(String[] args)
	{
		int i=1;
		
		Node previous = new Node(Integer.parseInt(args[0]));
		Node head = new Node();
		head = previous;
		while(i<args.length)
		{
			Node node = new Node(Integer.parseInt(args[i]));
			previous.next=node;
			previous=node;
			i++;
		}
		
		head = deleteAlternate(head);
		while(head.next!=null)
		{
			System.out.println(head.value);
			head=head.next;
		}
		System.out.println(head.value);
	}
	
	public static Node deleteAlternate(Node head)
	{
		int i=1;
		Node start = new Node();
		Node curr = new Node();
		start=head.next;
		curr=start;
		
		while(start.next!=null)
		{
			if(i%2==0)
			{
				curr.next=start.next;
				curr = curr.next;
			}
			i++;
			start=start.next;
		}
		i++;
		if(start.next==null && i%2==0)
			curr.next=null;
		else
			curr.next=start.next;
		
		curr=head.next;
		return curr;
	}
}

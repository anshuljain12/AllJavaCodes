package Extra;

public class SumLinkedLists 
{
	public static void main(String args[])
	{
		int arr1[] = new int[]{3,5,5};
		int arr2[] = new int[]{5,9,5};
		
		int i=1;
		Node node1 = new Node(arr1[0]);
		Node head1 =node1;
		Node node2 = new Node(arr2[0]);
		Node head2 = node2;
		
		while(i<arr1.length)
		{
			Node n = new Node(arr1[i]);
			node1.next = n;
			node1 = node1.next;
			i++;
		}
		
		i=1;
		while(i<arr2.length)
		{
			Node n = new Node(arr2[i]);
			node2.next = n;
			node2 = node2.next;
			i++;
		}
		
		Node sum = calculateSum(head1, head2);
		while(sum!=null)
		{
			System.out.println(sum.value);
			sum=sum.next;
		}
	}
	
	public static Node calculateSum(Node head1, Node head2)
	{	
		int s = head1.value+head2.value;
		Node sum = new Node(s%10);
		Node sumLL = sum;
		int carry=s/10;
		
		head1=head1.next;
		head2=head2.next;
		
		while(head1!=null && head2!=null)
		{
			s = carry+head1.value+head2.value;
			Node temp = new Node(s%10);
			carry=s/10;
			sum.next=temp;
			sum=sum.next;
			head1=head1.next;
			head2=head2.next;
		}
	
		if(carry!=0)
		{
			Node last = new Node(carry);
			sum.next=last;
		}
		
		return sumLL;
	}
}

package LinkedList;

public class ReverseALinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(4);
		displayLL(head);
		displayLL(reverseLL(head));
	}
	public static LinkedListNode reverseLL(LinkedListNode head){
		if(head==null)
			return null;
		LinkedListNode first = head;
		LinkedListNode next = head.next;
		LinkedListNode temp = null;
		while(next!=null){
			first.next = temp;
			temp = first;
			first = next;
			next = next.next;
		}
		first.next = temp;
		return first;
	}
	public static void displayLL(LinkedListNode head){
		if(head==null){
			System.out.println("null");
			return;
		}
		while(head.next!=null){
			System.out.print(head.val+"-->");
			head=head.next;
		}
		System.out.println(head.val);
	}
}

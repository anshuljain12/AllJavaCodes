package LinkedList;

import java.util.Stack;

public class CheckLLPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(2);
		head.next.next.next.next = new LinkedListNode(1);
		*/
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(2);
		head.next.next = new LinkedListNode(2);
		head.next.next.next = new LinkedListNode(1);
		
		displayLL(head);
		System.out.println(checkPalindromeStack(head));
		System.out.println(checkPalindromeReverse(head));
	}
	public static boolean checkPalindromeStack(LinkedListNode head){
		if(head == null)
			return true;
		if(head.next==null)
			return true;
		Stack<LinkedListNode> s = new Stack<LinkedListNode>();
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		while(fast!=null){
			if(fast.next!=null){
				s.push(slow);
				slow = slow.next;
				fast = fast.next.next;
			}
			else{
				slow = slow.next;
				break;
			}
		}
		while(slow!=null){
			if(slow.val!=s.pop().val)
				return false;
			slow = slow.next;
		}
		return true;
	}
	public static boolean checkPalindromeReverse(LinkedListNode head){
		if(head == null)
			return true;
		if(head.next==null)
			return true;
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		while(fast!=null){
			if(fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
			}
			else{
				break;
			}
		}
		LinkedListNode head2 = reverseLL(slow);
		//displayLL(head2);
		while(head2!=null){
			if(head.val!=head2.val)
				return false;
			head = head.next;
			head2 = head2.next;
		}
		return true;
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

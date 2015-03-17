package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode headA = new ListNode(0);
		ListNode headB = new ListNode(2);
		ListNode headC = new ListNode(5);
		headA.next = new ListNode(1);
		headB.next = new ListNode(3);
		headB.next.next = new ListNode(4);
		headB.next.next.next = headC;
		headA.next.next = headC;
		//System.out.println(getIntersectionNode(headA, headB).val);
		System.out.println(getIntersectionNode(null, null));
	}
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> s = new HashSet<>();
		while(headA!=null){
        		s.add(headA);
        		headA=headA.next;
        	}
        	while(headB!=null){
        		if(s.contains(headB))
        			return headB;
        		headB = headB.next;
        	}
	        return null;
	}
	public static ListNode findIntersectionByLength(ListNode headA, ListNode headB){
		if(headA==null || headB==null)
			return null;
		int lengthA = 0;
		int lengthB = 0;
		ListNode headAA = headA;
		ListNode headBB = headB;
		while(headAA!=null && headBB!=null){
			lengthA++;
			lengthB++;
			headAA = headAA.next;
			headBB = headBB.next;
		}
		while(headAA!=null){
			lengthA++;
			headAA = headAA.next;
		}
		while(headBB!=null){
			lengthB++;
			headBB = headBB.next;
		}
		if(lengthA>lengthB){
			for(int i=0;i<lengthA-lengthB;i++)
				headA = headA.next;
		}
		else{
			for(int i=0;i<lengthB-lengthA;i++)
				headB = headB.next;
		}
		while(headA!=null){
			if(headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}
	public static ListNode findIntersectionByCircularList(ListNode headA, ListNode headB){
		if(headA==null || headB==null)
			return null;
		int lengthA = 1;
		ListNode headAA = headA;
		ListNode headBB = headB;
		while(headAA.next!=null){
			lengthA++;
			headAA = headAA.next;
		}
		headAA.next = headA;
		while(lengthA>0){
			lengthA--;
			headBB = headBB.next;
		}
		while(headBB!=null){
			if(headB==headBB)
				return headBB;
			headB=headB.next;
			headBB=headBB.next;
		}
		return null;
	}
	public static void dispLL(ListNode head){
		while(head!=null){
			System.out.print(head.val+" -> ");
			head=head.next;
		}
	}
}

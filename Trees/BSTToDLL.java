package Trees;

public class BSTToDLL {

	/**
	 * Anshul Jain
	 * ajain89@asu.edu
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(10);
		root.right.left.left = new TreeNode(9);
		root.right.left.right = new TreeNode(15);
		root.right.right = new TreeNode(25);
		root.right.right.right = new TreeNode(40);
		root.right.right.left = new TreeNode(22);
		/*
		 * 					  8
		 * 				   / \
		 * 				  /   \
		 * 				 /	   \
		 * 				4       20
		 *  		 / \	   /  \
		 *      /   \   /	   \
		 *     3	   5 10     25
		 *    /		    /  \    / \
		 *   1 	     9	 15  22 40
		 * 
		 * */
		DLL d = bstToDll(root);
		displayDLL(d);
	}
	public static DLL bstToDll(TreeNode root){
		if(root == null)
			return null;
		DLL d = new DLL(root.val);
		DLL t = d;
		t.next = bstToDll(root.left);
		if(t.next!=null)
			t.next.prev = t;
		while(t.next!=null)
			t = t.next;
		t.next = bstToDll(root.right);
		if(t.next!=null)
			t.next.prev = t;
		return d;
	}
	public static void displayDLL(DLL d){
		while(d.next!=null){
			System.out.print(d.val+" ");
			d = d.next;
		}
		System.out.println(d.val);
		while(d.prev!=null){
			System.out.print(d.val+" ");
			d = d.prev;
		}
		System.out.println(d.val);
	}
}

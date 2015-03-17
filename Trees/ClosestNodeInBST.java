package Trees;

public class ClosestNodeInBST {

	/**
	 * Anshul Jain
	 * (ajain89@asu.edu)
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
		 *    /		     / \    / \
		 *   1 	      9	 15  22 40
		 * 
		 * */
		System.out.print(getClosestNode(root, 7).val);
	}
	public static TreeNode getClosestNode(TreeNode root, int data){
		if(root==null)
			return null;
		if(root.val==data)
			return root;
		TreeNode temp=null;
		temp = root.val>data ? getClosestNode(root.left, data) : getClosestNode(root.right, data);
		if(temp==null)
			return root;
		return Math.abs(root.val-data)<Math.abs(temp.val-data) ? root : temp;
	}
}

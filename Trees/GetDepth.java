package Trees;

public class GetDepth {

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
		 *			8
		 * 		       / \
		 * 		      /   \
		 * 		     /	   \
		 * 		    4       20
		 *  		   / \	   /  \
		 *                /   \   /    \
		 *               3     5 10     25
		 *              /       /  \    / \
		 *             1       9   15  22 40
		 * 
		 * */
		System.out.println(getDepth(root, 8,1));
	}
	public static int getDepth(TreeNode root, int data, int level){
		if(root==null)
			return 0;
		if(root.val==data)
			return level;
		int l = getDepth(root.left, data, level+1);
		if(l!=0)
			return l;
		l = getDepth(root.right, data, level+1);
		return l;
	}
}

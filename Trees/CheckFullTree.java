package Trees;

public class CheckFullTree {

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
		 *          8
		 *         / \
		 *        /   \
		 *       /     \
		 *      4       20
		 *     / \      / \
		 *    /   \    /   \
		 *   3     5 10     25
		 *  /        / \    / \
		 * 1 	      9	 15  22 40
		 * 
		 * */
		System.out.println(checkFullTree(root));
	}
	public static boolean checkFullTree(TreeNode root){
		if(root == null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		if(root.left!=null && root.right!=null)
			return (checkFullTree(root.left) && checkFullTree(root.right));
		return false;
	}
}

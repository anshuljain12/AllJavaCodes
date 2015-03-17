package Trees;

public class CountLeafNodesInBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(4);
		
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(6);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(10);
		root.right.left.left = new TreeNode(8);
		root.right.left.right = new TreeNode(15);
		root.right.right = new TreeNode(25);
		root.right.right.right = new TreeNode(40);
		root.right.right.left = new TreeNode(22);
		
		System.out.println(countLeaf(root));
	}
	public static int countLeaf(TreeNode root){
		if(root==null)
			return 0;
		if(root.left == null && root.right==null)
			return 1;
		return countLeaf(root.left) + countLeaf(root.right);
	}
}	

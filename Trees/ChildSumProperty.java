package Trees;

public class ChildrenSumProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(10);
		/*
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
		*/
		root.left = new TreeNode(8);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(2);
		System.out.println(checkSumProperty(root));
	}
	public static boolean checkSumProperty(TreeNode root){
		if(root==null)
			return true;
		if(root.left==null && root.right==null)
			return true;
		int sum=0;
		if(root.left!=null)
			sum+=root.left.val;
		if(root.right!=null)
			sum+=root.right.val;
		return (sum==root.val) && checkSumProperty(root.left) && checkSumProperty(root.right);
	}
}

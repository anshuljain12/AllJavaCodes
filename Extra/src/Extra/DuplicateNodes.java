package Extra;

public class DuplicateNodes 
{
	public static void main(String args[])
	{
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		
		n1.left = n2;
		n2.left = n4;
		n2.right = n6;
		n1.right = n3;
		n3.left = n5;
		
		duplicate(n1);
		levelOrderTraversal(n1);
	}
	
	public static void duplicate(TreeNode root)
	{
		if (root==null)
			return;
		
		duplicate(root.left);
		duplicate(root.right);
		
		TreeNode node = new TreeNode(root.value);
		TreeNode left = root.left; 
		root.left = node;
		node.left = left;
	}
	
	public static void levelOrderTraversal(TreeNode root)
	{
		if(root==null)
			return;
		
		System.out.println(root.value);
		levelOrderTraversal(root.left);
		levelOrderTraversal(root.right);
	}
}

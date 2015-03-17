package Extra;

public class LowestCommonAncestor 
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
		
		TreeNode ancestor = findLowestCommonAncestor(n1,n6,n2);
		System.out.println(ancestor.value);
	}
	
	public static TreeNode findLowestCommonAncestor(TreeNode root, TreeNode node1, TreeNode node2)
	{
		if(root == null)
			return null;
		
		TreeNode ancestor = root;
		if(covers(root.left, node1) && covers(root.left, node2))
			ancestor = findLowestCommonAncestor(root.left, node1, node2);
		
		else if(covers(root.right, node1) && covers(root.right, node2))
			ancestor = findLowestCommonAncestor(root.right, node1, node2);
		
		return ancestor;
	}
	
	public static boolean covers(TreeNode root, TreeNode node)
	{
		if(root==null || node == null)
			return false;
		
		if(root==node)
			return true;
		
		return (covers(root.left, node)||covers(root.right, node));
	}
}
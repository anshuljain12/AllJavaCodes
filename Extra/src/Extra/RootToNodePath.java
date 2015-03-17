package Extra;
import java.util.LinkedList;
import java.util.List;

public class RootToNodePath 
{
	public static void main(String[] args)
	{
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		
		n1.left = n2;
		n2.left = n4;
		n2.right = n6;
		n1.right = n3;
		n3.left = n5;
		n6.right = n7;
		
		List<TreeNode> path = findPath(n1,n6);
		for(TreeNode node : path)
		{
			System.out.print(node.value + " ");
		}	
	}
	
	public static List<TreeNode> findPath(TreeNode root, TreeNode node)
	{
		List<TreeNode> path = new LinkedList<TreeNode>();
		
		if(root==null)
			return null;
		if(root.value==node.value)
		{	
			path.add(root);
			return path;
		}
		
		List<TreeNode> leftPath = findPath(root.left,node);
		if(leftPath!=null)
		{
			leftPath.add(0, root);
			return leftPath;
		}
		
		List<TreeNode> rightPath = findPath(root.right,node);
		if(rightPath!=null)
		{
			rightPath.add(0, root);
			return rightPath;
		}
		return null;
	}
}

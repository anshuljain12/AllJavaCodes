package Extra;

import java.util.LinkedList;
import java.util.Queue;


public class DFS_BFS_Tree 
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
		
		//dfs(n1);
		bfs(n1);
	}
	
	public static void dfs(TreeNode root)
	{
		if(root==null)
			return;
		
		System.out.println(root.value);
		dfs(root.left);
		dfs(root.right);
	}
	
	public static void bfs(TreeNode root)
	{
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		
		if (root==null)
			return;
		
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode node = q.remove();
			System.out.println(node.value);
			
			if(node.left!=null)
				q.add(node.left);
			if(node.right!=null)
				q.add(node.right);
		}
		
	}
}

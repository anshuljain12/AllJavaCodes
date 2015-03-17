package Extra;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeTraversals 
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
		
		//inorder(n1);
		//preorder(n1);
		//postorder(n1);
		levelorder(n1);
	}
	
	public static void inorder(TreeNode root)
	{
			if (root==null)
			return;
		
			inorder(root.left);
			System.out.println(root.value);
			inorder(root.right);
	}
	
	public static void preorder(TreeNode root)
	{
		if (root==null)
			return;
		
		System.out.println(root.value);
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void postorder(TreeNode root)
	{
		if (root==null)
			return;
		
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.value);
	}
	
	public static void levelorder(TreeNode root)
	{
		if(root == null)
			return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			TreeNode ele = queue.remove();
			System.out.print(ele.value + " ");
			
			if(ele.left!=null)
				queue.add(ele.left);
			if(ele.right!=null)
				queue.add(ele.right);
		}
	}
}

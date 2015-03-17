package Extra;

public class InOrderSuccessor 
{
	public static void main(String args[])
	{
		TreeNode root = null;
	    root = insert(root, 50);
	    insert(root, 30);
	    insert(root, 20);
	    insert(root, 40);
	    insert(root, 70);
	    insert(root, 60);
	    insert(root, 80);
	
		TreeNode successor = null;
		successor =	inOrderSuccessor(root, 40, successor);
		if(successor!=null)
			System.out.println(successor.value);
		else
			System.out.println("Does not exist");
	}
	
	public static TreeNode inOrderSuccessor(TreeNode root, int value, TreeNode successor)
	{
		if(root==null)
			return null;
		
		TreeNode curr = root;
		
		if(value == root.value)
		{
			if(curr.right!=null)
			{
				curr = curr.right;
				while(curr.left!=null)
				{
					curr=curr.left;
				}
				successor = curr;
			}
			return successor;
		}
		
		if(value < root.value)	
			successor = inOrderSuccessor(root.left, value, root);
		else
			successor = inOrderSuccessor(root.right, value, successor);
			
		return successor;
	}
	
	public static TreeNode insert(TreeNode root, int data)
	{
		if(root == null)
		{
			TreeNode head = new TreeNode(data);
			return head;
		}
		
		if(data < root.value)
			root.left = insert(root.left, data);
		else
			root.right = insert(root.right, data);
		
		return root;
	}
}

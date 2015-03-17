package Extra;

public class CreateBinaryTreeUsingInorderPreorder 
{
	public static void main(String args[])
	{
		int preorder[] = {7,10,4,3,1,2,8,11};
		int inorder[] = {4,10,3,1,7,11,8,2};
		
		int length = preorder.length;
		TreeNode root = createTree(preorder, inorder, 0, length-1, 0);
		inOrder(root);
	}
	
	public static TreeNode createTree(int pre[], int in[], int start, int end, int curr)
	{
		if(start>end || curr>end || curr<start)
			return null;
		
		TreeNode node = new TreeNode(pre[curr]);
		curr = curr+1;
		
		if(start==end)
			return node;
		
		int index = findIndex(in, start, end, node.value);
		
		node.left = createTree(pre, in, start, index-1, curr);
		node.right = createTree(pre, in, index+1, end, curr+index);
		
		return node;
	}
	
	public static int findIndex(int in[], int start, int end, int data)
	{
		for(int i=start; i<=end; i++)
		{
			if(in[i]==data)
				return i;
		}
		return -1;
	}
	
	public static void inOrder(TreeNode root)
	{
		if(root==null)
			return;
		
		inOrder(root.left);
		System.out.println(root.value);
		inOrder(root.right);
	}
}

package Trees;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,5,1,3,11,7,8,9,4,10,6};
		BinaryTree bt=null;
		for(int i=0;i<array.length;i++){
			bt = AddAChild(bt, array[i]);
		}
		inOrderTraversal(bt);
		System.out.println();
		preOrderTraversal(bt);
		System.out.println();
		postOrderTraversal(bt);
		System.out.println();
		System.out.println(search(bt,6));
		System.out.println(search(bt,17));
		bt = delete(bt, 5);
		inOrderTraversal(bt);
		System.out.println();
		preOrderTraversal(bt);
		System.out.println();
		postOrderTraversal(bt);
		System.out.println();
	}
	public static BinaryTree AddAChild(BinaryTree bt, int data){
		BinaryTree temp=bt;
		if(bt==null){
			return new BinaryTree(data);
		}
		else
		{		
			while(true){
				if(data<temp.data){
					if(temp.left==null){
						temp.left = new BinaryTree(data);
						break;
					}
					temp=temp.left;
				}
				else
				{
					if(temp.right==null){
						temp.right = new BinaryTree(data);
						break;
					}
					temp=temp.right;
				}
			}
		}
		return bt;
	}
	public static void inOrderTraversal(BinaryTree bt){
		if(bt==null)
			return;
		inOrderTraversal(bt.left);
		System.out.print(bt.data+" ");
		inOrderTraversal(bt.right);
	}
	public static void preOrderTraversal(BinaryTree bt){
		if(bt==null)
			return;
		System.out.print(bt.data+" ");
		preOrderTraversal(bt.left);
		preOrderTraversal(bt.right);
	}
	public static void postOrderTraversal(BinaryTree bt){
		if(bt==null)
			return;
		postOrderTraversal(bt.left);
		postOrderTraversal(bt.right);
		System.out.print(bt.data+" ");
	}
	public static TreeNode searchNode(TreeNode root, int val){
		TreeNode temp = root;
		while(temp!=null && temp.val!=val){
			if(temp.val>val)
				temp = temp.left;
			else
				temp = temp.right;
		}
		return temp;
	}
	public static boolean search(BinaryTree bt, int data){
		if(bt==null)
			return false;
		if(bt.data == data)
			return true;
		else
		{
			if(data < bt.data)
				return search(bt.left, data);
			else
				return search(bt.right, data);
		}
	}
	public static TreeNode deleteNode(TreeNode root, int data){
		if(root==null)
			return null;
		if(root.val == data)
		{
			if(root.left==null && root.right==null)
				return null;
			if(root.left==null)
				return root.right;
			if(root.right==null)
				return root.left;
			TreeNode temp = root.left;
			while(temp.right!=null)
				temp = temp.right;
			int a = temp.val;
			deleteNode(root, a);
			root.val=a;
		}
		if(root.val>data)
			root.left = deleteNode(root.left, data);
		else
			root.right = deleteNode(root.right, data);
		return root;
	}
}

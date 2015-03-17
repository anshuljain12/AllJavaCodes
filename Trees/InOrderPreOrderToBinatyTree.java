package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InOrderPreOrderToBinatyTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(8);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(10);
		root.right.left.left = new TreeNode(9);
		root.right.left.right = new TreeNode(15);
		root.right.right = new TreeNode(25);
		root.right.right.right = new TreeNode(40);
		root.right.right.left = new TreeNode(22);
		/*
		 * 	  	 	 8
		 * 	        / \
		 * 	       /   \
		 * 	      /	    \
		 * 	     4       20
		 *      / \	    /  \
		 *     /   \   /	\
		 *    3	    5 10     25
		 *   /       /  \    / \
		 *  1 	    9   15  22 40
		 * 
		 * */
		inOrderTraversal(root);
		System.out.println();
		preOrderTraversal(root);
		System.out.println();
		postOrderTraversal(root);
		System.out.println();
		int[] inOrder = {1, 3, 4, 5, 8, 9, 10, 15, 20, 22, 25, 40}; 
		int[] preOrder = {8, 4, 3, 1, 5, 20, 10, 9, 15, 25, 22, 40};
		int[] postOrder = {1, 3, 5, 4, 9, 15, 10, 22, 40, 25, 20, 8};
		System.out.println(levelOrder(getBinaryTreeFromInorderPreOrder(inOrder, preOrder, 0, inOrder.length-1)));
	}
	public static int preIndex = 0;
	public static TreeNode getBinaryTreeFromInorderPreOrder(int[] inOrder, int[] preOrder, int start, int end){
		if(start > end)
			return null;
		TreeNode root = new TreeNode(preOrder[preIndex++]);
		if(start == end)
		    return root;
		int inIndex = findIndex(inOrder, start, end, root.val);
		root.left = getBinaryTreeFromInorderPreOrder(inOrder, preOrder, start, inIndex-1);
		root.right = getBinaryTreeFromInorderPreOrder(inOrder, preOrder, inIndex+1, end);
		return root;
	}
	public static int findIndex(int arr[], int start, int end, int value){
		for(int i=start; i<=end; i++){
			if(arr[i] == value)
				return i;
		}
		return -1;
	}
	public static void inOrderTraversal(TreeNode root){
		if(root==null)
			return;
		inOrderTraversal(root.left);
		System.out.print(root.val+", ");
		inOrderTraversal(root.right);
	}
	public static void preOrderTraversal(TreeNode root){
		if(root==null)
			return;
		System.out.print(root.val+", ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public static void postOrderTraversal(TreeNode root){
		if(root==null)
			return;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.val+", ");
	}
	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(q.isEmpty())
        	q.add(root);
        while(!q.isEmpty()){
        	List<Integer> temp = new LinkedList<>();
        	Queue<TreeNode> y = new LinkedList<>();
        	while(!q.isEmpty()){
        		TreeNode x = q.remove();
        		temp.add(x.val);
        		if(x.left!=null)
        			y.add(x.left);
        		if(x.right!=null)
        			y.add(x.right);
        	}
        	l.add(temp);
        	q=y;
        }
        return l;
    }
}

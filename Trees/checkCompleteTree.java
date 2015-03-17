package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class checkCompleteTree {

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
		 * 	  	 8
		 * 	        / \
		 * 	       /   \
		 * 	      /	    \
		 * 	     4       20
		 *          / \	    /  \
		 *         /   \   /	\
		 *        3	5 10     25
		 *       /       /  \    / \
		 *      1 	9   15  22 40
		 * 
		 * */
		System.out.println(levelOrder(root));
		System.out.println(checkComplete(root));
		System.out.println(countNodes(root));
	}
	public static boolean checkComplete(TreeNode root){
		return checkCompleteTreeRecurse(root, 0, countNodes(root));
	}
	public static int countNodes(TreeNode root){
		if(root==null)
			return 0;
		return (1+countNodes(root.left)+countNodes(root.right));
	}
	public static boolean checkCompleteTreeRecurse(TreeNode root, int index, int size){
		if(root==null)
			return true;
		if(index>=size)
			return false;
		return checkCompleteTreeRecurse(root.left, 2*index+1, size) && checkCompleteTreeRecurse(root.right, 2*index+2, size); 
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

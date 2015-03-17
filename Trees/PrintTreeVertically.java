package Trees;

import java.util.LinkedList;
import java.util.List;

public class PrintTreeVertically {

	/**
	 * Anshul Jain
	 * ajain89@asu.edu
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
		 * 					  8
		 * 				   / \
		 * 				  /   \
		 * 				 /	   \
		 * 				4       20
		 *  		 / \	   /  \
		 *      /   \   /	   \
		 *     3	   5 10     25
		 *    /		    /  \    / \
		 *   1 	     9	 15  22 40
		 * 
		 * */
		System.out.println(getVerticalTree(root));
	}
	public static List<List<Integer>> getVerticalTree(TreeNode root){
		if(root==null)
			return null;
		List<List<Integer>> l = new LinkedList<>();
		TreeNode temp = root;
		int i=0;
		while(temp!=null){
			i++;
			temp = temp.left;
			l.add(null);
		}
		temp = root.right;
		while(temp!=null){
			temp = temp.right;
			l.add(null);
		}
		i--;
		return verticalTree(root, i, l);
	}
	public static List<List<Integer>> verticalTree(TreeNode root, int level, List<List<Integer>> l){
		if(root==null)
			return l;
		List<Integer> a = l.get(level);
		if(a==null){
			List<Integer> b = new LinkedList<>();
			b.add(root.val);
			l.remove(level);
			l.add(level, b);
		}
		else{
			a.add(root.val);
		}
		l = verticalTree(root.left, level-1, l);
		l = verticalTree(root.right, level+1, l);
		return l;
	}
}

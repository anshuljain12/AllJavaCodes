package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MirrorOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(6);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(10);
		root.right.left.left = new TreeNode(8);
		root.right.left.right = new TreeNode(15);
		root.right.right = new TreeNode(25);
		root.right.right.right = new TreeNode(40);
		root.right.right.left = new TreeNode(22);
		System.out.println(levelOrder(root));
		System.out.println(levelOrder(mirror(root)));
	}
	public static TreeNode mirror(TreeNode root){
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()){
			TreeNode temp = s.pop();
			TreeNode x = temp.left;
			temp.left = temp.right;
			temp.right = x;
			if(temp.left!=null)
				s.push(temp.left);
			if(temp.right!=null)
				s.push(temp.right);
			
		}
		return root;
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

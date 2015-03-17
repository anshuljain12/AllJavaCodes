package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class convertToChildSumProperty {

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
		System.out.println(levelOrder(convertToChildSum(root)));
	}
	public static TreeNode convertToChildSum(TreeNode root){
		root = convertToChildSumBottomToUp(root);
		return convertToChildSumUpToBottom(root);
	}
	public static TreeNode convertToChildSumBottomToUp(TreeNode root){
		if(root==null)
			return null;
		if(root.left==null && root.right==null)
			return root;
		convertToChildSumBottomToUp(root.left);
		convertToChildSumBottomToUp(root.right);
		int sum = 0;
		if(root.left!=null)
			sum+=root.left.val;
		if(root.right!=null)
			sum+=root.right.val;
		if(root.val<sum)
			root.val = sum;
		else if(root.val>sum)
			root.left.val +=  root.val-sum;
		return root;
	}
	public static TreeNode convertToChildSumUpToBottom(TreeNode root){
		if(root==null)
			return null;
		if(root.left==null && root.right==null)
			return root;
		int sum = 0;
		if(root.left!=null)
			sum+=root.left.val;
		if(root.right!=null)
			sum+=root.right.val;
		
		if(root.val<sum)
			root.val = sum;
		else if(root.val>sum)
			root.left.val +=  root.val-sum;
		convertToChildSumBottomToUp(root.left);
		convertToChildSumBottomToUp(root.right);
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

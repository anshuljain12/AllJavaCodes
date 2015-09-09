package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		System.out.println(rightSideView(root));
	}
	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new LinkedList<Integer>();
		if (root == null)
			return res;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			int tmp = q.element().val;
			Queue<TreeNode> tmp_q = new LinkedList<TreeNode>();
			while(!q.isEmpty()) {
				TreeNode t = q.poll();
				tmp = t.val;
				if (t.left!=null)
					tmp_q.add(t.left);
				if (t.right!=null)
					tmp_q.add(t.right);
			}
			res.add(tmp);
			q = tmp_q;
		}
		return res;
	}
}

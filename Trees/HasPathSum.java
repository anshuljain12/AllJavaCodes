package Trees;

/*class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
*/
public class HasPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode head = new TreeNode(5);
		head.left = new TreeNode(4);
		head.right = new TreeNode(8);
		head.left.left = new TreeNode(11);
		head.left.left.left = new TreeNode(7);
		head.left.left.right = new TreeNode(2);
		head.right.left = new TreeNode(13);
		head.right.right = new TreeNode(4);
		head.right.right.right = new TreeNode(1);
		System.out.println(hasPathSum(head, 5));
	}
	public static boolean hasPathSum(TreeNode root, int sum){
		if(root==null)  
			return false;
    if(root.left == null && root.right==null)
      if(sum==root.val)
      	return true;
      else
      	return false;
    return(hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val));
	}
}

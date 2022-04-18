class Solution {
	public TreeNode searchBST(TreeNode root, int val) {
		TreeNode curr = new TreeNode();
		curr = root;
		while (curr != null) {
			if (val == curr.val)
				return curr;
			else if (val > curr.val)
				curr = curr.right;
			else
				curr = curr.left;
		}
		return null;
	}
}
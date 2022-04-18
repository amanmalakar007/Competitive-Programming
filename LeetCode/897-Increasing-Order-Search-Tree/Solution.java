/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
	TreeNode newTree = new TreeNode();

	public TreeNode increasingBST(TreeNode root) {
		inorder(newTree, root);
		return newTree.right;
	}

	private void inorder(TreeNode newTree, TreeNode root) {
		if (root == null)
			return;
		inorder(newTree, root.left);
		createNode(newTree, root.val);
		inorder(newTree, root.right);
	}

	private void createNode(TreeNode newTree, int val) {
		TreeNode curr = newTree;
		while (curr.right != null) {
			curr = curr.right;
		}
		curr.right = new TreeNode(val);
	}
}
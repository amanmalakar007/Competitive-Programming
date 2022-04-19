/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
class Solution {
	static List<Integer> list = new ArrayList<Integer>();
	static int i = 0;

	public static void recoverTree(TreeNode root) {
		inorder(root, list);
		Collections.sort(list);
		updateTree(root, list);
		list.clear();
		i = 0;
	}

	private static void inorder(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		inorder(root.left, list);
		list.add(root.val);
		inorder(root.right, list);
	}

	private static void updateTree(TreeNode root, List<Integer> list) {
		if (root == null)
			return;
		updateTree(root.left, list);
		root.val = list.get(i);
		i++;
		updateTree(root.right, list);
	}
}
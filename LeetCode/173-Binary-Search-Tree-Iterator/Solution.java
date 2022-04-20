class BSTIterator {
	List<Integer> list;
	int counter;

	public BSTIterator(TreeNode root) {
		list = new ArrayList<Integer>();
		counter = -1;
		inOrder(root);
	}

	public int next() {
		return list.get(++counter);
	}

	public boolean hasNext() {
		return (counter < list.size()-1);
	}

	public void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		list.add(root.val);
		inOrder(root.right);
	}
}
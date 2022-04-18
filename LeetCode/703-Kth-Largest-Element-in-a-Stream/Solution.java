class KthLargest {
	int k;
	ArrayList<Integer> list;

	public KthLargest(int k, int[] nums) {
		this.k = k;
		this.list = new ArrayList<Integer>();
		for (int i : nums) {
			this.list.add(i);
		}
		Collections.sort(this.list);
	}

	public int add(int val) {
		int pos = this.binarySearch(this.list, val, 0, this.list.size() - 1);
		this.list.add(pos, val);
		return this.list.get(this.list.size() - (this.k));
	}

	private int binarySearch(List<Integer> list, int key, int low, int high) {
		int mid = low + ((high - low) / 2);
		if (low > high)
			return mid;
		int midVal = list.get(mid);
		if (key == midVal)
			return mid;
		else if (key > midVal)
			return (binarySearch(list, key, mid + 1, high));
		else
			return (binarySearch(list, key, low, mid - 1));
	}
}
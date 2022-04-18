class Solution {
	public int lastStoneWeight(int[] stones) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i : stones) {
			list.add(i);
		}
		int size = list.size();
		while (list.size() > 1) {
			Collections.sort(list);
			int x = list.get(size - 1);
			int y = list.get(size - 2);
			if (x == y) {
				list.remove(size - 1);
				list.remove(size - 2);
			} else if (x < y) {
				list.set(size - 2, y - x);
				list.remove(size - 1);
			} else {
				list.set(size - 1, x - y);
				list.remove(size - 2);
			}
			size = list.size();
		}
		if (list.size() == 0)
			return 0;
		return list.get(0);
	}
}
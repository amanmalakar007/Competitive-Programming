class Solution {
	public List<List<Integer>> shiftGrid(int[][] grid, int k) {
		int m = grid.length;
		int n = grid[0].length;
		int len = m * n;
		int flat[] = new int[len];
		int a = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				flat[a] = grid[i][j];
				a++;
			}
		}
		k = k % len;
		int flat2[] = new int[len];
		System.arraycopy(flat, (len - k), flat2, 0, k);
		System.arraycopy(flat, 0, flat2, k, (len - k));
		a = 0;
		int temp[];
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < m; i++) {
			temp = new int[n];
			for (int j = 0; j < n; j++) {
				temp[j] = flat2[a];
				a++;
			}
			ArrayList<Integer> l = new ArrayList<Integer>();
			l.addAll(Arrays.stream(temp).boxed().collect(Collectors.toList()));
			list.add(l);
		}
		return list;
	}
}
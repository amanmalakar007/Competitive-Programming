class Solution {
	public int calPoints(String[] ops) {
		List<Integer> scores = new ArrayList<Integer>();
		int i = 0;
		for (String str : ops) {
			if (str.equals("+")) {
				scores.add(i, scores.get(i - 1) + scores.get(i - 2));
				i++;
			} else if (str.equals("D")) {
				scores.add(i, 2 * (scores.get(i - 1)));
				i++;
			} else if (str.equals("C")) {
				scores.remove(i - 1);
				i--;
			} else {
				scores.add(i, Integer.parseInt(str));
				i++;
			}
		}
		int sum = 0;
		for (int score : scores)
			sum += score;
		return sum;
	}
}
class Solution {
    public List<Integer> partitionLabels(String s) {
        int curr_max = 0, old_max = -1;
		s = s + " ";
		ArrayList<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (i > curr_max) {
				myList.add(curr_max - old_max);
				old_max = curr_max;
			}
			int pos = s.lastIndexOf(ch);
			if (pos > curr_max)
				curr_max = pos;
		}
		return myList;
    }
}
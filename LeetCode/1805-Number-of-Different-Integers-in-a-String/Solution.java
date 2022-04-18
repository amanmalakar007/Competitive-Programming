import java.math.BigDecimal;

class Solution {
	public int numDifferentIntegers(String word) {
		String arr[] = word.split("[a-z]");
		Set<BigDecimal> mySet = new HashSet<BigDecimal>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].isEmpty() == false) {
				BigDecimal bd = new BigDecimal(arr[i]);
				mySet.add(bd);
			}
		}
		return (mySet.size());
	}
}
class Solution {
	public boolean isPerfectSquare(int num) {
		long low = 1, high = num;
		return (isPerfectSquare(low, high, num));
	}

	private boolean isPerfectSquare(long low, long high, int num) {
		if (low > high)
			return false;
		long mid = low + (high - low) / 2;
		long midSquare = (long) Math.pow(mid, 2);
		if (midSquare == (long) num)
			return true;
		if (midSquare < (long) num)
			return isPerfectSquare(mid + 1, high, num);
		else
			return isPerfectSquare(low, mid - 1, num);
	}
}
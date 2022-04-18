public class Solution {
	public static int mySqrt(int x) {
		long low = 0, high = x, mid = 0;
		while (low < high) {
			mid = (low + high) / 2;
			if (high - low <= 2) {
				if (low * low < x && (low + 1) * (low + 1) > x)
					return (int) low;
				return (int) low + 1;
			}
			if (mid * mid == x)
				return (int) mid;
			else if (mid * mid > x)
				high = mid;
			else if (mid * mid < x)
				low = mid;
		}
		return (int) mid;
	}
}
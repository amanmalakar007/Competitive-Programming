class Solution {
	public static int maxArea(int[] height) {
		int leftMax = 0, rightMax = 0;
		int leftPos = -1, rightPos = -1;
		int len = height.length;
		int i = 0, j = 0, k = 0;
		int vol = 0, maxVol = 0;
		for (i = 0, j = len - 1; i < len && j >= 0; i++, j--) {
			if (height[i] * (i) >= leftMax && i != j) {
				leftMax = height[i] * (i);
				leftPos = i;
			}
			if (height[j] * (k) >= rightMax && i != j) {
				rightMax = height[j] * (k);
				rightPos = j;
			}
			k++;
		}
		for (i = leftPos; i < len; i++) {
			for (j = rightPos; j >= 0; j--) {
				vol = Math.abs(j - i) * (Math.min(height[i], height[j]));
				maxVol = vol > maxVol ? vol : maxVol;
			}
		}
		return maxVol;
	}
}
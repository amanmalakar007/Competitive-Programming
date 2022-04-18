class Solution {
	public void rotate(int[] nums, int k) {
		// rotateArr(nums,k);
		int n = nums.length;
		k = k % n;
		reverse(nums, 0, n - k - 1);
		reverse(nums, n - k, n - 1);
		reverse(nums, 0, n - 1);

	}

	public void reverse(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public void rotateArr(int[] nums, int k) {
		int n = nums.length;
		int[] result = new int[n];
		k = k % n;
		for (int i = 0; i < n; i++) {
			result[i] = nums[(n - k + i) % n];
		}
		for (int i = 0; i < n; i++) {
			nums[i] = result[i];
		}
	}
}
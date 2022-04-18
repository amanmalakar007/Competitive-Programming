class Solution {
	public void nextPermutation(int[] nums) {
		int i, min = Integer.MAX_VALUE, pos = -1;
		boolean found = false;
		for (i = nums.length - 2; i >= 0; i--) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] > nums[i] && nums[j] < min) {
					found = true;
					min = nums[j];
					pos = j;
				}
			}
			if (found) {
				int temp = nums[pos];
				nums[pos] = nums[i];
				nums[i] = temp;
				sort(nums, i + 1);
				break;
			}
		}
		if (i == -1)
			sort(nums, 0);
	}

	public void sort(int subArray[], int start) {
		for (int i = start; i < subArray.length - 1; i++) {
			for (int j = i + 1; j < subArray.length; j++) {
				if (subArray[i] > subArray[j]) {
					int temp = subArray[i];
					subArray[i] = subArray[j];
					subArray[j] = temp;
				}
			}
		}
	}
}
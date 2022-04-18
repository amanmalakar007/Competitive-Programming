class Solution {
	public int thirdMax(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] < nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		if (nums.length < 3)
			return nums[0];
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1])
				count++;
			if (count == 2)
				return (nums[i + 1]);
			if (i == nums.length - 2 && count == 1)
				return nums[0];
		}
		if (count == 0)
			return nums[0];
		return 0;
	}
}
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                nums[i] = nums[j] + nums[i];
                nums[j] = nums[i] - nums[j];
                nums[i] = nums[i] - nums[j];
            } else if (nums[i] % 2 != 0 && nums[j] % 2 != 0) {
                j++;
                continue;
            }
            j++;
            i++;
        }
        return nums;
    }
}

/*
If 1st odd, 2nd even, swap.
Else if both odd, increment 2nd only
also, increment i and j every time except when both odd.
*/
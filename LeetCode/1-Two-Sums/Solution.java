class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<Integer>();
        int ans[] = new int[2];
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(set.contains(target-nums[i]))
            {
                for(int j = 0; j < nums.length; j++)
                {
                    if(nums[j]==(target-nums[i]) && j!=i)
                    {
                        ans[0]=i;
                        ans[1]=j;
                    }
                }
            }
        }
        return ans;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            int complement = target - nums[i];
            if (map.containsKey(complement))
            {
                int ans[] = {i,map.get(complement)};
                return ans;
            }
            map.put (nums[i],i);
        }
        return null;
    }
}
class Solution {
    public boolean search(int[] nums, int target) {
        int pos = 0;
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i]>nums[i+1])
            {
                pos = i+1;
                break;
            }
        }
        int newNums[] = new int [nums.length];
        System.arraycopy(nums,pos,newNums,0,(nums.length-pos));
        System.arraycopy(nums,0,newNums,(nums.length-pos),pos);
        return (binarySearch(newNums,target));
    }
    
    public boolean binarySearch(int newNums[], int target)
    {
        int low = 0, high = newNums.length - 1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(newNums[mid]==target)
                return true;
            else if (newNums[mid]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        HashSet<Character> set = new HashSet<Character>();
        int len = s.length();
        int ans=0;
        while(right<len)
        {
            char c = s.charAt(right);
            if(set.add(c))
            {
                ans = Math.max(ans,right-left+1);
                right++;
            }
            else
            {
                while(s.charAt(left)!=c)
                {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return ans;
    }
}
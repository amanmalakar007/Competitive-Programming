//tle

class Solution {
    public String getSmallestString(int n, int k) {
        int sum = n;
		String word = "";
		while (k > sum)
		{
			if (k - sum + 1 > 26)
			{
				word = 'z' + word;
				sum = sum - 1 + 26;
			}
			else
			{
				word = (char) (k - (sum - 1) + 96) + word;
				sum = k;
			}
		}
		if (word.length() < n)
		{
			n -= word.length();
			while (n-- > 0)
			{
				word = 'a' + word;
			}
		}
		return word;
	}
}
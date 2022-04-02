//not my solution
//source: https://leetcode.com/problems/valid-palindrome-ii/discuss/391809/Java-Solutions-to-Valid-Palindrome-I-and-II-with-Explanation-(SubPalindrome-Iteration-and-Recursion)
class Solution {
    public boolean validPalindrome(String s) {
  int n = s.length();
  for (int i = 0; i < n / 2; ++i) {
    int left = i, right = n - i - 1;
    if (s.charAt(left) != s.charAt(right)) { // give a last chance
      // delete char at left
      if (validSubPalindrome(s, left + 1, right)) return true;
      // delete char at right
      return validSubPalindrome(s, left, right - 1);
    }
  }
  return true;
}

private boolean validSubPalindrome(String s, int lo, int hi) {
  int n = hi - lo + 1;
  for (int i = 0; i < n / 2; ++i) {
    int left = lo + i, right = hi - i;
    if (s.charAt(left) != s.charAt(right)) return false;
  }
  return true;
}
}
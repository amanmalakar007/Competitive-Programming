class Solution {
    int errors = 0;
    public boolean validPalindrome(String s) {
        int len = s.length();
        int i, j;
        for (i = 0, j = len - 1; i < len && j >= 0 && i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                errors++;
                if (checkPalindrome(s, i + 1, j, len))
                    return true;
                else if (checkPalindrome(s, i, j - 1, len))
                    return true;
                else
                    return false;
            }
        }
        if (errors <= 1)
            return true;
        return false;
    }

    private boolean checkPalindrome(String s, int i, int j, int len) {
        for (; i < len && j >= 0 && i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                errors++;
                return false;
            }
        }
        return true;
    }
}
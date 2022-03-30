class Solution {
    public static String convertToTitle(int n) {
        String word = "";
        while (n > 0) {
            if (n % 26 == 0) {
                word = (char)((n % 26) + 90) + word;
                n--;
            } else
                word = (char)((n % 26) + 64) + word;
            n /= 26;
        }
        return word;
    }
}
class Solution {
    public static int reverse(int x) {
        long reverse = 0;
        int lastDigit;
        boolean isNegative = false;
        final int LIMIT = 2147483647;
        if (x<0) {
            isNegative = true;
            x *= -1;
        }
        while (x > 0) {
            lastDigit = x % 10;
            reverse = (reverse * 10) + lastDigit;
            if (reverse > LIMIT)
                return 0;
            x = x / 10;
        }
        if (isNegative)
            return (int)(reverse * -1);
        return (int) reverse;
    }
}
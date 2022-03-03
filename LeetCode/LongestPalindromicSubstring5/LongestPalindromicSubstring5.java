package LongestPalindromicSubstring5;

public class LongestPalindromicSubstring5 {

	public static void main(String[] args) {
		String s = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
		System.out.println(longestPalindrome(s));
	}

	private static String longestPalindrome(String str) {
		String longestPalindrome = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int j = str.length() - 1;
			while (j < str.length()) {
				int pos = str.lastIndexOf(ch, j);
				if (pos != -1 && ((pos - i) + 1 > longestPalindrome.length())) {
					String original = str.substring(i, pos + 1);
					StringBuilder reversed = new StringBuilder(original);
					reversed.reverse();
					if (original.equals(reversed.toString())) {
						longestPalindrome = original.length() > longestPalindrome.length() ? original
								: longestPalindrome;
						break;
					} else
						j = pos - 1;
				} else
					break;
			}
		}
		if (longestPalindrome.isEmpty())
			return "" + str.charAt(0);
		return longestPalindrome;
	}
}
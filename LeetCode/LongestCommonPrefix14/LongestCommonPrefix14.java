package LongestCommonPrefix14;

import java.util.*;

public class LongestCommonPrefix14 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String[] strs = {"reflower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
		s.close();
	}

	public static String longestCommonPrefix(String[] strs) {
		String minWord = findMinLengthWord(strs);
		while (!minWord.isBlank()) {
			for (int i = 0; i < strs.length; i++) {
				String word = strs[i];
				if (!word.startsWith(minWord)) {
					minWord = minWord.substring(0,minWord.length() - 1);
					i = -1;
				}
			}
			return minWord;
		}
		return minWord;
	}

	public static String findMinLengthWord(String[] strs) {
		String minWord = "";
		int minLength = Integer.MAX_VALUE;
		for (String str : strs) {
			if (str.length() < minLength) {
				minLength = str.length();
				minWord = str;
			}
		}
		return minWord;
	}
}
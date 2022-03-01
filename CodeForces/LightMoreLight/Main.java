//link: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1051

package LightMoreLight;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			long input = s.nextLong();
			if (input != 0)
				findStateOfLastBulb(input);
			else
				break;
		}
		s.close();
	}

	private static void findStateOfLastBulb(long input) {
		System.out.println(Math.pow((long) (Math.sqrt(input)), 2) == input ? "yes" : "no");
	}
}
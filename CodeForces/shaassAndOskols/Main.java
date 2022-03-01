//link: https://codeforces.com/contest/127/problem/A

package shaassAndOskols;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // number of wires
		int[] a = new int[n + 1]; // array to hold number of birds on each wire
		for (int i = 1; i <= n; i++) {
			a[i] = s.nextInt();
		}
		int m = s.nextInt(); // number of birds shot in total
		int matrix[][] = new int[m][2];
		// taking inputs of which bird shot at which wire.
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < 2; j++)
				matrix[i][j] = s.nextInt();
		}
		for (int i = 0; i < m; i++) {
			if (matrix[i][0] > 1)
				a[matrix[i][0] - 1] += matrix[i][1] - 1;
			if (matrix[i][0] < n)
				a[matrix[i][0] + 1] += a[matrix[i][0]] - matrix[i][1];
			a[matrix[i][0]] = 0;
		}
		for (int i = 1; i < n + 1; i++) {
			System.out.println(a[i]);
		}
		s.close();
	}
}
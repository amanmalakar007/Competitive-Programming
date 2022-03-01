package PoloThePenguinAndSegments;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		double sumOfX = 0.0;
		for (int i = 0; i < n; i++) {
			Pair obj = new Pair(s.nextInt(), s.nextInt());
			sumOfX += obj.findX();
		}
		System.out.println((int)(k * (Math.ceil(sumOfX / k)) - sumOfX));
		s.close();
	}
}
 
class Pair {
	int left, right;
 
	Pair(int left, int right) {
		this.left = left;
		this.right = right;
	}
 
	int findX() {
		return (this.right - this.left) + 1;
	}
}
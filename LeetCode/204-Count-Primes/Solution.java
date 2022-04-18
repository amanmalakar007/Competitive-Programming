class Solution {
	static int limit;

	static int countPrimes(int limit) {
		int prime = 2, receive = 1, count = 0;
		if (limit <= 2)
			return 0;
		int array[] = new int[limit];
		while (receive != 0 && limit > 0) {
			count++;
			if (receive == 1)
				receive = markComposites(array, prime, limit);
			else
				receive = markComposites(array, receive, limit);
		}
		for (int i = 2; i < limit; i++) {
			if (array[i] == 0)
				count++;
		}
		return count;
	}

	static int markComposites(int array[], int prime, int limit) {
		int i, j;
		// marking composites
		for (i = 1; prime * i < limit; i++) {
			array[prime * i] = 1;
		}
		// finding next smallest prime
		for (j = (prime * 1) + 1; j <= prime * 2; j++) {
			if (j > limit - 1)
				return 0;
			if (array[j] == 0)
				return j;
		}
		return 0;
	}
}
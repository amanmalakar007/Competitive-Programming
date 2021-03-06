class Solution {
	static int grouping = 0;

	public static boolean hasGroupsSizeX(int[] deck) {
		if (deck.length < 2)
			return false;
		int counter = 0, occurence_max = 0;
		HashSet<Integer> number = new HashSet<Integer>();
		HashSet<Integer> occurrences = new HashSet<Integer>();

		for (int i = 0; i < deck.length; i++) {
			if (number.contains(deck[i]) == false) {
				number.add(deck[i]);
				for (int j = i; j < deck.length; j++) {
					if (deck[i] == deck[j])
						counter++;
				}
				if (occurence_max < counter)
					occurence_max = counter;
				occurrences.add(counter);
				counter = 0;
			}
		}

		for (int i = 2; i <= occurence_max; i++) {
			if (checkGCDExistence(occurrences, i) == 2)
				continue;
			else if (checkGCDExistence(occurrences, i) == 1)
				return true;
		}
		return false;
	}

	public static int checkGCDExistence(HashSet<Integer> occurrences, int i) {
		for (Integer o : occurrences) {
			if (o % i == 0)
				grouping = i;
			else
				return 2;
		}
		if (grouping != 0)
			return 1;
		return 0;
	}
}
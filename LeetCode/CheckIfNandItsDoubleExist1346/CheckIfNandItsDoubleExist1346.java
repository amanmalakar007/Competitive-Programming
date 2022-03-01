public class CheckIfNandItsDoubleExist1346 {
	public boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				double twice = (double) arr[j] * 2;
				double half = (double) arr[j] / 2;
				if (arr[i] == twice || arr[i] == half)
					return true;
			}
		}
		return false;
	}
}

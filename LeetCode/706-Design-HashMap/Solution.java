class MyHashMap {
	List<Integer> keys;
	List<Integer> values;

	public MyHashMap() {
		keys = new ArrayList<Integer>();
		values = new ArrayList<Integer>();
	}

	public void put(int key, int value) {
		int indexOfKey = keys.indexOf(key);
		if (indexOfKey != -1) {
			values.set(indexOfKey, value);
		} else {
			keys.add(key);
			values.add(value);
		}
	}

	public int get(int key) {
		int indexOfKey = keys.indexOf(key);
		return ((indexOfKey == -1) ? -1 : values.get(indexOfKey));
	}

	public void remove(int key) {
		int indexOfKey = keys.indexOf(key);
		if (indexOfKey != -1) {
			keys.remove(indexOfKey);
			values.remove(indexOfKey);
		}
	}
}
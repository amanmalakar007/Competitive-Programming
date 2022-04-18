class FreqStack {
	HashMap<Integer, Stack<Integer>> freqStack;
	HashMap<Integer, Integer> freqMap;

	public FreqStack() {
		freqStack = new HashMap<Integer, Stack<Integer>>();
		freqMap = new HashMap<Integer, Integer>();
	}

	public void push(int val) {
		int freq = freqMap.getOrDefault(val, 0) + 1;
		freqMap.put(val, freq);
		if (!freqStack.containsKey(freq))
			freqStack.put(freq, new Stack<Integer>());
		freqStack.get(freq).push(val);
	}

	public int pop() {
		int max = 0;
		for (int key : freqStack.keySet()) {
			max = key > max ? key : max;
		}
		int pop_value = freqStack.get(max).pop();
		if (freqStack.get(max).isEmpty())
			freqStack.remove(max);
		freqMap.put(pop_value, freqMap.get(pop_value) - 1);
		return pop_value;
	}
}

/**
 * Your FreqStack object will be instantiated and called as such: FreqStack obj
 * = new FreqStack(); obj.push(val); int param_2 = obj.pop();
 */
class MinStack {
	ArrayList<Integer> stack = null;
	ArrayList<Integer> minStack = null;

	public MinStack() {
		stack = new ArrayList<Integer>();
		minStack = new ArrayList<Integer>();
	}

	public void push(int val) {
		if (minStack.size() == 0)
			minStack.add(val);
		else if (val <= minStack.get(minStack.size() - 1))
			minStack.add(val);
		stack.add(val);
	}

	public void pop() {
		if(stack.get(stack.size() - 1).equals(minStack.get(minStack.size() - 1)))
			minStack.remove(minStack.size() - 1);
		if (stack.size() >= 0)
			stack.remove(stack.size() - 1);
	}

	public int top() {
		if (stack.size() > 0)
			return stack.get(stack.size() - 1);
		return -1;
	}

	public int getMin() {
		if (minStack.size() > 0)
			return minStack.get(minStack.size() - 1);
		return -1;
	}
}
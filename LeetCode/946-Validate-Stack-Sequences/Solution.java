class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int pos = 0;
		int key = popped[0];
		int length = pushed.length;
		for (int i = 0; i < length; i++) {
			if (pushed[i] == key) {
				pos = i;
				break;
			}
		}
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i <= pos; i++)
			stack.push(pushed[i]);
		for (int i = 0; i < length; i++) {
			if (!stack.isEmpty() && stack.peek() == popped[i])
				stack.pop();
			else if (pos < length - 1) {
				stack.push(pushed[++pos]);
				i = i - 1;
			}
		}
		return stack.isEmpty();
    }
}
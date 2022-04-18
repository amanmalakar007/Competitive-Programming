import java.math.BigInteger;

class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode curr = l1;
		String str1 = "", str2 = "";

		while (curr != null) {
			str1 = (curr.val) + str1;
			curr = curr.next;
		}

		curr = l2;

		while (curr != null) {
			str2 = (curr.val) + str2;
			curr = curr.next;
		}

		BigInteger num1 = new BigInteger(str1);
		BigInteger num2 = new BigInteger(str2);
		BigInteger sum = num1.add(num2);
		ListNode ans = new ListNode();
		curr = ans;

		BigInteger zero = BigInteger.valueOf(0);
		BigInteger ten = BigInteger.valueOf(10);

		if (sum.equals(zero)) {
			ans = new ListNode(0);
			return ans;
		}

		while (sum.compareTo(zero) == 1) {
			int digit = (sum.mod(ten)).intValue();
			ListNode nn = new ListNode(digit);
			if (sum.equals(zero))
				curr.next = null;
			else {
				curr.next = nn;
				curr = curr.next;
			}
			sum = sum.divide(ten);
		}
		return ans.next;
	}
}
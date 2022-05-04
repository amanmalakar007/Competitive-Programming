class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap <Integer,Integer> freqMap = new HashMap <Integer,Integer> ();
        int operations = 0;
        for (int i: nums) {
            int complement = k - i;
            if (freqMap.containsKey(complement)) {
                operations++;
                if (freqMap.get(complement) > 1)
                    freqMap.put(complement, freqMap.get(complement) - 1);
                else
                    freqMap.remove(complement);
            }
			else {
                freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
            }
        }
        return operations;
    }
}

/*
Algorithm:
Read every element from the input array.
Find its complement, (complement = targetSum - elementRead)
If complement exists in the map, means valid operation. (operations++)
Now, decrement the frequency of this complement in the map only if frequency > 1;
else, remove it completely.
return operations.
*/
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        TreeMap <Integer,Integer> map = new TreeMap <Integer,Integer> ();
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        TreeMap sortedMap = valueSort(map);
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = (int) sortedMap.lastKey();
            sortedMap.pollLastEntry();
        }
        return ans;
    }

    public static <K,V extends Comparable <V>> TreeMap <K,V> valueSort(final Map <K,V> map) {
        Comparator <K> valueComparator = new Comparator <K> () {
            public int compare(K k1, K k2) {
                int comp = map.get(k1).compareTo(map.get(k2));
                if (comp == 0)
                    return 1;
                return comp;
            }
        };
        TreeMap <K,V> sorted = new TreeMap <K,V> (valueComparator);
        sorted.putAll(map);
        return sorted;
    }
}
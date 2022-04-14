class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List <Integer> l1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List <Integer> l2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        if (l1.size() <= l2.size())
            return (mergeLists(l1, l2));
        else
            return (mergeLists(l2, l1));
    }

    private static double mergeLists(List <Integer> l1, List <Integer> l2) {
        for (Integer element: l1) {
            int pos = findPos(element, l2, 0, l2.size() - 1);
            if (pos >= l2.size())
                l2.add(element);
            else if (pos < l2.size())
                l2.add(pos, element);
        }
        int len = l2.size();
        if (len % 2 != 0)
            return (l2.get(len / 2));
        else
            return ((double)(l2.get(len / 2) + l2.get((len / 2) - 1)) / 2);
    }

    private static int findPos(Integer key, List <Integer> list, int low, int high) {
        int mid = low + (high - low) / 2;
        if (high >= low) {
            Integer midElem = Integer.valueOf(list.get(mid));
            if (key == midElem)
                return mid;
            else if (key > midElem)
                return findPos(key, list, mid + 1, high);
            else
                return findPos(key, list, low, mid - 1);
        }
        return mid;
    }
}
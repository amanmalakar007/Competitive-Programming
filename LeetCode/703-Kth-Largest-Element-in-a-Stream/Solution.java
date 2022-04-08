class KthLargest {
    int k;
    ArrayList <Integer> list = new ArrayList <Integer> ();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for (int i: nums) {
            this.list.add(i);
        }
    }

    public int add(int val) {
        this.list.add(val);
        Collections.sort(this.list, Collections.reverseOrder());
        System.out.println(list);
        int ret = this.list.get((this.k) - 1);
        return ret;
    }
}
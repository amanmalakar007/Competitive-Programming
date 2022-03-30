class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] countArr = new int[mat.length];
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    count++;
            }
            countArr[i] = count;
        }
        int[] slice = new int[k];
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int pos = 0;
            for (int j = countArr.length - 1; j >= 0; j--) {
                if (countArr[j] <= min) {
                    min = countArr[j];
                    pos = j;
                }
            }
            countArr[pos] = Integer.MAX_VALUE;
            slice[i] = pos;
        }
        return slice;
    }
}
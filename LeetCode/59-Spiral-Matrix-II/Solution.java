class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix  = new int[n][n];
        int start = 0;
        int end = n;
        int val = 1;
        int i = start, j = start;
        while (val<=n*n) {
            for(; j < end; j++)
                matrix[i][j] = val++;
            j--;
            i++;
            for(; i < end; i++)
                matrix[i][j] = val++;
            i--;
            j--;
            for(; j >= start; j--)
                matrix[i][j] = val++;
            j++;
            i--;
            start++;
            for(; i >= start; i--)
                matrix[i][j] = val++;
            i++;
            j++;
            end--;
        }
        return matrix;
    }
}
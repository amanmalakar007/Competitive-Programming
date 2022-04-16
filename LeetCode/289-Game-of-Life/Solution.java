//source: https://leetcode.com/problems/game-of-life/discuss/518079/In-place-Follow-up-question-solved-Most-performance-and-space-efficient-Solution

class Solution {
    public static final int[][] DIRC = {{1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}};


    public void gameOfLife(int[][] g) {
        int h = g.length;
        int w = g[0].length;
        
        // for (int i = 0; i < h; i++) System.out.println(Arrays.toString(g[i]));

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (g[i][j]%10 == 0) continue;

                for (int[] dir : DIRC) {
                    int nx = i + dir[0];
                    int ny = j + dir[1];
                    if (nx < 0 || nx >= h || ny < 0 || ny >= w) continue;
                    g[nx][ny] += 10;
                }
            }
        }
        // for (int i = 0; i < h; i++) System.out.println(Arrays.toString(g[i]));
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int old = g[i][j] % 10;
                int total = g[i][j] / 10;
                if (old == 1) {
                    if (total < 2) {
                        g[i][j] = 0;
                    } else if (total > 3) {
                        g[i][j] = 0;
                    } else {
                        g[i][j] = 1;
                    }
                } else if (old == 0) {
                    if (total == 3) {
                        g[i][j] = 1;
                    } else {
                        g[i][j] = 0;
                    }
                }
            }
        }

    }
}
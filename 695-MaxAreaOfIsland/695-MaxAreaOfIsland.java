// Last updated: 7/10/2026, 9:43:54 AM
class Solution {
    public int travel(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length ||
            c >= grid[0].length || grid[r][c] == 0)
            return 0;
        grid[r][c] = 0;
        return 1
            + travel(grid, r, c + 1)
            + travel(grid, r, c - 1)
            + travel(grid, r - 1, c)
            + travel(grid, r + 1, c);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, travel(grid, i, j));
                }
            }
        }
        return max;
    }
}
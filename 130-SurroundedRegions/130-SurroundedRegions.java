// Last updated: 7/10/2026, 9:46:37 AM
class Solution {
    public void solve(char[][] b) {
        int n = b.length, m = b[0].length;
        for (int i = 0; i < n; i++) {
            dfs(b, i, 0);
            dfs(b, i, m - 1);
        }
        for (int j = 0; j < m; j++) {
            dfs(b, 0, j);
            dfs(b, n - 1, j);
        }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                b[i][j] = b[i][j] == 'T' ? 'O' : 'X';
    }
    void dfs(char[][] b, int r, int c) {
        if (r < 0 || c < 0 || r >= b.length || c >= b[0].length || b[r][c] != 'O')
            return;
        b[r][c] = 'T';
        dfs(b, r + 1, c);
        dfs(b, r - 1, c);
        dfs(b, r, c + 1);
        dfs(b, r, c - 1);
    }
}

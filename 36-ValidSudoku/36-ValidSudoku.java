// Last updated: 7/10/2026, 9:48:57 AM
class Solution {

    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.' && !check(board, r, c))
                    return false;
            }
        }
        return true;
    }

    boolean check(char[][] board, int row, int col) {
        char val = board[row][col];

        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == val) return false;
            if (i != row && board[i][col] == val) return false;
        }

        int sr = (row / 3) * 3, sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if ((i != row || j != col) && board[i][j] == val)
                    return false;
            }
        }
        return true;
    }
}
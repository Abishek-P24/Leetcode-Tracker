// Last updated: 7/10/2026, 9:48:56 AM
class Solution {
    public void solveSudoku(char[][] b) {
        solve(b);
    }

    boolean solve(char[][] b) {
        for(int r=0;r<9;r++)
            for(int c=0;c<9;c++)
                if(b[r][c]=='.'){
                    for(char ch='1';ch<='9';ch++)
                        if(valid(b,r,c,ch)){
                            b[r][c]=ch;
                            if(solve(b)) return true;
                            b[r][c]='.';
                        }
                    return false;
                }
        return true;
    }

    boolean valid(char[][] b,int r,int c,char ch){
        for(int i=0;i<9;i++)
            if(b[r][i]==ch || b[i][c]==ch ||
               b[r/3*3+i/3][c/3*3+i%3]==ch)
                return false;
        return true;
    }
}
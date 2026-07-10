// Last updated: 7/10/2026, 9:43:08 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int i=0,j=0;
        int n=mat.length;
        for(int k=1;k<=n;k++){
            sum+=mat[i][j];
            i++;
            j++;
        }
        i=0;j=n-1;
        for(int k=1;k<=n;k++){
            if(i!=j) sum+=mat[i][j];
            i++;j--;
        }
        return sum;
    }
}
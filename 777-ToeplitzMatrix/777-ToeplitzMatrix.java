// Last updated: 7/10/2026, 9:43:51 AM
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[i].length-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]) return false;
            }
        }
        return true;
    }
}
// Last updated: 7/10/2026, 9:43:21 AM
class Solution {
    int[][] d={{1,0},{-1,0},{0,1},{0,-1}};
    public int closedIsland(int[][] g) {
        int n=g.length,m=g[0].length;
        for(int i=0;i<n;i++){
            dfs(g,i,0); dfs(g,i,m-1);
        }
        for(int j=0;j<m;j++){
            dfs(g,0,j); dfs(g,n-1,j);
        }
        int c=0;
        for(int i=1;i<n-1;i++)
            for(int j=1;j<m-1;j++)
                if(g[i][j]==0){
                    dfs(g,i,j);
                    c++;
                }
        return c;
    }
    void dfs(int[][] g,int r,int c){
        if(r<0||c<0||r>=g.length||c>=g[0].length||g[r][c]==1) return;
        g[r][c]=1;
        for(int[] x:d) dfs(g,r+x[0],c+x[1]);
    }
}
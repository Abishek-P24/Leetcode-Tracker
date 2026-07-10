// Last updated: 7/10/2026, 9:48:22 AM
class Solution {
    public int[][] merge(int[][] inp) {
        Arrays.sort(inp,(a,b) -> Integer.compare(a[0],b[0]));
        int k=0;
        for(int i=1;i<inp.length;i++){
            if(inp[k][1]>=inp[i][0]){
            inp[k][1]=Math.max(inp[i][1],inp[k][1]);

        }else{
            k++;
            inp[k]=inp[i];
        }

    }
    return Arrays.copyOfRange(inp,0,k+1);
}
}
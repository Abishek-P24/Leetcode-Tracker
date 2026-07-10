// Last updated: 7/10/2026, 9:43:28 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int a=0;
        int b=0;
        for(int pos : position){
            if(pos % 2==0){
                a++;
            }else{
                b++;
            }
            
        }
         return a<b?a:b;
    }
}
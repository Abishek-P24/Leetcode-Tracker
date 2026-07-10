// Last updated: 7/10/2026, 9:42:19 AM
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sd=0;
        int dd=0;
        for(int x:nums){
            if(x<10)
            sd+=x;
            else dd+=x;

        }
        return sd!=dd;
    }
    
}
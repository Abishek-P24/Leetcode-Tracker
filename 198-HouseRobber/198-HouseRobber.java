// Last updated: 7/10/2026, 9:45:35 AM
class Solution {
    public int rob(int[] nums) {
       int a=0,b=0,c=0;
       for(int i:nums){
        c=Math.max(a,b+i);
        b=a;
        a=c;
       } 
       return c;
    }
}
// Last updated: 7/10/2026, 9:44:49 AM
class Solution {
    public boolean isPowerOfFour(int n) {
        return(n>0 && ((n&(n-1))==0 && n%3==1));

    }
}
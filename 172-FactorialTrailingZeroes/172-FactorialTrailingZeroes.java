// Last updated: 7/10/2026, 9:46:11 AM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            count+=n/5;
            n=n/5;
        }
        return count;
    }
}
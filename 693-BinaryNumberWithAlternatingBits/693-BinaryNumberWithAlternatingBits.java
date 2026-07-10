// Last updated: 7/10/2026, 9:43:56 AM
class Solution {
    public boolean hasAlternatingBits(int n) {
        int x=(n^(n>>1));
        return (x&(x+1))==0?true:false;
    }
}
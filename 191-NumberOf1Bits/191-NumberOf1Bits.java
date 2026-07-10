// Last updated: 7/10/2026, 9:45:37 AM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            if((n&1)==1)
            count++;
            n>>=1;
        }
        return count;
     }
}






































































































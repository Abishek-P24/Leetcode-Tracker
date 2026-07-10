// Last updated: 7/10/2026, 9:42:47 AM
class Solution {
    public int countDigits(int num) {
        int copy=num;
        int count=0;
        while(num!=0){
            int d=num%10;
            if(copy%d==0) count++;
            num/=10;
        }
        return count;
    }
    
}
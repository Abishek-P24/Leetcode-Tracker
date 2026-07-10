// Last updated: 7/10/2026, 9:44:34 AM
class Solution {
public:
    int arrangeCoins(int n) {
       int row=1;
       while(n>=row){
        n=n-row;
        row++;
       } 
       return row-1;
    }
};
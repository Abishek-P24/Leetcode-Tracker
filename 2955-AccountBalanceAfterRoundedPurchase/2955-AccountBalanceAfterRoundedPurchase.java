// Last updated: 7/10/2026, 9:42:32 AM
class Solution {
    public int accountBalanceAfterPurchase(int pA) {
        if (pA%10<=4)
        return 100-(pA/10)*10;
        else
        return 100-((pA/10)+1)*10;
        
        
    }
}
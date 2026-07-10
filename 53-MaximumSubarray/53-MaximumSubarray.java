// Last updated: 7/10/2026, 9:48:24 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>maxSum)
            maxSum=currSum;
            if(currSum<0)
            currSum=0;
        }
        return maxSum;
    }
}
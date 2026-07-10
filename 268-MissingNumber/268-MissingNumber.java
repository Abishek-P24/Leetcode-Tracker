// Last updated: 7/10/2026, 9:44:54 AM
class Solution {
    public int missingNumber(int[] nums) {
     int result=nums.length;
     for(int i=0;i<nums.length;i++){
        result^=i^nums[i];
     }
     return result;
    }
}
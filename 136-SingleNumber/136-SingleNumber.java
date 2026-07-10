// Last updated: 7/10/2026, 9:46:32 AM
class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result ^=nums[i];
    }
    return result;
}
}
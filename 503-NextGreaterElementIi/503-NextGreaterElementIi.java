// Last updated: 7/10/2026, 9:44:27 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n=nums.length;
       int[] res=new int[n];
       for(int i=0;i<n;i++){
        res[i]=-1;
        for(int j=1;j<n;j++){
            if(nums[i]<nums[(i+j)%n]){
                res[i]=nums[(i+j)%n];
                break;
            }
        }
       } 
       return res;
    }
}
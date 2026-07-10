// Last updated: 7/10/2026, 9:44:29 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int [] ans=new int[n1];
        for(int i=0;i<n1;i++){
            int f=0;
            ans[i] = -1;
            for(int j=0;j<n2;j++){
                if(nums1[i] == nums2[j]){
                    f=1;
                    continue;

                }
                if(f==1 && nums2[j] > nums1[i]){
                    ans[i]=nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}
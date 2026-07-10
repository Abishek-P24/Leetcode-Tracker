// Last updated: 7/10/2026, 9:45:20 AM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        return Math.max(robber(nums, 0, n - 2),
                        robber(nums, 1, n - 1));
    }

    private int robber(int[] nums, int s, int e) {
        int prev = 0, curr = 0;

        for (int i = s; i <= e; i++) {
            int temp = curr;
            curr = Math.max(curr, prev + nums[i]);
            prev = temp;
        }

        return curr;
    }
}
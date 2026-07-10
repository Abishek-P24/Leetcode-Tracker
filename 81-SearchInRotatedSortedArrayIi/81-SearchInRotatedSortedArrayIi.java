// Last updated: 7/10/2026, 9:47:45 AM
class Solution {
    public boolean search(int[] nums, int target) {
        for (int n : nums)
            if (n == target)
                return true;
        return false;
    }
}
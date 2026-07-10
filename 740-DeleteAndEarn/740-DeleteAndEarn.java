// Last updated: 7/10/2026, 9:43:53 AM
class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int n : nums) max = Math.max(max, n);

        int[] points = new int[max + 1];
        for (int n : nums) points[n] += n;

        int prev = 0, curr = 0;
        for (int p : points) {
            int temp = curr;
            curr = Math.max(curr, prev + p);
            prev = temp;
        }

        return curr;
    }
}
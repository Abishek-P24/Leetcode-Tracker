// Last updated: 7/10/2026, 9:47:51 AM
class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {

        // Add current subset to result
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);          // Choose
            backtrack(i + 1, nums, current, result); // Explore
            current.remove(current.size() - 1);      // Backtrack
        }
    }
}
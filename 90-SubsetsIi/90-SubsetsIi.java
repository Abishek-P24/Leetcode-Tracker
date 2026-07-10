// Last updated: 7/10/2026, 9:47:33 AM
class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort to group duplicates

        backtrack(0, nums, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int start, int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {

            // Skip duplicate elements
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);                 // Choose
            backtrack(i + 1, nums, current, result); // Explore
            current.remove(current.size() - 1);   // Backtrack
        }
    }
}
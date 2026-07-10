// Last updated: 7/10/2026, 9:48:52 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(a, t, 0, new ArrayList<>(), ans);
        return ans;
    }

    void solve(int[] a, int t, int i, List<Integer> cur, List<List<Integer>> ans) {
        if (t == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        if (i == a.length || t < 0) return;

        cur.add(a[i]);
        solve(a, t - a[i], i, cur, ans);
        cur.remove(cur.size() - 1);

        solve(a, t, i + 1, cur, ans);
    }
}
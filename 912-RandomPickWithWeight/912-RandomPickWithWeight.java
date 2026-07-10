// Last updated: 7/10/2026, 9:43:46 AM
class Solution {
    int[] pre;
    int sum = 0;

    public Solution(int[] w) {
        pre = new int[w.length];
        for (int i = 0; i < w.length; i++)
            pre[i] = sum += w[i];
    }

    public int pickIndex() {
        int r = (int)(Math.random() * sum) + 1;
        int i = 0;
        while (pre[i] < r) i++;
        return i;
    }
}
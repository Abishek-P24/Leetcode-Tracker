// Last updated: 7/10/2026, 9:49:34 AM
class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        if (A.length > B.length) return findMedianSortedArrays(B, A);
        int m = A.length, n = B.length;
        int l = 0, r = m;
        while (l <= r) {
            int i = (l + r) / 2;
            int j = (m + n + 1) / 2 - i;
            int aL = (i == 0) ? Integer.MIN_VALUE : A[i - 1];
            int aR = (i == m) ? Integer.MAX_VALUE : A[i];
            int bL = (j == 0) ? Integer.MIN_VALUE : B[j - 1];
            int bR = (j == n) ? Integer.MAX_VALUE : B[j];
            if (aL <= bR && bL <= aR) {
                if ((m + n) % 2 == 0)
                    return (Math.max(aL, bL) + Math.min(aR, bR)) / 2.0;
                else
                    return Math.max(aL, bL);
            }
            else if (aL > bR) r = i - 1;
            else l = i + 1;
        }
        return 0;
    }
}
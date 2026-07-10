// Last updated: 7/10/2026, 9:44:32 AM
class Solution {
    public int hammingDistance(int x, int y) {
        int ham=x^y;
        return Integer.bitCount(ham);

    }
}
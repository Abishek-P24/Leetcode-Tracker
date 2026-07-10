// Last updated: 7/10/2026, 9:47:24 AM
class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') return 0;

        int prev2 = 1; // dp[i-2]
        int prev1 = 1; // dp[i-1]

        for (int i = 1; i < n; i++) {
            int current = 0;

            char cur = s.charAt(i);
            char prev = s.charAt(i - 1);

            // single digit decode (1 to 9)
            if (cur != '0') {
                current += prev1;
            }

            // two digit decode (10 to 26)
            int twoDigit = (prev - '0') * 10 + (cur - '0');
            if (twoDigit >= 10 && twoDigit <= 26) {
                current += prev2;
            }
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
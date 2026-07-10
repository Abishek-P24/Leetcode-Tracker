// Last updated: 7/10/2026, 9:43:30 AM
import java.util.*;

class Solution {

    public int method(String t1, String t2, int s1, int s2, int[][] dp) {

        if (s1 >= t1.length() || s2 >= t2.length())
            return 0;

        if (dp[s1][s2] != -1)
            return dp[s1][s2];

        if (t1.charAt(s1) == t2.charAt(s2))
            return dp[s1][s2] = 1 + method(t1, t2, s1 + 1, s2 + 1, dp);

        return dp[s1][s2] = Math.max(
                method(t1, t2, s1 + 1, s2, dp),
                method(t1, t2, s1, s2 + 1, dp)
        );
    }

    public int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m][n];

        for (int[] d : dp)
            Arrays.fill(d, -1);

        return method(text1, text2, 0, 0, dp);
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String text1 = "abcde";
        String text2 = "ace";

        System.out.println(obj.longestCommonSubsequence(text1, text2));
    }
}
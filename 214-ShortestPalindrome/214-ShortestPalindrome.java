// Last updated: 7/10/2026, 9:45:18 AM
class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if (s.startsWith(rev.substring(i)))
                return rev.substring(0, i) + s;
        }
        return s;
    }
}
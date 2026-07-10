// Last updated: 7/10/2026, 9:49:36 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int a=0;
        int b=0;
        int count=0;
        for(b=0;b<s.length();b++){
            while(set.contains(s.charAt(b))){
                set.remove(s.charAt(a));
                a++;
            }
            set.add(s.charAt(b));
            count=Math.max(count, (b-a+1));
        }
        return count;

    }
}
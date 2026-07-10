// Last updated: 7/10/2026, 9:46:16 AM
class Solution {
    public int titleToNumber(String s) {
       int res=0;
       for(int i=0;i<s.length();i++){
        res=res*26+s.charAt(i)-64;
       } 
       return res;
    }
}
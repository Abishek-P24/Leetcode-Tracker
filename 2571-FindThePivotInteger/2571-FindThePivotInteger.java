// Last updated: 7/10/2026, 9:42:49 AM
class Solution {
    public int pivotInteger(int n) {
      int total=(n*(n+1))/2;
      int s=(int)Math.sqrt(total);
      if((s*s)==total) return s;
      else return -1;
    }
}
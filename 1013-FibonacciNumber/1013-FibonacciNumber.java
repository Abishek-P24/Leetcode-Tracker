// Last updated: 7/10/2026, 9:43:39 AM
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}
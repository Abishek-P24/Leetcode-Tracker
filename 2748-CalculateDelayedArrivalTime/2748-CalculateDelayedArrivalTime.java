// Last updated: 7/10/2026, 9:42:42 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int n = arrivalTime+delayedTime;
        if(n<24)
        return n;
        else
        return n%24;
    }
}
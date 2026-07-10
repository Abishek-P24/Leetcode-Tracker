// Last updated: 7/10/2026, 9:42:37 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int h:hours){
            if(h>=target){
                count++;
            }
        }
        return count++;

    }
}
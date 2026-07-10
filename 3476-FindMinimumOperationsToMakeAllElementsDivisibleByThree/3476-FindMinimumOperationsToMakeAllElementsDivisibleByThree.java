// Last updated: 7/10/2026, 9:42:13 AM
import java.util.Scanner;
class Solution {
    public int minimumOperations(int[] nums) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int x:nums){
            if(x%3!=0){
                count++;
            }
        }
        return count++;
    }

}
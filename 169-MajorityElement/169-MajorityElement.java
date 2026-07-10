// Last updated: 7/10/2026, 9:46:20 AM
import java.util.Scanner;
class Solution {
    public int majorityElement(int[] nums) {
        Scanner ns=new Scanner (System.in);
        int a=0;
        int b=0;
        for( int num:nums){
            if(b==0){
                a=num;
            }
            if(num==a){
                b++;
            }
            else{
                b--;
            }
        }
        return a;
    }
}
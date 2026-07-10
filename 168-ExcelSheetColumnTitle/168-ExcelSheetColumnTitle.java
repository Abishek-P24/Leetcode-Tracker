// Last updated: 7/10/2026, 9:46:22 AM
class Solution {
    public String convertToTitle(int num) {
       StringBuffer ans=new StringBuffer();
       while(num>0){
        num--;
        ans.append( (char) ((num%26) + 'A') );
        num/=26;
       }  
       return ans.reverse().toString();
    }
}
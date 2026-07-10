// Last updated: 7/10/2026, 9:48:41 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> result=new ArrayList<>();
       bt(nums,new ArrayList<>(),result);
       return result; 
    }
    void bt(int[] nums,List<Integer> current,List<List<Integer>> result){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(current.contains(nums[i])){
                    continue;
                }
                current.add(nums[i]);
                bt(nums,current,result);
                current.remove(current.size()-1);
            }
        }
    }
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans=new ArrayList<>();
        sum(0,nums,new ArrayList<Integer>(),ans);
        return ans;
    }
    static void sum(int index,int[]nums,List<Integer>li,List<List<Integer>>ans){
        ans.add(new ArrayList<>(li));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]) continue;
                li.add(nums[i]);
                sum(i+1,nums,li,ans);
                li.remove(li.size()-1);
            
        }
    }
}
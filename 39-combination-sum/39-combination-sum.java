class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>>ans=new ArrayList<>();
     
         sum(0,new ArrayList<>(),target,candidates,ans);
        return ans ;
    }
    static void sum(int index,ArrayList<Integer>list,int target,int []candidates,List<List<Integer>>ans){
        if(index==candidates.length){
            if(target==0){
                ArrayList<Integer> arr = new ArrayList<>(list);
                ans.add(arr);
            }
            return;
        }
        if(candidates[index]<=target){
               list.add(candidates[index]);
            sum(index,list,target-candidates[index],candidates,ans);
       
        list.remove(list.size()-1);
        }
     
        sum(index+1,list,target,candidates,ans);
        
    }
}
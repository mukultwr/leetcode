class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>>ans=new ArrayList<>();
               function(0,new ArrayList<>(),nums,n,ans);
        return ans;
    }
    static void function(int index, List<Integer> li, int[] arr, int n,List<List<Integer>>ans){
        
        ans.add(new ArrayList<>(li));

        for(int i = index; i<arr.length; i++){
            if(i != index && arr[i] == arr[i-1]){continue;}
                li.add(arr[i]);
                function(i+1, li, arr, n,ans);
                li.remove(li.size()-1);
        }
    }
}
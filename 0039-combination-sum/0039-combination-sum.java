class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        solve(0,k,ans,new ArrayList<>(),arr,arr.length);
        return ans;
         
        
    }
    public static void solve(int index,int k,List<List<Integer>>ans,List<Integer>li, int [] arr,int n){
        if(index==n){
           if(k==0){
               ans.add(new ArrayList<>(li));
              

           }
           return ;
        }
        if(arr[index]<=k){
            li.add(arr[index]);
            solve(index,k-arr[index],ans,li,arr,n);
            li.remove(li.size()-1);
        }
        solve(index+1,k,ans,li,arr,n);



    }
}
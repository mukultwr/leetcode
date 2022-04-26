class Solution {
    public int maximumDifference(int[] nums) {
//                 int res=nums[1]-nums[0];
       
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 res=Math.max(res,nums[j]-nums[i]);
//             }
             
//         }
//          if(res<=0){
//             return -1;
//         }
//         return res;
        int minval=nums[0];
        int res=nums[1]-nums[0];
        for(int i=1;i<nums.length;i++){
            res=Math.max(res,nums[i]-minval);
            minval=Math.min(minval,nums[i]);
        }
         if(res<=0){
            return -1;
        }
        return res;
    }
}
class Solution {
//     public void moveZeroes(int[] nums) {
        
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//               for(int j=i+1;j<nums.length;j++){
//                   if(nums[j]!=0){
//                       int temp = nums[i];
//             nums[i] = nums[j];
//             nums[j] = temp;
           
//                   }
//               }
//             }
//         }
        
//     }
    public void moveZeroes(int[] nums) {

    int j = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
        }
    }
}

   
}
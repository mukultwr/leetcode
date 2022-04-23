class Solution {
    public int removeDuplicates(int[] arr) {
         // HashSet<Integer>set=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // return set.size();
        
        //approach 2
//         if(nums.length==0){
//             return 0;
//         }
//         int i=0;
//         for(int j=1;j<nums.length;j++){
//             if(nums[j]!=nums[i]){
//                 i++;
//                 nums[i]=nums[j];
                
//             }
            
//         }
//         return i+1;
//     }
        int n=arr.length;
        int []temp=new int [arr.length];
        temp[0]=arr[0];
        int res=1;
        for(int i=1;i<n;i++){
            if(temp[res-1]!=arr[i]){
                temp[res]=arr[i];
                res++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        return res;
}
}
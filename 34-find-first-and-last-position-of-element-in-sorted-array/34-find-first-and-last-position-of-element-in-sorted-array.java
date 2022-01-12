class Solution {
    public int[] searchRange(int[] nums, int target) {
              
        int fi = first(nums,target);
        int li=last(nums,target);
        int[] ans = {fi,li};
        return ans;
    }
    
    static int first(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        int result=-1;
        while(start<=end){
             int mid=(start+end)/2;
            
            if(target==nums[mid]){
                result=mid;
                end=mid-1;
                
                
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    static int last(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        int result=-1;
        while(start<=end){
             int mid=(start+end)/2;
            
            if(target==nums[mid]){
                result=mid;
                start=mid+1;
                
                
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }
    
}
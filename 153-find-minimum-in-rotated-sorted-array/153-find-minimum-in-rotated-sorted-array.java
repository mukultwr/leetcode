class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int start=0;
        int end=nums.length-1;
        int n=nums.length;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            int next=(mid+1)% n;
            int pre=(mid+n-1)%n;
            if(nums[mid]<=nums[next]&&nums[mid]<=nums[pre]){
                return nums[mid];
            }
            
            if(nums[start]<=nums[mid] && nums[mid]<=nums[end]){
                return nums[start]; 
                
            }
            else{
                if(nums[mid]>=nums[start]){
                    start = mid+1;
                }
                else if(nums[mid]<=nums[end]){
                    end = mid-1;
                }
            } 
        }
        return -1;
        
    }
}
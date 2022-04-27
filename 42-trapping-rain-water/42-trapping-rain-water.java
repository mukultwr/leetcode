class Solution {
    public int trap(int[]arr) {
        int n=arr.length;
        int ans=0;
        for(int i=1;i<n-1;i++){
            int lMax=arr[i];
            for(int j=i;j>=0;j--){
                lMax=Math.max(lMax,arr[j]);
            }
            int rMax=arr[i];
            for(int j=i+1;j<n;j++){
                rMax=Math.max(rMax,arr[j]);
            }
            ans+=Math.min(lMax,rMax)-arr[i];
        }
        return ans;
    
    }
}